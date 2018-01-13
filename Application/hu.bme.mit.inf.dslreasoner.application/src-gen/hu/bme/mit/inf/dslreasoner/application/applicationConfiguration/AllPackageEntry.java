/**
 * generated by Xtext 2.10.0
 */
package hu.bme.mit.inf.dslreasoner.application.applicationConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Package Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.AllPackageEntry#getExclusion <em>Exclusion</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getAllPackageEntry()
 * @model
 * @generated
 */
public interface AllPackageEntry extends MetamodelEntry
{
  /**
   * Returns the value of the '<em><b>Exclusion</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclusion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclusion</em>' containment reference list.
   * @see hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage#getAllPackageEntry_Exclusion()
   * @model containment="true"
   * @generated
   */
  EList<MetamodelElement> getExclusion();

} // AllPackageEntry
