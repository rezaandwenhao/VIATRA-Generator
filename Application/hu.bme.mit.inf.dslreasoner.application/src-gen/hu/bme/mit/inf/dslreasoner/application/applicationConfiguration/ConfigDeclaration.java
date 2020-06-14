/**
 * generated by Xtext 2.21.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigDeclaration#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getConfigDeclaration()
 * @model
 * @generated
 */
public interface ConfigDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' containment reference.
   * @see #setSpecification(ConfigSpecification)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getConfigDeclaration_Specification()
   * @model containment="true"
   * @generated
   */
  ConfigSpecification getSpecification();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigDeclaration#getSpecification <em>Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' containment reference.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(ConfigSpecification value);

} // ConfigDeclaration
