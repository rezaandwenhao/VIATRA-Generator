/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguageRuntimeModule;
import hu.bme.mit.inf.dslreasoner.faulttree.components.CftLanguageStandaloneSetup;
import hu.bme.mit.inf.dslreasoner.faulttree.components.ide.CftLanguageIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CftLanguageIdeSetup extends CftLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    CftLanguageRuntimeModule _cftLanguageRuntimeModule = new CftLanguageRuntimeModule();
    CftLanguageIdeModule _cftLanguageIdeModule = new CftLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_cftLanguageRuntimeModule, _cftLanguageIdeModule));
  }
}
