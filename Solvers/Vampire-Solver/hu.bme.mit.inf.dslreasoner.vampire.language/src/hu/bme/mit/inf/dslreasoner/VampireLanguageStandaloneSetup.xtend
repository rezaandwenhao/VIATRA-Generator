/*
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class VampireLanguageStandaloneSetup extends VampireLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new VampireLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}