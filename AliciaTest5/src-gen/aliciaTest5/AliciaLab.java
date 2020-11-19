/**
 */
package aliciaTest5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alicia Lab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aliciaTest5.AliciaLab#getProject <em>Project</em>}</li>
 *   <li>{@link aliciaTest5.AliciaLab#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see aliciaTest5.AliciaTest5Package#getAliciaLab()
 * @model
 * @generated
 */
public interface AliciaLab extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link aliciaTest5.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see aliciaTest5.AliciaTest5Package#getAliciaLab_Project()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProject();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link aliciaTest5.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see aliciaTest5.AliciaTest5Package#getAliciaLab_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

} // AliciaLab
