/**
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VLS Nor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSNor#getLeft <em>Left</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSNor#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSNor()
 * @model
 * @generated
 */
public interface VLSNor extends VLSTerm
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(VLSTerm)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSNor_Left()
   * @model containment="true"
   * @generated
   */
  VLSTerm getLeft();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSNor#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(VLSTerm value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(VLSTerm)
   * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage#getVLSNor_Right()
   * @model containment="true"
   * @generated
   */
  VLSTerm getRight();

  /**
   * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSNor#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(VLSTerm value);

} // VLSNor
