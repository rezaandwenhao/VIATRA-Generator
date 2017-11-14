/**
 * generated by Xtext 2.12.0
 */
package hu.bme.mit.inf.dslreasoner.vampireLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VLS Existential Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSExistentialQuantifier#getVariables <em>Variables</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSExistentialQuantifier#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSExistentialQuantifier()
 * @model
 * @generated
 */
public interface VLSExistentialQuantifier extends VLSTerm
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSExistentialQuantifier_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VLSVariable> getVariables();

  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(VLSTerm)
   * @see hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSExistentialQuantifier_Operand()
   * @model containment="true"
   * @generated
   */
  VLSTerm getOperand();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSExistentialQuantifier#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(VLSTerm value);

} // VLSExistentialQuantifier
