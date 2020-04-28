/*
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.viatra.solver.language.parser.antlr.internal.InternalSolverLanguageParser;
import org.eclipse.viatra.solver.language.services.SolverLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SolverLanguageParser extends AbstractAntlrParser {

	@Inject
	private SolverLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSolverLanguageParser createParser(XtextTokenStream stream) {
		return new InternalSolverLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Problem";
	}

	public SolverLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SolverLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}