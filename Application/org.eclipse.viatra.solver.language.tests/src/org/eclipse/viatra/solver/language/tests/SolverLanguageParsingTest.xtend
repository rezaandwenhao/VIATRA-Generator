/*
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.viatra.solver.language.solverLanguage.Problem

@ExtendWith(InjectionExtension)
@InjectWith(SolverLanguageInjectorProvider)
class SolverLanguageParsingTest {
	@Inject
	ParseHelper<Problem> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
