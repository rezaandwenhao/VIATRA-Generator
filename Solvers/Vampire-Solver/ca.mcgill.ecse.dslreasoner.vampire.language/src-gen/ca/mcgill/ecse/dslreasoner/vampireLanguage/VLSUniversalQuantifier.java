/**
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VLS Universal Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier#getVariables <em>Variables</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSUniversalQuantifier()
 * @model
 * @generated
 */
public interface VLSUniversalQuantifier extends VLSTerm
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSUniversalQuantifier_Variables()
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
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSUniversalQuantifier_Operand()
   * @model containment="true"
   * @generated
   */
  VLSTerm getOperand();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(VLSTerm value);

} // VLSUniversalQuantifier
