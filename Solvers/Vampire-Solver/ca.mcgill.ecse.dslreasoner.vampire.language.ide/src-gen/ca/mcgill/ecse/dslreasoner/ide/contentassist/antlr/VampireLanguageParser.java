/*
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.ide.contentassist.antlr;

import ca.mcgill.ecse.dslreasoner.ide.contentassist.antlr.internal.InternalVampireLanguageParser;
import ca.mcgill.ecse.dslreasoner.services.VampireLanguageGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VampireLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VampireLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VampireLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVampireModelAccess().getAlternatives(), "rule__VampireModel__Alternatives");
			builder.put(grammarAccess.getVLSConfirmationsAccess().getAlternatives(), "rule__VLSConfirmations__Alternatives");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getNameAlternatives_2_0(), "rule__VLSFofFormula__NameAlternatives_2_0");
			builder.put(grammarAccess.getVLSTffNameAccess().getAlternatives(), "rule__VLSTffName__Alternatives");
			builder.put(grammarAccess.getVLSTffDeclPredAccess().getAlternatives(), "rule__VLSTffDeclPred__Alternatives");
			builder.put(grammarAccess.getVLSRoleAccess().getAlternatives(), "rule__VLSRole__Alternatives");
			builder.put(grammarAccess.getVLSAnnotationAccess().getNameAlternatives_1_0(), "rule__VLSAnnotation__NameAlternatives_1_0");
			builder.put(grammarAccess.getVLSTffTermAccess().getAlternatives(), "rule__VLSTffTerm__Alternatives");
			builder.put(grammarAccess.getVLSDeclarationAccess().getAlternatives(), "rule__VLSDeclaration__Alternatives");
			builder.put(grammarAccess.getVLSBinaryAccess().getAlternatives_1(), "rule__VLSBinary__Alternatives_1");
			builder.put(grammarAccess.getVLSBinaryAccess().getAlternatives_1_0_0(), "rule__VLSBinary__Alternatives_1_0_0");
			builder.put(grammarAccess.getVLSUnitaryFormulaAccess().getAlternatives(), "rule__VLSUnitaryFormula__Alternatives");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_2_0(), "rule__VLSUniversalQuantifier__VariablesAlternatives_1_2_0");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAlternatives_1_3_1_0(), "rule__VLSUniversalQuantifier__VariablesAlternatives_1_3_1_0");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_2_0(), "rule__VLSExistentialQuantifier__VariablesAlternatives_1_2_0");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAlternatives_1_3_1_0(), "rule__VLSExistentialQuantifier__VariablesAlternatives_1_3_1_0");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getAlternatives_1_0(), "rule__VLSUnaryInfix__Alternatives_1_0");
			builder.put(grammarAccess.getVLSAtomicAccess().getAlternatives(), "rule__VLSAtomic__Alternatives");
			builder.put(grammarAccess.getVLSAtomicConstantAccess().getAlternatives(), "rule__VLSAtomicConstant__Alternatives");
			builder.put(grammarAccess.getVLSAtomicConstantAccess().getNameAlternatives_0_1_0(), "rule__VLSAtomicConstant__NameAlternatives_0_1_0");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getAlternatives(), "rule__VLSAtomicFunction__Alternatives");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getConstantAlternatives_0_1_0(), "rule__VLSAtomicFunction__ConstantAlternatives_0_1_0");
			builder.put(grammarAccess.getVLSFofTermAccess().getAlternatives(), "rule__VLSFofTerm__Alternatives");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAlternatives_0_0(), "rule__VLSFunctionAsTerm__FunctorAlternatives_0_0");
			builder.put(grammarAccess.getVLSDefinedTermAccess().getAlternatives(), "rule__VLSDefinedTerm__Alternatives");
			builder.put(grammarAccess.getVLSConfirmationsAccess().getGroup_0(), "rule__VLSConfirmations__Group_0__0");
			builder.put(grammarAccess.getVLSConfirmationsAccess().getGroup_1(), "rule__VLSConfirmations__Group_1__0");
			builder.put(grammarAccess.getVLSConfirmationsAccess().getGroup_2(), "rule__VLSConfirmations__Group_2__0");
			builder.put(grammarAccess.getVLSConfirmationsAccess().getGroup_3(), "rule__VLSConfirmations__Group_3__0");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getGroup(), "rule__VLSFofFormula__Group__0");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getGroup_7(), "rule__VLSFofFormula__Group_7__0");
			builder.put(grammarAccess.getVLSTffFormulaAccess().getGroup(), "rule__VLSTffFormula__Group__0");
			builder.put(grammarAccess.getVLSTffFormulaAccess().getGroup_7(), "rule__VLSTffFormula__Group_7__0");
			builder.put(grammarAccess.getVLSTffDeclPredAccess().getGroup_0(), "rule__VLSTffDeclPred__Group_0__0");
			builder.put(grammarAccess.getVLSAnnotationAccess().getGroup(), "rule__VLSAnnotation__Group__0");
			builder.put(grammarAccess.getVLSAnnotationAccess().getGroup_2(), "rule__VLSAnnotation__Group_2__0");
			builder.put(grammarAccess.getVLSAnnotationTermsAccess().getGroup(), "rule__VLSAnnotationTerms__Group__0");
			builder.put(grammarAccess.getVLSAnnotationTermsAccess().getGroup_1(), "rule__VLSAnnotationTerms__Group_1__0");
			builder.put(grammarAccess.getVLSOtherDeclarationAccess().getGroup(), "rule__VLSOtherDeclaration__Group__0");
			builder.put(grammarAccess.getVLSVariableDeclarationAccess().getGroup(), "rule__VLSVariableDeclaration__Group__0");
			builder.put(grammarAccess.getVLSTypeDefAccess().getGroup(), "rule__VLSTypeDef__Group__0");
			builder.put(grammarAccess.getVLSTypeDefAccess().getGroup_1(), "rule__VLSTypeDef__Group_1__0");
			builder.put(grammarAccess.getVLSUnitaryTermAccess().getGroup(), "rule__VLSUnitaryTerm__Group__0");
			builder.put(grammarAccess.getVLSUnitaryTermAccess().getGroup_1(), "rule__VLSUnitaryTerm__Group_1__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup(), "rule__VLSBinary__Group__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0(), "rule__VLSBinary__Group_1_0__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_0(), "rule__VLSBinary__Group_1_0_0_0__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_1(), "rule__VLSBinary__Group_1_0_0_1__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_2(), "rule__VLSBinary__Group_1_0_0_2__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_3(), "rule__VLSBinary__Group_1_0_0_3__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_4(), "rule__VLSBinary__Group_1_0_0_4__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_0_0_5(), "rule__VLSBinary__Group_1_0_0_5__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_1(), "rule__VLSBinary__Group_1_1__0");
			builder.put(grammarAccess.getVLSBinaryAccess().getGroup_1_2(), "rule__VLSBinary__Group_1_2__0");
			builder.put(grammarAccess.getVLSUnitaryFormulaAccess().getGroup_4(), "rule__VLSUnitaryFormula__Group_4__0");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getGroup(), "rule__VLSUniversalQuantifier__Group__0");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1(), "rule__VLSUniversalQuantifier__Group_1__0");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getGroup_1_3(), "rule__VLSUniversalQuantifier__Group_1_3__0");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getGroup(), "rule__VLSExistentialQuantifier__Group__0");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1(), "rule__VLSExistentialQuantifier__Group_1__0");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getGroup_1_3(), "rule__VLSExistentialQuantifier__Group_1_3__0");
			builder.put(grammarAccess.getVLSUnaryNegationAccess().getGroup(), "rule__VLSUnaryNegation__Group__0");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getGroup(), "rule__VLSUnaryInfix__Group__0");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getGroup_1(), "rule__VLSUnaryInfix__Group_1__0");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_0(), "rule__VLSUnaryInfix__Group_1_0_0__0");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_1(), "rule__VLSUnaryInfix__Group_1_0_1__0");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getGroup_1_0_2(), "rule__VLSUnaryInfix__Group_1_0_2__0");
			builder.put(grammarAccess.getVLSAtomicConstantAccess().getGroup_0(), "rule__VLSAtomicConstant__Group_0__0");
			builder.put(grammarAccess.getVLSAtomicConstantAccess().getGroup_1(), "rule__VLSAtomicConstant__Group_1__0");
			builder.put(grammarAccess.getVLSAtomicConstantAccess().getGroup_2(), "rule__VLSAtomicConstant__Group_2__0");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0(), "rule__VLSAtomicFunction__Group_0__0");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2(), "rule__VLSAtomicFunction__Group_0_2__0");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getGroup_0_2_2(), "rule__VLSAtomicFunction__Group_0_2_2__0");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getGroup_1(), "rule__VLSAtomicFunction__Group_1__0");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getGroup(), "rule__VLSFunctionAsTerm__Group__0");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1(), "rule__VLSFunctionAsTerm__Group_1__0");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getGroup_1_2(), "rule__VLSFunctionAsTerm__Group_1_2__0");
			builder.put(grammarAccess.getVLSDefinedTermAccess().getGroup_0(), "rule__VLSDefinedTerm__Group_0__0");
			builder.put(grammarAccess.getVLSDefinedTermAccess().getGroup_1(), "rule__VLSDefinedTerm__Group_1__0");
			builder.put(grammarAccess.getVampireModelAccess().getCommentsAssignment_0(), "rule__VampireModel__CommentsAssignment_0");
			builder.put(grammarAccess.getVampireModelAccess().getConfirmationsAssignment_1(), "rule__VampireModel__ConfirmationsAssignment_1");
			builder.put(grammarAccess.getVampireModelAccess().getFormulasAssignment_2(), "rule__VampireModel__FormulasAssignment_2");
			builder.put(grammarAccess.getVampireModelAccess().getTfformulasAssignment_3(), "rule__VampireModel__TfformulasAssignment_3");
			builder.put(grammarAccess.getVLSCommentAccess().getCommentAssignment(), "rule__VLSComment__CommentAssignment");
			builder.put(grammarAccess.getVLSConfirmationsAccess().getNameAssignment_2_3(), "rule__VLSConfirmations__NameAssignment_2_3");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getNameAssignment_2(), "rule__VLSFofFormula__NameAssignment_2");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getFofRoleAssignment_4(), "rule__VLSFofFormula__FofRoleAssignment_4");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getFofFormulaAssignment_6(), "rule__VLSFofFormula__FofFormulaAssignment_6");
			builder.put(grammarAccess.getVLSFofFormulaAccess().getAnnotationsAssignment_7_1(), "rule__VLSFofFormula__AnnotationsAssignment_7_1");
			builder.put(grammarAccess.getVLSTffFormulaAccess().getNameAssignment_2(), "rule__VLSTffFormula__NameAssignment_2");
			builder.put(grammarAccess.getVLSTffFormulaAccess().getTffRoleAssignment_4(), "rule__VLSTffFormula__TffRoleAssignment_4");
			builder.put(grammarAccess.getVLSTffFormulaAccess().getFofFormulaAssignment_6(), "rule__VLSTffFormula__FofFormulaAssignment_6");
			builder.put(grammarAccess.getVLSTffFormulaAccess().getAnnotationsAssignment_7_1(), "rule__VLSTffFormula__AnnotationsAssignment_7_1");
			builder.put(grammarAccess.getVLSAnnotationAccess().getNameAssignment_1(), "rule__VLSAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getVLSAnnotationAccess().getFollowupAssignment_2_1(), "rule__VLSAnnotation__FollowupAssignment_2_1");
			builder.put(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_0(), "rule__VLSAnnotationTerms__TermsAssignment_0");
			builder.put(grammarAccess.getVLSAnnotationTermsAccess().getTermsAssignment_1_1(), "rule__VLSAnnotationTerms__TermsAssignment_1_1");
			builder.put(grammarAccess.getVLSOtherDeclarationAccess().getTypeAssignment_2(), "rule__VLSOtherDeclaration__TypeAssignment_2");
			builder.put(grammarAccess.getVLSVariableDeclarationAccess().getTypeAssignment_2(), "rule__VLSVariableDeclaration__TypeAssignment_2");
			builder.put(grammarAccess.getVLSTypeDefAccess().getTypeSigAssignment_0(), "rule__VLSTypeDef__TypeSigAssignment_0");
			builder.put(grammarAccess.getVLSTypeDefAccess().getMapsToAssignment_1_1(), "rule__VLSTypeDef__MapsToAssignment_1_1");
			builder.put(grammarAccess.getVLSUnitaryTermAccess().getInitTypeAssignment_0(), "rule__VLSUnitaryTerm__InitTypeAssignment_0");
			builder.put(grammarAccess.getVLSUnitaryTermAccess().getNextTypeAssignment_1_1(), "rule__VLSUnitaryTerm__NextTypeAssignment_1_1");
			builder.put(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_0_1(), "rule__VLSBinary__RightAssignment_1_0_1");
			builder.put(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_1_2(), "rule__VLSBinary__RightAssignment_1_1_2");
			builder.put(grammarAccess.getVLSBinaryAccess().getRightAssignment_1_2_2(), "rule__VLSBinary__RightAssignment_1_2_2");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_2(), "rule__VLSUniversalQuantifier__VariablesAssignment_1_2");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getVariablesAssignment_1_3_1(), "rule__VLSUniversalQuantifier__VariablesAssignment_1_3_1");
			builder.put(grammarAccess.getVLSUniversalQuantifierAccess().getOperandAssignment_2(), "rule__VLSUniversalQuantifier__OperandAssignment_2");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_2(), "rule__VLSExistentialQuantifier__VariablesAssignment_1_2");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getVariablesAssignment_1_3_1(), "rule__VLSExistentialQuantifier__VariablesAssignment_1_3_1");
			builder.put(grammarAccess.getVLSExistentialQuantifierAccess().getOperandAssignment_2(), "rule__VLSExistentialQuantifier__OperandAssignment_2");
			builder.put(grammarAccess.getVLSUnaryNegationAccess().getOperandAssignment_2(), "rule__VLSUnaryNegation__OperandAssignment_2");
			builder.put(grammarAccess.getVLSUnaryInfixAccess().getRightAssignment_1_1(), "rule__VLSUnaryInfix__RightAssignment_1_1");
			builder.put(grammarAccess.getVLSAtomicConstantAccess().getNameAssignment_0_1(), "rule__VLSAtomicConstant__NameAssignment_0_1");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getConstantAssignment_0_1(), "rule__VLSAtomicFunction__ConstantAssignment_0_1");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_1(), "rule__VLSAtomicFunction__TermsAssignment_0_2_1");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_0_2_2_1(), "rule__VLSAtomicFunction__TermsAssignment_0_2_2_1");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getNameAssignment_1_1(), "rule__VLSAtomicFunction__NameAssignment_1_1");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_3(), "rule__VLSAtomicFunction__TermsAssignment_1_3");
			builder.put(grammarAccess.getVLSAtomicFunctionAccess().getTermsAssignment_1_5(), "rule__VLSAtomicFunction__TermsAssignment_1_5");
			builder.put(grammarAccess.getVLSVariableAccess().getNameAssignment(), "rule__VLSVariable__NameAssignment");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getFunctorAssignment_0(), "rule__VLSFunctionAsTerm__FunctorAssignment_0");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_1(), "rule__VLSFunctionAsTerm__TermsAssignment_1_1");
			builder.put(grammarAccess.getVLSFunctionAsTermAccess().getTermsAssignment_1_2_1(), "rule__VLSFunctionAsTerm__TermsAssignment_1_2_1");
			builder.put(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_0_1(), "rule__VLSDefinedTerm__ValueAssignment_0_1");
			builder.put(grammarAccess.getVLSDefinedTermAccess().getValueAssignment_1_1(), "rule__VLSDefinedTerm__ValueAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VampireLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalVampireLanguageParser createParser() {
		InternalVampireLanguageParser result = new InternalVampireLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}

	public VampireLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VampireLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
