/*
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SolverLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/eclipse/viatra/solver/language/parser/antlr/internal/InternalSolverLanguage.tokens");
	}
}