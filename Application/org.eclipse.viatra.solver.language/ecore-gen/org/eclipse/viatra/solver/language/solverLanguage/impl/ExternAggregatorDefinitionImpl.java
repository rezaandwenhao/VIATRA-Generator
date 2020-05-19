/**
 * generated by Xtext 2.21.0
 */
package org.eclipse.viatra.solver.language.solverLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.viatra.solver.language.solverLanguage.ExternAggregatorDefinition;
import org.eclipse.viatra.solver.language.solverLanguage.NamedElement;
import org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extern Aggregator Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregatorDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregatorDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.impl.ExternAggregatorDefinitionImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternAggregatorDefinitionImpl extends StatementImpl implements ExternAggregatorDefinition {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NamedElement type;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected NamedElement inputType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternAggregatorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverLanguagePackage.Literals.EXTERN_AGGREGATOR_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (NamedElement)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(NamedElement newType) {
		NamedElement oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getInputType() {
		if (inputType != null && inputType.eIsProxy()) {
			InternalEObject oldInputType = (InternalEObject)inputType;
			inputType = (NamedElement)eResolveProxy(oldInputType);
			if (inputType != oldInputType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__INPUT_TYPE, oldInputType, inputType));
			}
		}
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetInputType() {
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputType(NamedElement newInputType) {
		NamedElement oldInputType = inputType;
		inputType = newInputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__INPUT_TYPE, oldInputType, inputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__NAME:
				return getName();
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__INPUT_TYPE:
				if (resolve) return getInputType();
				return basicGetInputType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__TYPE:
				setType((NamedElement)newValue);
				return;
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__INPUT_TYPE:
				setInputType((NamedElement)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__TYPE:
				setType((NamedElement)null);
				return;
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__INPUT_TYPE:
				setInputType((NamedElement)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__TYPE:
				return type != null;
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SolverLanguagePackage.EXTERN_AGGREGATOR_DEFINITION__INPUT_TYPE:
				return inputType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExternAggregatorDefinitionImpl
