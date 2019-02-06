/**
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftLanguagePackage
 * @generated
 */
public interface CftLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CftLanguageFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.impl.CftLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cft Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cft Model</em>'.
   * @generated
   */
  CftModel createCftModel();

  /**
   * Returns a new object of class '<em>Import Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Declaration</em>'.
   * @generated
   */
  ImportDeclaration createImportDeclaration();

  /**
   * Returns a new object of class '<em>Transformation Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation Definition</em>'.
   * @generated
   */
  TransformationDefinition createTransformationDefinition();

  /**
   * Returns a new object of class '<em>Mapping Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Definition</em>'.
   * @generated
   */
  MappingDefinition createMappingDefinition();

  /**
   * Returns a new object of class '<em>Mapping Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Parameter</em>'.
   * @generated
   */
  MappingParameter createMappingParameter();

  /**
   * Returns a new object of class '<em>Lookup Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup Definition</em>'.
   * @generated
   */
  LookupDefinition createLookupDefinition();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Event Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Reference</em>'.
   * @generated
   */
  EventReference createEventReference();

  /**
   * Returns a new object of class '<em>Component Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Instance</em>'.
   * @generated
   */
  ComponentInstance createComponentInstance();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CftLanguagePackage getCftLanguagePackage();

} //CftLanguageFactory
