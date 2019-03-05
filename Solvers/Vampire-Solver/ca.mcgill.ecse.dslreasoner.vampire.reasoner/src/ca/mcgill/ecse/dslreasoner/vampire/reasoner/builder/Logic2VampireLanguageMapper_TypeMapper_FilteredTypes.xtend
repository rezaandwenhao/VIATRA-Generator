package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.ArrayList
import java.util.Collection

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.List
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction

class Logic2VampireLanguageMapper_TypeMapper_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapper {
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE

	new() {
		LogicproblemPackage.eINSTANCE.class
	}

	override transformTypes(Collection<Type> types, Collection<DefinedElement> elements,
		Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace) {
		val typeTrace = new Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes
		trace.typeMapperTrace = typeTrace

		// The variable
		val VLSVariable variable = createVLSVariable => [it.name = "A"]

		// 1. Each type (class) is a predicate with a single variable as input
		for (type : types) {
			val typePred = createVLSFunction => [
				it.constant = support.toIDMultiple("t", type.name)
				it.terms += support.duplicate(variable)
			]
			typeTrace.type2Predicate.put(type, typePred)
		}

		// 2. Map each ENUM type definition to fof formula
		for (type : types.filter(TypeDefinition)) {
			val List<VLSFunction> orElems = newArrayList
			for (e : type.elements) {
				val enumElemPred = createVLSFunction => [
					it.constant = support.toIDMultiple("e", e.name, type.name)
					it.terms += support.duplicate(variable)
				]
				typeTrace.element2Predicate.put(e, enumElemPred)
				orElems.add(enumElemPred)
			}

			val res = createVLSFofFormula => [
				it.name = support.toIDMultiple("typeDef", type.name)
				// below is temporary solution
				it.fofRole = "axiom"
				it.fofFormula = createVLSUniversalQuantifier => [
					it.variables += support.duplicate(variable)
					it.operand = createVLSEquivalent => [
//						it.left = createVLSFunction => [
//							it.constant = type.lookup(typeTrace.type2Predicate).constant
//							it.terms += createVLSVariable => [it.name = "A"]
//						]
						it.left = type.lookup(typeTrace.type2Predicate)

						it.right = support.unfoldOr(orElems)

					// TEMPPPPPPP
//						it.right = support.unfoldOr(type.elements.map [e |
//							
//							createVLSEquality => [
//								it.left = support.duplicate(variable)
//								it.right = createVLSDoubleQuote => [
//									it.value = "\"a" + e.name + "\""
//								]
//							]
//						])
					// END TEMPPPPP
					]
				]

			]
			trace.specification.formulas += res
		}
		
		//HIERARCHY HANDLER
		
		
		// 3. For each non-abstract type, create an and sequence containing all typedeclaration predicates
		// and store in a map
		for (t1 : types.filter[!isIsAbstract]) {
			for (t2 : types) {
				// possible improvement: check all supertypes and decide if negated or not based on negations/not negations of supertypes
				if (t1 == t2 || dfsSupertypeCheck(t1, t2)) {
					typeTrace.type2PossibleNot.put(t2, createVLSFunction => [
						it.constant = t2.lookup(typeTrace.type2Predicate).constant
						it.terms += support.duplicate(variable)
					])
				} else {
					typeTrace.type2PossibleNot.put(t2, createVLSUnaryNegation => [
						it.operand = createVLSFunction => [
							it.constant = t2.lookup(typeTrace.type2Predicate).constant
							it.terms += support.duplicate(variable)
						]
					])
				}
//				typeTrace.type2PossibleNot.put(type2, type2.lookup(typeTrace.type2Predicate))
			}
			typeTrace.type2And.put(t1, support.unfoldAnd(new ArrayList<VLSTerm>(typeTrace.type2PossibleNot.values)))
//			typeTrace.type2And.put(type, type.lookup(typeTrace.type2Predicate) )
			typeTrace.type2PossibleNot.clear
		}

		// 5. create fof function that is an or with all the elements in map
		
		
		
		
		val hierarch = createVLSFofFormula => [
			it.name = "hierarchyHandler"
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += support.duplicate(variable)
				it.operand = createVLSEquivalent => [
					it.left = support.topLevelTypeFunc
					it.right = support.unfoldOr(new ArrayList<VLSTerm>(typeTrace.type2And.values))
				]
			]
		]

		trace.specification.formulas += hierarch

	}

	def boolean dfsSupertypeCheck(Type type, Type type2) {
		// There is surely a better way to do this
		if (type.supertypes.isEmpty)
			return false
		else {
			if (type.supertypes.contains(type2))
				return true
			else {
				for (supertype : type.supertypes) {
					if(dfsSupertypeCheck(supertype, type2)) return true
				}
			}
		}
	}

	override transformTypeReference(Type referred, Logic2VampireLanguageMapper mapper,
		Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getUndefinedSupertype(Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getUndefinedSupertypeScope(int undefinedScope, Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override transformReference(DefinedElement referred, Logic2VampireLanguageMapperTrace trace) {
		createVLSDoubleQuote => [
			it.value = "\"a" + referred.name + "\""
		]
	}

	override getTypeInterpreter() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
