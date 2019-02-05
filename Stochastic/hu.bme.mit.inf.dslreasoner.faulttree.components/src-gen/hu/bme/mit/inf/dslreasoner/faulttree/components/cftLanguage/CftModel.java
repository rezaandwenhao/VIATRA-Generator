/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cft Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel#getImports <em>Imports</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel#getComponentDefinitions <em>Component Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel#getTransformationDefinitions <em>Transformation Definitions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage#getCftModel()
 * @model
 * @generated
 */
public interface CftModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage#getCftModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ImportDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage#getCftModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDeclaration> getImports();

  /**
   * Returns the value of the '<em><b>Component Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage#getCftModel_ComponentDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<ComponentDefinition> getComponentDefinitions();

  /**
   * Returns the value of the '<em><b>Transformation Definitions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation Definitions</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage#getCftModel_TransformationDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<TransformationDefinition> getTransformationDefinitions();

} // CftModel
