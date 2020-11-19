/**
 */
package aliciaTest5.impl;

import aliciaTest5.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AliciaTest5FactoryImpl extends EFactoryImpl implements AliciaTest5Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AliciaTest5Factory init() {
		try {
			AliciaTest5Factory theAliciaTest5Factory = (AliciaTest5Factory) EPackage.Registry.INSTANCE
					.getEFactory(AliciaTest5Package.eNS_URI);
			if (theAliciaTest5Factory != null) {
				return theAliciaTest5Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AliciaTest5FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliciaTest5FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AliciaTest5Package.ALICIA_LAB:
			return createAliciaLab();
		case AliciaTest5Package.PROJECT:
			return createProject();
		case AliciaTest5Package.STUDENT:
			return createStudent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliciaLab createAliciaLab() {
		AliciaLabImpl aliciaLab = new AliciaLabImpl();
		return aliciaLab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliciaTest5Package getAliciaTest5Package() {
		return (AliciaTest5Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AliciaTest5Package getPackage() {
		return AliciaTest5Package.eINSTANCE;
	}

} //AliciaTest5FactoryImpl
