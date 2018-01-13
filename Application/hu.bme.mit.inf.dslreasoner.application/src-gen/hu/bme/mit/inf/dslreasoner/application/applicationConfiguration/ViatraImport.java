/**
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viatra Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport#getImportedViatra <em>Imported Viatra</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getViatraImport()
 * @model
 * @generated
 */
public interface ViatraImport extends Import
{
  /**
   * Returns the value of the '<em><b>Imported Viatra</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Viatra</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Viatra</em>' reference.
   * @see #setImportedViatra(PatternModel)
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getViatraImport_ImportedViatra()
   * @model
   * @generated
   */
  PatternModel getImportedViatra();

  /**
   * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport#getImportedViatra <em>Imported Viatra</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Viatra</em>' reference.
   * @see #getImportedViatra()
   * @generated
   */
  void setImportedViatra(PatternModel value);

} // ViatraImport
