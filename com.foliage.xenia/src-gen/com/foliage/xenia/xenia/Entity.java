/**
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.xenia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.foliage.xenia.xenia.Entity#getTech <em>Tech</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.Entity#getPath <em>Path</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.Entity#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see com.foliage.xenia.xenia.XeniaPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Tech</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tech</em>' attribute.
   * @see #setTech(String)
   * @see com.foliage.xenia.xenia.XeniaPackage#getEntity_Tech()
   * @model
   * @generated
   */
  String getTech();

  /**
   * Sets the value of the '{@link com.foliage.xenia.xenia.Entity#getTech <em>Tech</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tech</em>' attribute.
   * @see #getTech()
   * @generated
   */
  void setTech(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see com.foliage.xenia.xenia.XeniaPackage#getEntity_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.foliage.xenia.xenia.Entity#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * The literals are from the enumeration {@link com.foliage.xenia.xenia.Mode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see com.foliage.xenia.xenia.Mode
   * @see #setMode(Mode)
   * @see com.foliage.xenia.xenia.XeniaPackage#getEntity_Mode()
   * @model
   * @generated
   */
  Mode getMode();

  /**
   * Sets the value of the '{@link com.foliage.xenia.xenia.Entity#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see com.foliage.xenia.xenia.Mode
   * @see #getMode()
   * @generated
   */
  void setMode(Mode value);

} // Entity
