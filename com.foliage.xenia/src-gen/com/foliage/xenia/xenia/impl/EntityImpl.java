/**
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.xenia.impl;

import com.foliage.xenia.xenia.Entity;
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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.foliage.xenia.xenia.impl.EntityImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.impl.EntityImpl#getSites <em>Sites</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.impl.EntityImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link com.foliage.xenia.xenia.impl.EntityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
{
  /**
   * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected static final String APP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected String appName = APP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSites()
   * @generated
   * @ordered
   */
  protected EList<Site> sites;

  /**
   * The default value of the '{@link #getProp() <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected static final String PROP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProp() <em>Prop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected String prop = PROP_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return XeniaPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAppName()
  {
    return appName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAppName(String newAppName)
  {
    String oldAppName = appName;
    appName = newAppName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XeniaPackage.ENTITY__APP_NAME, oldAppName, appName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Site> getSites()
  {
    if (sites == null)
    {
      sites = new EObjectContainmentEList<Site>(Site.class, this, XeniaPackage.ENTITY__SITES);
    }
    return sites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProp()
  {
    return prop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProp(String newProp)
  {
    String oldProp = prop;
    prop = newProp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XeniaPackage.ENTITY__PROP, oldProp, prop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XeniaPackage.ENTITY__NAME, oldName, name));
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
      case XeniaPackage.ENTITY__SITES:
        return ((InternalEList<?>)getSites()).basicRemove(otherEnd, msgs);
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
      case XeniaPackage.ENTITY__APP_NAME:
        return getAppName();
      case XeniaPackage.ENTITY__SITES:
        return getSites();
      case XeniaPackage.ENTITY__PROP:
        return getProp();
      case XeniaPackage.ENTITY__NAME:
        return getName();
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
      case XeniaPackage.ENTITY__APP_NAME:
        setAppName((String)newValue);
        return;
      case XeniaPackage.ENTITY__SITES:
        getSites().clear();
        getSites().addAll((Collection<? extends Site>)newValue);
        return;
      case XeniaPackage.ENTITY__PROP:
        setProp((String)newValue);
        return;
      case XeniaPackage.ENTITY__NAME:
        setName((String)newValue);
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
      case XeniaPackage.ENTITY__APP_NAME:
        setAppName(APP_NAME_EDEFAULT);
        return;
      case XeniaPackage.ENTITY__SITES:
        getSites().clear();
        return;
      case XeniaPackage.ENTITY__PROP:
        setProp(PROP_EDEFAULT);
        return;
      case XeniaPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
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
      case XeniaPackage.ENTITY__APP_NAME:
        return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
      case XeniaPackage.ENTITY__SITES:
        return sites != null && !sites.isEmpty();
      case XeniaPackage.ENTITY__PROP:
        return PROP_EDEFAULT == null ? prop != null : !PROP_EDEFAULT.equals(prop);
      case XeniaPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (appName: ");
    result.append(appName);
    result.append(", prop: ");
    result.append(prop);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
