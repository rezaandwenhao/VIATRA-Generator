/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.ui.outline;

import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDefinition;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
@SuppressWarnings("all")
public class CftLanguageOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public boolean _isLeaf(final EventDefinition eventDefinition) {
    return true;
  }
  
  public boolean _isLeaf(final MappingDefinition mappingDefinition) {
    return true;
  }
}
