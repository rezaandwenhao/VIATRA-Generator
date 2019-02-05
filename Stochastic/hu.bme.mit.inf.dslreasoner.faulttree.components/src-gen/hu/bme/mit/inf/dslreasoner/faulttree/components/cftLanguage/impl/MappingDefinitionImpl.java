/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.Assignment;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentInstance;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.MappingDefinitionImpl#isTopLevel <em>Top Level</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.MappingDefinitionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.MappingDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.MappingDefinitionImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.MappingDefinitionImpl#getLookupDefinitions <em>Lookup Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.MappingDefinitionImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingDefinitionImpl extends MinimalEObjectImpl.Container implements MappingDefinition
{
  /**
   * The default value of the '{@link #isTopLevel() <em>Top Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTopLevel()
   * @generated
   * @ordered
   */
  protected static final boolean TOP_LEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTopLevel() <em>Top Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTopLevel()
   * @generated
   * @ordered
   */
  protected boolean topLevel = TOP_LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<MappingParameter> parameters;

  /**
   * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentInstance()
   * @generated
   * @ordered
   */
  protected ComponentInstance componentInstance;

  /**
   * The cached value of the '{@link #getLookupDefinitions() <em>Lookup Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLookupDefinitions()
   * @generated
   * @ordered
   */
  protected EList<LookupDefinition> lookupDefinitions;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CftLanguagePackage.Literals.MAPPING_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isTopLevel()
  {
    return topLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTopLevel(boolean newTopLevel)
  {
    boolean oldTopLevel = topLevel;
    topLevel = newTopLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CftLanguagePackage.MAPPING_DEFINITION__TOP_LEVEL, oldTopLevel, topLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (Pattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftLanguagePackage.MAPPING_DEFINITION__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPattern(Pattern newPattern)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CftLanguagePackage.MAPPING_DEFINITION__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MappingParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<MappingParameter>(MappingParameter.class, this, CftLanguagePackage.MAPPING_DEFINITION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentInstance getComponentInstance()
  {
    return componentInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentInstance(ComponentInstance newComponentInstance, NotificationChain msgs)
  {
    ComponentInstance oldComponentInstance = componentInstance;
    componentInstance = newComponentInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE, oldComponentInstance, newComponentInstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComponentInstance(ComponentInstance newComponentInstance)
  {
    if (newComponentInstance != componentInstance)
    {
      NotificationChain msgs = null;
      if (componentInstance != null)
        msgs = ((InternalEObject)componentInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE, null, msgs);
      if (newComponentInstance != null)
        msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE, null, msgs);
      msgs = basicSetComponentInstance(newComponentInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LookupDefinition> getLookupDefinitions()
  {
    if (lookupDefinitions == null)
    {
      lookupDefinitions = new EObjectContainmentEList<LookupDefinition>(LookupDefinition.class, this, CftLanguagePackage.MAPPING_DEFINITION__LOOKUP_DEFINITIONS);
    }
    return lookupDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, CftLanguagePackage.MAPPING_DEFINITION__ASSIGNMENTS);
    }
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CftLanguagePackage.MAPPING_DEFINITION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE:
        return basicSetComponentInstance(null, msgs);
      case CftLanguagePackage.MAPPING_DEFINITION__LOOKUP_DEFINITIONS:
        return ((InternalEList<?>)getLookupDefinitions()).basicRemove(otherEnd, msgs);
      case CftLanguagePackage.MAPPING_DEFINITION__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CftLanguagePackage.MAPPING_DEFINITION__TOP_LEVEL:
        return isTopLevel();
      case CftLanguagePackage.MAPPING_DEFINITION__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case CftLanguagePackage.MAPPING_DEFINITION__PARAMETERS:
        return getParameters();
      case CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE:
        return getComponentInstance();
      case CftLanguagePackage.MAPPING_DEFINITION__LOOKUP_DEFINITIONS:
        return getLookupDefinitions();
      case CftLanguagePackage.MAPPING_DEFINITION__ASSIGNMENTS:
        return getAssignments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CftLanguagePackage.MAPPING_DEFINITION__TOP_LEVEL:
        setTopLevel((Boolean)newValue);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends MappingParameter>)newValue);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE:
        setComponentInstance((ComponentInstance)newValue);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__LOOKUP_DEFINITIONS:
        getLookupDefinitions().clear();
        getLookupDefinitions().addAll((Collection<? extends LookupDefinition>)newValue);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CftLanguagePackage.MAPPING_DEFINITION__TOP_LEVEL:
        setTopLevel(TOP_LEVEL_EDEFAULT);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__PATTERN:
        setPattern((Pattern)null);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__PARAMETERS:
        getParameters().clear();
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE:
        setComponentInstance((ComponentInstance)null);
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__LOOKUP_DEFINITIONS:
        getLookupDefinitions().clear();
        return;
      case CftLanguagePackage.MAPPING_DEFINITION__ASSIGNMENTS:
        getAssignments().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CftLanguagePackage.MAPPING_DEFINITION__TOP_LEVEL:
        return topLevel != TOP_LEVEL_EDEFAULT;
      case CftLanguagePackage.MAPPING_DEFINITION__PATTERN:
        return pattern != null;
      case CftLanguagePackage.MAPPING_DEFINITION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case CftLanguagePackage.MAPPING_DEFINITION__COMPONENT_INSTANCE:
        return componentInstance != null;
      case CftLanguagePackage.MAPPING_DEFINITION__LOOKUP_DEFINITIONS:
        return lookupDefinitions != null && !lookupDefinitions.isEmpty();
      case CftLanguagePackage.MAPPING_DEFINITION__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (topLevel: ");
    result.append(topLevel);
    result.append(')');
    return result.toString();
  }

} //MappingDefinitionImpl
