/**
 */
package aliciaTest5.impl;

import aliciaTest5.AliciaLab;
import aliciaTest5.AliciaTest5Package;
import aliciaTest5.Project;
import aliciaTest5.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alicia Lab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aliciaTest5.impl.AliciaLabImpl#getProject <em>Project</em>}</li>
 *   <li>{@link aliciaTest5.impl.AliciaLabImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliciaLabImpl extends MinimalEObjectImpl.Container implements AliciaLab {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> project;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliciaLabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AliciaTest5Package.Literals.ALICIA_LAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProject() {
		if (project == null) {
			project = new EObjectContainmentEList<Project>(Project.class, this, AliciaTest5Package.ALICIA_LAB__PROJECT);
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<Student>(Student.class, this, AliciaTest5Package.ALICIA_LAB__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AliciaTest5Package.ALICIA_LAB__PROJECT:
			return ((InternalEList<?>) getProject()).basicRemove(otherEnd, msgs);
		case AliciaTest5Package.ALICIA_LAB__STUDENT:
			return ((InternalEList<?>) getStudent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AliciaTest5Package.ALICIA_LAB__PROJECT:
			return getProject();
		case AliciaTest5Package.ALICIA_LAB__STUDENT:
			return getStudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AliciaTest5Package.ALICIA_LAB__PROJECT:
			getProject().clear();
			getProject().addAll((Collection<? extends Project>) newValue);
			return;
		case AliciaTest5Package.ALICIA_LAB__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection<? extends Student>) newValue);
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
		case AliciaTest5Package.ALICIA_LAB__PROJECT:
			getProject().clear();
			return;
		case AliciaTest5Package.ALICIA_LAB__STUDENT:
			getStudent().clear();
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
		case AliciaTest5Package.ALICIA_LAB__PROJECT:
			return project != null && !project.isEmpty();
		case AliciaTest5Package.ALICIA_LAB__STUDENT:
			return student != null && !student.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AliciaLabImpl
