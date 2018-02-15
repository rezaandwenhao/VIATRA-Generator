/**
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Enumberation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntEnumberation#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getIntEnumberation()
 * @model
 * @generated
 */
public interface IntEnumberation extends NumberSpecification
{
  /**
   * Returns the value of the '<em><b>Entry</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' attribute list.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getIntEnumberation_Entry()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getEntry();

} // IntEnumberation
