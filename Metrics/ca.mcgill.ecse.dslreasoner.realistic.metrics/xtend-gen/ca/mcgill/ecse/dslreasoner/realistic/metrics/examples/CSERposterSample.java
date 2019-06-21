package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2GmlOLD;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import linkedList.LinkedListPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simpleStatechart.SimpleStatechartPackage;

@SuppressWarnings("all")
public class CSERposterSample {
  private final static InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private final static PartialInterpretation2Gml partialVisualizer = new PartialInterpretation2Gml();
  
  private final static Neighbourhood2GmlOLD neighbourhoodVisualizer = new Neighbourhood2GmlOLD();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  private final static int depth = 1;
  
  private final static String REALISTIC = "simpleSCRealistic";
  
  private final static String IRREALISTIC = "simpleSCIrrealistic";
  
  public static void main(final String[] args) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      YakindummPackage.eINSTANCE.eClass();
      LinkedListPackage.eINSTANCE.eClass();
      SimpleStatechartPackage.eINSTANCE.eClass();
      ReteEngine.class.getClass();
      final String outputs = "outputs";
      final String instModName = "sampleList";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("resources");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder.toString(), "");
      final EObject model = workspace.<EObject>readModel(EObject.class, (instModName + ".xmi"));
      final EPackage pckg = model.eClass().getEPackage();
      List<EClass> _list = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
      Set<EClass> _emptySet = Collections.<EClass>emptySet();
      List<EEnum> _list_1 = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
      final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
        return it.getELiterals();
      };
      List<EEnumLiteral> _list_2 = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(IterableExtensions.<EEnum, EList<EEnumLiteral>>map(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class), _function)));
      final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
        return it.getEReferences();
      };
      List<EReference> _list_3 = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(IterableExtensions.<EClass, EList<EReference>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_1)));
      final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
        return it.getEAttributes();
      };
      List<EAttribute> _list_4 = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(IterableExtensions.<EClass, EList<EAttribute>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_2)));
      final EcoreMetamodelDescriptor metamodel = new EcoreMetamodelDescriptor(_list, _emptySet, 
        false, _list_1, _list_2, _list_3, _list_4);
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = CSERposterSample.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      final PartialInterpretation partialModelOutput = CSERposterSample.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), 
        false);
      final PrintWriter writer = new PrintWriter((((((outputs + "/") + instModName) + "/") + instModName) + "MODEL.gml"));
      writer.print(CSERposterSample.partialVisualizer.transform(partialModelOutput));
      writer.close();
      final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> hood = CSERposterSample.neighbourhoodComputer.createRepresentation(partialModelOutput, CSERposterSample.depth, Integer.MAX_VALUE, 
        Integer.MAX_VALUE);
      final PrintWriter w2 = new PrintWriter(((((((outputs + "/") + instModName) + "/") + instModName) + Integer.valueOf(CSERposterSample.depth)) + "NEIGHBOURHOOD.gml"));
      w2.print(CSERposterSample.neighbourhoodVisualizer.transform(hood, partialModelOutput));
      w2.close();
      final PrintWriter w3 = new PrintWriter(((((((outputs + "/") + instModName) + "/") + instModName) + Integer.valueOf(CSERposterSample.depth)) + "SHAPE.txt"));
      final GraphShape<Object, Object> y = CSERposterSample.neighbouhood2ShapeGraph.createShapeGraph(hood, partialModelOutput);
      List<GraphNodeDescriptorGND> _nodes = y.getNodes();
      for (final GraphNodeDescriptorGND node : _nodes) {
        {
          w3.println("----------------------");
          w3.println("NEW NODE");
          if ((CSERposterSample.depth == 1)) {
            AbstractNodeDescriptor _correspondingAND = node.getCorrespondingAND();
            Object _previousRepresentation = ((FurtherNodeDescriptor) _correspondingAND).getPreviousRepresentation();
            Set<String> _types = ((LocalNodeDescriptor) _previousRepresentation).getTypes();
            String _plus = ("   -node type  : " + _types);
            w3.println(_plus);
          } else {
            AbstractNodeDescriptor _correspondingAND_1 = node.getCorrespondingAND();
            Set<String> _types_1 = ((LocalNodeDescriptor) _correspondingAND_1).getTypes();
            String _plus_1 = ("   -node type  : " + _types_1);
            w3.println(_plus_1);
          }
          w3.println("   -Incoming Relations:");
          List<IncomingRelationGND> _incomingEdges = node.getIncomingEdges();
          for (final IncomingRelationGND inRel : _incomingEdges) {
            {
              w3.println("       -----------------");
              w3.println("       -IN RELATION:");
              String _type = inRel.getType();
              String _plus_2 = ("              -type    : " + _type);
              w3.println(_plus_2);
              if ((CSERposterSample.depth == 1)) {
                AbstractNodeDescriptor _correspondingAND_2 = inRel.getFrom().getCorrespondingAND();
                Object _previousRepresentation_1 = ((FurtherNodeDescriptor) _correspondingAND_2).getPreviousRepresentation();
                Set<String> _types_2 = ((LocalNodeDescriptor) _previousRepresentation_1).getTypes();
                String _plus_3 = ("              -from    : " + _types_2);
                w3.println(_plus_3);
              } else {
                AbstractNodeDescriptor _correspondingAND_3 = inRel.getFrom().getCorrespondingAND();
                Set<String> _types_3 = ((LocalNodeDescriptor) _correspondingAND_3).getTypes();
                String _plus_4 = ("              -from    : " + _types_3);
                w3.println(_plus_4);
              }
              List<Integer> _sourceDistrib = inRel.getSourceDistrib();
              String _plus_5 = ("              -srcDis  : " + _sourceDistrib);
              w3.println(_plus_5);
              List<Integer> _targetDistrib = inRel.getTargetDistrib();
              String _plus_6 = ("              -trgDis  : " + _targetDistrib);
              w3.println(_plus_6);
            }
          }
          w3.println();
          w3.println("    -Outgoing Relations:");
          List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
          for (final OutgoingRelationGND outRel : _outgoingEdges) {
            {
              w3.println("       -----------------");
              w3.println("       -OUT RELATION:");
              String _type = outRel.getType();
              String _plus_2 = ("              -type    : " + _type);
              w3.println(_plus_2);
              if ((CSERposterSample.depth == 1)) {
                AbstractNodeDescriptor _correspondingAND_2 = outRel.getTo().getCorrespondingAND();
                Object _previousRepresentation_1 = ((FurtherNodeDescriptor) _correspondingAND_2).getPreviousRepresentation();
                Set<String> _types_2 = ((LocalNodeDescriptor) _previousRepresentation_1).getTypes();
                String _plus_3 = ("              -to      : " + _types_2);
                w3.println(_plus_3);
              } else {
                AbstractNodeDescriptor _correspondingAND_3 = outRel.getTo().getCorrespondingAND();
                Set<String> _types_3 = ((LocalNodeDescriptor) _correspondingAND_3).getTypes();
                String _plus_4 = ("              -to      : " + _types_3);
                w3.println(_plus_4);
              }
              List<Integer> _sourceDistrib = outRel.getSourceDistrib();
              String _plus_5 = ("              -srcDis  : " + _sourceDistrib);
              w3.println(_plus_5);
              List<Integer> _targetDistrib = outRel.getTargetDistrib();
              String _plus_6 = ("              -trgDis  : " + _targetDistrib);
              w3.println(_plus_6);
            }
          }
        }
      }
      w3.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
