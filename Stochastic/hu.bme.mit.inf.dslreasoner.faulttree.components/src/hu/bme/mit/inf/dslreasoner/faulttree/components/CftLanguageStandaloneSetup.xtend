/*
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CftLanguageStandaloneSetup extends CftLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new CftLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
