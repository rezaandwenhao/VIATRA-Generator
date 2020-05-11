package run

import Taxation.TaxationPackage
import familytree.FamilytreePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.PrintWriter
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.Date
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.TreeSet
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import queries.Case_study_A
import queries.FamilyTreeConstraints

class GeneratePledgeModels {
static val SIZE_LB = 20
static val SIZE_UB = 20
static val SIZE_MUL = 1
static val SIZE_INC = 5

static var REPS = 1
static val RUNTIME = 600

static val DOMAIN = "FamilyTree" // "FamilyTree", "Taxation"
static val QUERIES = false
static val INDIV_WRT = true
static val GLOBAL_WRT = true
static val q2t = if(QUERIES) "Y" else "N"

def static void main(String[] args) {
	(new EMFPatternLanguageStandaloneSetup).createInjectorAndDoEMFRegistration
	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("logicproblem", new XMIResourceFactoryImpl)
	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("partialmodel", new XMIResourceFactoryImpl)
	ReteEngine.getClass
	val Ecore2Logic ecore2Logic = new Ecore2Logic
	val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
	val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
	val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

	// Workspace setup
	val Date date = new Date(System.currentTimeMillis)
	val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
	val formattedDate = format.format(date)

	val inputs = new FileSystemWorkspace('''inputs/''', "")
	val dataws = new FileSystemWorkspace('''output/''', "")
	val modelsws = new FileSystemWorkspace('''output/''' + formattedDate + '''/models/''', "")
	val workspace = new FileSystemWorkspace('''output/''' + formattedDate + '''/''', "")
	val debug = new FileSystemWorkspace('''output/''' + DOMAIN + "-" + formattedDate + '''/debug/''', "")
	workspace.initAndClear
	modelsws.initAndClear

	println("Input and output workspaces are created")

	// //////////////////////////
	// DOMAIN
	var EcoreMetamodelDescriptor metamodel = null
	var EList<EObject> partialModel = null
	var ViatraQuerySetDescriptor queries = null
	switch DOMAIN {
		case "Taxation": {
			metamodel = loadMetamodel(TaxationPackage.eINSTANCE)
			partialModel = loadPartialModel(inputs, "Household.xmi")
//				queries = loadQueries(metamodel, Case_study_A.instance)
		}
		case "FamilyTree": {
			metamodel = loadMetamodel(FamilytreePackage.eINSTANCE)
			partialModel = loadPartialModel(inputs, "FamilyTree.xmi")
//			queries = loadQueries(metamodel, FamilyTreeConstraints.instance)
		}
		default: {
			System.err.println("Unsupported Domain")
			throw new Exception
		}
	}
	println("DSL loaded")

	// /////////////////////////
	// Prepare Problem
	val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
	var problem = modelGenerationProblem.output
	val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
	problem = modelExtensionProblem.output
	if (QUERIES) {
		val validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem,
			new Viatra2LogicConfiguration)
		problem = validModelExtensionProblem.output
	}
	// debug.writeModel(problem, "problem.logicproblem")
	println("Problem created")
	// /////////////////////////
	// BEGIN RUN
	var PrintWriter global_writer = null
	val header = "domain, queries?,size,model?,timeout,measuredTime,TransformatonTime,SolverTime\n"
	if (GLOBAL_WRT) {
		global_writer = new PrintWriter(
			workspace.workspaceURI + "//_" + DOMAIN + SIZE_LB + "to" + SIZE_UB + "x" + REPS + "q" + q2t + "-" +
				formattedDate + ".csv")
		global_writer.append(header)
	}

	var NEXT_INC = SIZE_INC
	for (var size = SIZE_LB; size <= SIZE_UB; size += NEXT_INC) {
		NEXT_INC *= SIZE_MUL

		var PrintWriter indiv_writer = null
		if (INDIV_WRT) {
			indiv_writer = new PrintWriter( // TODO
			workspace.workspaceURI + "//__" + DOMAIN + "Sz" + size + "x" + REPS + "q" + q2t + "-" + formattedDate +
				".csv")
			indiv_writer.append(header)
		}

		println()
		println("DOMAIN: " + DOMAIN + ", SIZE=" + size)

		for (var i = 0; i < REPS; i++) {

				print("<<Run number " + i + ">> : ")

				var ViatraReasoner reasoner = new ViatraReasoner

				// /////////////////////////////////////////////////////
				// Define Config File	
				val knownIntegers = new TreeSet<Integer>
				knownIntegers.addAll(0, 10, 20, 30, 40, 50)

				val knownReals = new TreeSet<BigDecimal>
				knownReals.addAll(new BigDecimal("0.0"))

				val knownStrings = new TreeSet<String>
				knownStrings.addAll("r0", "r1", "r2", "r3", "r4", "r5", "r6")

				val curSize = size
				val solverConfig = new ViatraReasonerConfiguration => [
					it.documentationLevel = DocumentationLevel::NONE
//					it.debugCongiguration = new DebugConfiguration => [logging = true]
					it.runtimeLimit = RUNTIME
					// it.typeScopes.maxNewElements = SIZE
					it.typeScopes.minNewElements = curSize

//					if(!knownIntegers.isEmpty) it.typeScopes.knownIntegers = knownIntegers
					if(!knownReals.isEmpty) it.typeScopes.knownReals = knownReals
				// if(!knownStrings.isEmpty) it.typeScopes.knownStrings = knownStrings
				]

				val startTime = System.currentTimeMillis
				var solution = reasoner.solve(problem, solverConfig, debug)
				val measuredTime = System.currentTimeMillis - startTime

				print("<<END")
				
				val toAddtoCSV = DOMAIN + "," + QUERIES + "," + size + "," + (solution.class == ModelResultImpl).toString + 
					"," + RUNTIME + "," + measuredTime / 1000.0 + "," + solution.statistics.transformationTime / 1000.0 + 
					"," + solution.statistics.solverTime / 1000.0 + "\n"

		if (GLOBAL_WRT) global_writer.append(toAddtoCSV)
//		{
//			global_writer.append(DOMAIN + ",")
//			global_writer.append(QUERIES + ",")
//			global_writer.append(size + ",")
//			global_writer.append((solution.class == ModelResultImpl).toString + ",")
//			global_writer.append(RUNTIME + ",")
//			global_writer.append(measuredTime / 1000.0 + ",")
//
//			global_writer.append(solution.statistics.transformationTime / 1000.0 + ",")
//			global_writer.append(solution.statistics.solverTime / 1000.0 + "")
//			global_writer.append("\n")
//		}
		if (INDIV_WRT) indiv_writer.append(toAddtoCSV)
//		{
//			indiv_writer.append(DOMAIN + ",")
//			indiv_writer.append(QUERIES + ",")
//			indiv_writer.append(size + ",")
//			indiv_writer.append((solution.class == ModelResultImpl).toString + ",")
//			global_writer.append(RUNTIME + ",")
//			indiv_writer.append(measuredTime / 1000.0 + ",")
//
//			indiv_writer.append(solution.statistics.transformationTime / 1000.0 + ",")
//			indiv_writer.append(solution.statistics.solverTime / 1000.0 + "")
//			indiv_writer.append("\n")
//		}

		println("->" + measuredTime / 1000.0 + "s")

//				solution.writeStats(totalTime, solverConfig)
		try {
			if (solution instanceof ModelResult) {
				solution.writeInterpretation(logic2Ecore, modelsws, size + "_" + i, reasoner, modelGenerationProblem)
				println(" (XMI Success)")
			}
		} catch (Exception e) {
			System.err.println(" (XMI Error)" + e.message)
		}

		try {
			if (solution instanceof ModelResult) {
				solution.writeRepresentation(modelsws, size + "_" + i)
				println(" (VIZ Success) >>")
			}
		} catch (Exception e) {
			System.err.println(" (VIZ Error)" + e.message + ">>")
		}

		println()
		// Run Garbage Collector
		val Runtime r = Runtime.getRuntime();
		r.gc();
		r.gc();
		r.gc();
		Thread.sleep(3000)
	}
	if(INDIV_WRT) indiv_writer.close
}
if(GLOBAL_WRT) global_writer.close
	}

	def

static Map<Type, Integer> getTypeMap(Map<Class, Integer> classMap, EcoreMetamodelDescriptor metamodel,
		Ecore2Logic e2l, Ecore2Logic_Trace trace) {
		val typeMap = new HashMap<Type, Integer>
		val listMap = metamodel.classes.toMap[s|s.name]

		for (Class  elem : classMap.keySet) {
			typeMap.put(e2l.TypeofEClass(
				trace,
				listMap.get(elem.simpleName)
			), classMap.get(elem))
		}
		return typeMap
	}

	def

static loadMetamodel(EPackage pckg) {
		val List<EClass> classes = pckg.getEClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.getEClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[getELiterals].flatten.toList
		val List<EReference> references = classes.map[getEReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[getEAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	def

static loadPartialModel(ReasonerWorkspace inputs, String path) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl())
		inputs.readModel(EObject, path).eResource.contents
//		inputs.readModel(EObject,"FamInstance.xmi").eResource.allContents.toList
	}

	def

static loadQueries(EcoreMetamodelDescriptor metamodel, IQueryGroup i) {
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = emptyMap
		// NO DERIVED FEATURES
//		val derivedFeatures = new LinkedHashMap
//		derivedFeatures.put(i.type,metamodel.attributes.filter[it.name == "type"].head)
//		derivedFeatures.put(i.model,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}

	def

static writeInterpretation(LogicResult solution, Logic2Ecore logic2Ecore, ReasonerWorkspace workspace,
		String id, ViatraReasoner reasoner, TracedOutput<LogicProblem, Ecore2Logic_Trace> mgProb) {
		val interpretations = reasoner.getInterpretations(solution as ModelResult)
		for (interpIndex : 0 ..< interpretations.size) {
//				val extension b = new LogicStructureBuilder
//				val extension a = new LogicProblemBuilder
			val interpretation = interpretations.get(interpIndex)
			val model = logic2Ecore.transformInterpretation(interpretation, mgProb.trace)
//			println(model)
			workspace.writeModel(model, '''sol-«id»_«interpIndex».xmi''')
		}
	}

	def

static writeRepresentation(LogicResult solution, ReasonerWorkspace workspace, String id) {
		val representations = solution.representation
		for (representationIndex : 0 ..< representations.size) {
			val representation = representations.get(representationIndex)
			if (representation instanceof PartialInterpretation) {
				val gml = (new PartialInterpretation2Gml).transform(representation)
				workspace.writeText('''sol-«id»_«representationIndex».gml''', gml)

				val png = (new GraphvizVisualiser).visualiseConcretization(representation)
//				println(png)
				png.writeToFile(workspace, '''sol-«id»_«representationIndex».png''')

//				workspace.writeModel(representation, '''solution«representationIndex».partialintrpretation''')
			} else {
				workspace.writeText('''sol-«representationIndex».txt''', representation.toString)
			}
		}
	}

	def

static writeStats(LogicResult solution, long time, ViatraReasonerConfiguration config) {
		val stats = solution.statistics
		println("  Statistics:")
//		for (e : stats.entries.filter[name.substring(0, 9) == "_Solution"]) {
//			println("    " + e.name + ": " + (e as IntStatisticEntry).value + " ms")
//		}
		println(
			"    #new nodes    : [" + config.typeScopes.minNewElements + ".." +
				(if(config.typeScopes.maxNewElements == 2147483647) "*" else config.typeScopes.maxNewElements) + "]")
		println("    \"solve\" time: " + time as double / 1000 + " s")

//		println("<<End Statistics>>")
	}
}
