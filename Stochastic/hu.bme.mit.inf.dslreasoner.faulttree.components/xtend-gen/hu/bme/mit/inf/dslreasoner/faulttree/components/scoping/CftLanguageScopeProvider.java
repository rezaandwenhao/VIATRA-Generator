/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentInstance;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.EventDeclaration;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.EventReference;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingParameter;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.Variable;
import hu.bme.mit.inf.dslreasoner.faulttree.components.scoping.AbstractCftLanguageScopeProvider;
import hu.bme.mit.inf.dslreasoner.faulttree.components.scoping.CftLanguageImportedNamespaceAwareLocalScopeProvider;
import java.util.ArrayList;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class CftLanguageScopeProvider extends AbstractCftLanguageScopeProvider {
  public static final String SINGLETON_VARIABLE_PREFIX = "_";
  
  @Inject
  private IResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  private CftLanguageImportedNamespaceAwareLocalScopeProvider importedNamespaceProvider;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(reference, CftLanguagePackage.Literals.LOOKUP_DEFINITION__MAPPING)) {
      _matched=true;
      _switchResult = this.getRuleDefinitionsScope(context, reference);
    }
    if (!_matched) {
      if (Objects.equal(reference, CftLanguagePackage.Literals.LOOKUP_DEFINITION__ARGUMENTS)) {
        _matched=true;
        _switchResult = this.getMappingParametersScope(context);
      }
    }
    if (!_matched) {
      if (Objects.equal(reference, CftLanguagePackage.Literals.EVENT_REFERENCE__COMPONENT)) {
        _matched=true;
        _switchResult = this.getComponentInstancesScope(context);
      }
    }
    if (!_matched) {
      if (Objects.equal(reference, CftLanguagePackage.Literals.EVENT_REFERENCE__EVENT)) {
        _matched=true;
        _switchResult = this.getEventDeclarationsScope(context);
      }
    }
    if (!_matched) {
      _switchResult = super.getScope(context, reference);
    }
    return _switchResult;
  }
  
  protected IScope getRuleDefinitionsScope(final EObject context, final EReference referece) {
    ImportScope _xblockexpression = null;
    {
      final TransformationDefinition transformationDefinition = EcoreUtil2.<TransformationDefinition>getContainerOfType(context, TransformationDefinition.class);
      if ((transformationDefinition == null)) {
        return IScope.NULLSCOPE;
      }
      final IResourceDescriptions resourceDescriptions = this.getResourceDescriptions(transformationDefinition);
      final ArrayList<IEObjectDescription> mappingDefinitionDescriptions = this.toMappingDefinitionDescriptions(resourceDescriptions, 
        transformationDefinition.getMappingDefinitions());
      final SimpleScope ruleDefinitionsScope = new SimpleScope(IScope.NULLSCOPE, mappingDefinitionDescriptions);
      _xblockexpression = this.importedNamespaceProvider.createImportNormalizedScope(ruleDefinitionsScope, context, referece);
    }
    return _xblockexpression;
  }
  
  protected ArrayList<IEObjectDescription> toMappingDefinitionDescriptions(final IResourceDescriptions resourceDescriptions, final Iterable<? extends MappingDefinition> ruleDefinitions) {
    ArrayList<IEObjectDescription> _xblockexpression = null;
    {
      final ArrayList<IEObjectDescription> mappingDefinitionDescriptions = Lists.<IEObjectDescription>newArrayListWithExpectedSize(IterableExtensions.size(ruleDefinitions));
      for (final MappingDefinition ruleDefinition : ruleDefinitions) {
        {
          Pattern _pattern = null;
          if (ruleDefinition!=null) {
            _pattern=ruleDefinition.getPattern();
          }
          final Pattern pattern = _pattern;
          if ((pattern != null)) {
            IEObjectDescription _head = IterableExtensions.<IEObjectDescription>head(resourceDescriptions.getExportedObjectsByObject(pattern));
            QualifiedName _qualifiedName = null;
            if (_head!=null) {
              _qualifiedName=_head.getQualifiedName();
            }
            final QualifiedName patternName = _qualifiedName;
            if ((patternName != null)) {
              IEObjectDescription _create = EObjectDescription.create(patternName, ruleDefinition);
              mappingDefinitionDescriptions.add(_create);
            }
          }
        }
      }
      _xblockexpression = mappingDefinitionDescriptions;
    }
    return _xblockexpression;
  }
  
  private IResourceDescriptions getResourceDescriptions(final Notifier notifier) {
    IResourceDescriptions _xblockexpression = null;
    {
      final ResourceSet resourceSet = EcoreUtil2.getResourceSet(notifier);
      IResourceDescriptions _xifexpression = null;
      if ((resourceSet == null)) {
        _xifexpression = new IResourceDescriptions.NullImpl();
      } else {
        _xifexpression = this.resourceDescriptionsProvider.getResourceDescriptions(resourceSet);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected IScope getMappingParametersScope(final EObject context) {
    IScope _xblockexpression = null;
    {
      final MappingDefinition mappingDefinition = EcoreUtil2.<MappingDefinition>getContainerOfType(context, MappingDefinition.class);
      if ((mappingDefinition == null)) {
        return IScope.NULLSCOPE;
      }
      final Function1<MappingParameter, Boolean> _function = (MappingParameter it) -> {
        boolean _startsWith = it.getName().startsWith(CftLanguageScopeProvider.SINGLETON_VARIABLE_PREFIX);
        return Boolean.valueOf((!_startsWith));
      };
      final Iterable<MappingParameter> variables = IterableExtensions.<MappingParameter>filter(mappingDefinition.getParameters(), _function);
      _xblockexpression = Scopes.scopeFor(variables);
    }
    return _xblockexpression;
  }
  
  protected IScope getComponentInstancesScope(final EObject context) {
    IScope _xblockexpression = null;
    {
      final MappingDefinition mappingDefinition = EcoreUtil2.<MappingDefinition>getContainerOfType(context, MappingDefinition.class);
      if ((mappingDefinition == null)) {
        return IScope.NULLSCOPE;
      }
      final ArrayList<Variable> componentInstances = CollectionLiterals.<Variable>newArrayList();
      componentInstances.addAll(mappingDefinition.getLookupDefinitions());
      ComponentInstance _componentInstance = mappingDefinition.getComponentInstance();
      boolean _tripleNotEquals = (_componentInstance != null);
      if (_tripleNotEquals) {
        ComponentInstance _componentInstance_1 = mappingDefinition.getComponentInstance();
        componentInstances.add(_componentInstance_1);
      }
      _xblockexpression = Scopes.scopeFor(componentInstances);
    }
    return _xblockexpression;
  }
  
  protected IScope getEventDeclarationsScope(final EObject context) {
    IScope _xblockexpression = null;
    {
      EventReference _containerOfType = EcoreUtil2.<EventReference>getContainerOfType(context, EventReference.class);
      Variable _component = null;
      if (_containerOfType!=null) {
        _component=_containerOfType.getComponent();
      }
      final Variable variable = _component;
      ArrayList<EventDeclaration> _switchResult = null;
      boolean _matched = false;
      if (variable instanceof ComponentInstance) {
        _matched=true;
        ComponentDefinition _componentType = ((ComponentInstance)variable).getComponentType();
        ArrayList<EventDeclaration> _allEventDeclarations = null;
        if (_componentType!=null) {
          _allEventDeclarations=this.getAllEventDeclarations(_componentType);
        }
        _switchResult = _allEventDeclarations;
      }
      if (!_matched) {
        if (variable instanceof LookupDefinition) {
          _matched=true;
          MappingDefinition _mapping = ((LookupDefinition)variable).getMapping();
          ComponentInstance _componentInstance = null;
          if (_mapping!=null) {
            _componentInstance=_mapping.getComponentInstance();
          }
          ComponentDefinition _componentType = null;
          if (_componentInstance!=null) {
            _componentType=_componentInstance.getComponentType();
          }
          ArrayList<EventDeclaration> _allEventDeclarations = null;
          if (_componentType!=null) {
            _allEventDeclarations=this.getAllEventDeclarations(_componentType);
          }
          _switchResult = _allEventDeclarations;
        }
      }
      if (!_matched) {
        _switchResult = null;
      }
      final ArrayList<EventDeclaration> events = _switchResult;
      if ((events == null)) {
        return IScope.NULLSCOPE;
      }
      _xblockexpression = Scopes.scopeFor(events);
    }
    return _xblockexpression;
  }
  
  private ArrayList<EventDeclaration> getAllEventDeclarations(final ComponentDefinition componentDefinition) {
    ArrayList<EventDeclaration> _xblockexpression = null;
    {
      final ArrayList<EventDeclaration> eventDeclarations = CollectionLiterals.<EventDeclaration>newArrayList();
      eventDeclarations.addAll(componentDefinition.getInputEvents());
      eventDeclarations.addAll(componentDefinition.getEventDefinitions());
      _xblockexpression = eventDeclarations;
    }
    return _xblockexpression;
  }
}
