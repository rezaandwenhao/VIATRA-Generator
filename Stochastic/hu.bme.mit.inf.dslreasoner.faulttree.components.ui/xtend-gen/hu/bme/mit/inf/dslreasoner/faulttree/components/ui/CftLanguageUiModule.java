/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.ui;

import hu.bme.mit.inf.dslreasoner.faulttree.components.ui.AbstractCftLanguageUiModule;
import hu.bme.mit.inf.dslreasoner.faulttree.components.ui.syntaxcoloring.CftLanguageSemanticHighlightingCalculator;
import hu.bme.mit.inf.dslreasoner.faulttree.components.ui.syntaxcoloring.CftLanguageTokenToAttributeIdMapper;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class CftLanguageUiModule extends AbstractCftLanguageUiModule {
  public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
    return CftLanguageTokenToAttributeIdMapper.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return CftLanguageSemanticHighlightingCalculator.class;
  }
  
  public CftLanguageUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
