/**
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.xenia;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.foliage.xenia.xenia.Model#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.Model#getMapped_entities <em>Mapped entities</em>}</li>
 * </ul>
 *
 * @see com.foliage.xenia.xenia.XeniaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link com.foliage.xenia.xenia.Entity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see com.foliage.xenia.xenia.XeniaPackage#getModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Mapped entities</b></em>' containment reference list.
   * The list contents are of type {@link com.foliage.xenia.xenia.MappedEntity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped entities</em>' containment reference list.
   * @see com.foliage.xenia.xenia.XeniaPackage#getModel_Mapped_entities()
   * @model containment="true"
   * @generated
   */
  EList<MappedEntity> getMapped_entities();

} // Model
