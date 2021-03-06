/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.ActualSchedule;
import rslingo.rsl.rsl.Date;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actual Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.ActualScheduleImpl#getStart <em>Start</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ActualScheduleImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActualScheduleImpl extends MinimalEObjectImpl.Container implements ActualSchedule
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected Date start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected Date end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActualScheduleImpl()
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
    return RslPackage.Literals.ACTUAL_SCHEDULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(Date newStart, NotificationChain msgs)
  {
    Date oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.ACTUAL_SCHEDULE__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(Date newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.ACTUAL_SCHEDULE__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.ACTUAL_SCHEDULE__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ACTUAL_SCHEDULE__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(Date newEnd, NotificationChain msgs)
  {
    Date oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.ACTUAL_SCHEDULE__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(Date newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.ACTUAL_SCHEDULE__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.ACTUAL_SCHEDULE__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.ACTUAL_SCHEDULE__END, newEnd, newEnd));
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
      case RslPackage.ACTUAL_SCHEDULE__START:
        return basicSetStart(null, msgs);
      case RslPackage.ACTUAL_SCHEDULE__END:
        return basicSetEnd(null, msgs);
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
      case RslPackage.ACTUAL_SCHEDULE__START:
        return getStart();
      case RslPackage.ACTUAL_SCHEDULE__END:
        return getEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RslPackage.ACTUAL_SCHEDULE__START:
        setStart((Date)newValue);
        return;
      case RslPackage.ACTUAL_SCHEDULE__END:
        setEnd((Date)newValue);
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
      case RslPackage.ACTUAL_SCHEDULE__START:
        setStart((Date)null);
        return;
      case RslPackage.ACTUAL_SCHEDULE__END:
        setEnd((Date)null);
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
      case RslPackage.ACTUAL_SCHEDULE__START:
        return start != null;
      case RslPackage.ACTUAL_SCHEDULE__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ActualScheduleImpl
