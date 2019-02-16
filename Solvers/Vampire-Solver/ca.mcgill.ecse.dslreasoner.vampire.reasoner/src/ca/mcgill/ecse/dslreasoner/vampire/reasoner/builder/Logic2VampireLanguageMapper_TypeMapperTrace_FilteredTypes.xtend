package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquality
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map

class Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapperTrace{
	
//	public var VLSFofFormula objectSuperClass
	public val Map<Type, VLSFunction> type2Predicate = new HashMap;
	public val Map<DefinedElement, VLSEquality> definedElement2Declaration = new HashMap //Not Yet Used
	public val Map<Type, VLSTerm> type2PossibleNot = new HashMap
	public val Map<Type, VLSTerm> type2And = new HashMap

}