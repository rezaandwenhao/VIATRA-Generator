/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentInstance;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.ComponentInstanceImpl#getComponentType <em>Component Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends VariableImpl implements ComponentInstance
{
  /**
   * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentType()
   * @generated
   * @ordered
   */
  protected ComponentDefinition componentType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentInstanceImpl()
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
    return CftLanguagePackage.Literals.COMPONENT_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComponentDefinition getComponentType()
  {
    if (componentType != null && componentType.eIsProxy())
    {
      InternalEObject oldComponentType = (InternalEObject)componentType;
      componentType = (ComponentDefinition)eResolveProxy(oldComponentType);
      if (componentType != oldComponentType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftLanguagePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
      }
    }
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentDefinition basicGetComponentType()
  {
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComponentType(ComponentDefinition newComponentType)
  {
    ComponentDefinition oldComponentType = componentType;
    componentType = newComponentType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CftLanguagePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
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
      case CftLanguagePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
        if (resolve) return getComponentType();
        return basicGetComponentType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CftLanguagePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
        setComponentType((ComponentDefinition)newValue);
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
      case CftLanguagePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
        setComponentType((ComponentDefinition)null);
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
      case CftLanguagePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
        return componentType != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentInstanceImpl
