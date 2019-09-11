/**
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.xenia.impl;

import com.foliage.xenia.xenia.LinkedProperty;
import com.foliage.xenia.xenia.Site;
import com.foliage.xenia.xenia.XeniaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.foliage.xenia.xenia.impl.LinkedPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.impl.LinkedPropertyImpl#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkedPropertyImpl extends MinimalEObjectImpl.Container implements LinkedProperty
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Site name;

  /**
   * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected EList<Site> site;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkedPropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XeniaPackage.Literals.LINKED_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Site getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Site newName, NotificationChain msgs)
  {
    Site oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XeniaPackage.LINKED_PROPERTY__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(Site newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XeniaPackage.LINKED_PROPERTY__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XeniaPackage.LINKED_PROPERTY__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XeniaPackage.LINKED_PROPERTY__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Site> getSite()
  {
    if (site == null)
    {
      site = new EObjectContainmentEList<Site>(Site.class, this, XeniaPackage.LINKED_PROPERTY__SITE);
    }
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XeniaPackage.LINKED_PROPERTY__NAME:
        return basicSetName(null, msgs);
      case XeniaPackage.LINKED_PROPERTY__SITE:
        return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XeniaPackage.LINKED_PROPERTY__NAME:
        return getName();
      case XeniaPackage.LINKED_PROPERTY__SITE:
        return getSite();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XeniaPackage.LINKED_PROPERTY__NAME:
        setName((Site)newValue);
        return;
      case XeniaPackage.LINKED_PROPERTY__SITE:
        getSite().clear();
        getSite().addAll((Collection<? extends Site>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XeniaPackage.LINKED_PROPERTY__NAME:
        setName((Site)null);
        return;
      case XeniaPackage.LINKED_PROPERTY__SITE:
        getSite().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XeniaPackage.LINKED_PROPERTY__NAME:
        return name != null;
      case XeniaPackage.LINKED_PROPERTY__SITE:
        return site != null && !site.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LinkedPropertyImpl