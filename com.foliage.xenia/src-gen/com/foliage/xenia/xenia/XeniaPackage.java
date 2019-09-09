/**
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.xenia;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.foliage.xenia.xenia.XeniaFactory
 * @model kind="package"
 * @generated
 */
public interface XeniaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xenia";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.foliage.com/xenia/Xenia";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xenia";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XeniaPackage eINSTANCE = com.foliage.xenia.xenia.impl.XeniaPackageImpl.init();

  /**
   * The meta object id for the '{@link com.foliage.xenia.xenia.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.foliage.xenia.xenia.impl.ModelImpl
   * @see com.foliage.xenia.xenia.impl.XeniaPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ENTITIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.foliage.xenia.xenia.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.foliage.xenia.xenia.impl.EntityImpl
   * @see com.foliage.xenia.xenia.impl.XeniaPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.foliage.xenia.xenia.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.foliage.xenia.xenia.impl.GreetingImpl
   * @see com.foliage.xenia.xenia.impl.XeniaPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__NAME = 0;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.foliage.xenia.xenia.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.foliage.xenia.xenia.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.foliage.xenia.xenia.Model#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.foliage.xenia.xenia.Model#getEntities()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Entities();

  /**
   * Returns the meta object for class '{@link com.foliage.xenia.xenia.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.foliage.xenia.xenia.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link com.foliage.xenia.xenia.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.foliage.xenia.xenia.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for class '{@link com.foliage.xenia.xenia.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.foliage.xenia.xenia.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.foliage.xenia.xenia.Greeting#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.foliage.xenia.xenia.Greeting#getName()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XeniaFactory getXeniaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.foliage.xenia.xenia.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.foliage.xenia.xenia.impl.ModelImpl
     * @see com.foliage.xenia.xenia.impl.XeniaPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ENTITIES = eINSTANCE.getModel_Entities();

    /**
     * The meta object literal for the '{@link com.foliage.xenia.xenia.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.foliage.xenia.xenia.impl.EntityImpl
     * @see com.foliage.xenia.xenia.impl.XeniaPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '{@link com.foliage.xenia.xenia.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.foliage.xenia.xenia.impl.GreetingImpl
     * @see com.foliage.xenia.xenia.impl.XeniaPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

  }

} //XeniaPackage