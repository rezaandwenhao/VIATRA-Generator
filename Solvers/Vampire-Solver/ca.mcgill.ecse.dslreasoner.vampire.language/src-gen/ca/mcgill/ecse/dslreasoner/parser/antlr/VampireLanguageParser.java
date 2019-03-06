/*
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.parser.antlr;

import ca.mcgill.ecse.dslreasoner.parser.antlr.internal.InternalVampireLanguageParser;
import ca.mcgill.ecse.dslreasoner.services.VampireLanguageGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class VampireLanguageParser extends AbstractAntlrParser {

	@Inject
	private VampireLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS");
	}
	

	@Override
	protected InternalVampireLanguageParser createParser(XtextTokenStream stream) {
		return new InternalVampireLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "VampireModel";
	}

	public VampireLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VampireLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
