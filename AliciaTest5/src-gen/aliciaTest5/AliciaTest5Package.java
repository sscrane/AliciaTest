/**
 */
package aliciaTest5;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aliciaTest5.AliciaTest5Factory
 * @model kind="package"
 * @generated
 */
public interface AliciaTest5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aliciaTest5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smith.edu//aliciaTest5aliciaTest5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aliciaTest5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AliciaTest5Package eINSTANCE = aliciaTest5.impl.AliciaTest5PackageImpl.init();

	/**
	 * The meta object id for the '{@link aliciaTest5.impl.AliciaLabImpl <em>Alicia Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aliciaTest5.impl.AliciaLabImpl
	 * @see aliciaTest5.impl.AliciaTest5PackageImpl#getAliciaLab()
	 * @generated
	 */
	int ALICIA_LAB = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALICIA_LAB__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALICIA_LAB__STUDENT = 1;

	/**
	 * The number of structural features of the '<em>Alicia Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALICIA_LAB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alicia Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALICIA_LAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aliciaTest5.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aliciaTest5.impl.ProjectImpl
	 * @see aliciaTest5.impl.AliciaTest5PackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STUDENT = 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aliciaTest5.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aliciaTest5.impl.StudentImpl
	 * @see aliciaTest5.impl.AliciaTest5PackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link aliciaTest5.AliciaLab <em>Alicia Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alicia Lab</em>'.
	 * @see aliciaTest5.AliciaLab
	 * @generated
	 */
	EClass getAliciaLab();

	/**
	 * Returns the meta object for the containment reference list '{@link aliciaTest5.AliciaLab#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see aliciaTest5.AliciaLab#getProject()
	 * @see #getAliciaLab()
	 * @generated
	 */
	EReference getAliciaLab_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link aliciaTest5.AliciaLab#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see aliciaTest5.AliciaLab#getStudent()
	 * @see #getAliciaLab()
	 * @generated
	 */
	EReference getAliciaLab_Student();

	/**
	 * Returns the meta object for class '{@link aliciaTest5.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see aliciaTest5.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the reference '{@link aliciaTest5.Project#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see aliciaTest5.Project#getStudent()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Student();

	/**
	 * Returns the meta object for class '{@link aliciaTest5.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see aliciaTest5.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AliciaTest5Factory getAliciaTest5Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aliciaTest5.impl.AliciaLabImpl <em>Alicia Lab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aliciaTest5.impl.AliciaLabImpl
		 * @see aliciaTest5.impl.AliciaTest5PackageImpl#getAliciaLab()
		 * @generated
		 */
		EClass ALICIA_LAB = eINSTANCE.getAliciaLab();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALICIA_LAB__PROJECT = eINSTANCE.getAliciaLab_Project();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALICIA_LAB__STUDENT = eINSTANCE.getAliciaLab_Student();

		/**
		 * The meta object literal for the '{@link aliciaTest5.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aliciaTest5.impl.ProjectImpl
		 * @see aliciaTest5.impl.AliciaTest5PackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__STUDENT = eINSTANCE.getProject_Student();

		/**
		 * The meta object literal for the '{@link aliciaTest5.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aliciaTest5.impl.StudentImpl
		 * @see aliciaTest5.impl.AliciaTest5PackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

	}

} //AliciaTest5Package
