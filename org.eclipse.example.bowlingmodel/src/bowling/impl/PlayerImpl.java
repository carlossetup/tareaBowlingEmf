/**
 */
package bowling.impl;

import bowling.BowlingPackage;
import bowling.Player;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bowling.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link bowling.impl.PlayerImpl#getDateOfBird <em>Date Of Bird</em>}</li>
 *   <li>{@link bowling.impl.PlayerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link bowling.impl.PlayerImpl#isIsProfessional <em>Is Professional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	 * The default value of the '{@link #getDateOfBird() <em>Date Of Bird</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBird()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBird() <em>Date Of Bird</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBird()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfBird = DATE_OF_BIRD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsProfessional() <em>Is Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfessional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROFESSIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProfessional() <em>Is Professional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProfessional()
	 * @generated
	 * @ordered
	 */
	protected boolean isProfessional = IS_PROFESSIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BowlingPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfBird() {
		return dateOfBird;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBird(Date newDateOfBird) {
		Date oldDateOfBird = dateOfBird;
		dateOfBird = newDateOfBird;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.PLAYER__DATE_OF_BIRD, oldDateOfBird, dateOfBird));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.PLAYER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProfessional() {
		return isProfessional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProfessional(boolean newIsProfessional) {
		boolean oldIsProfessional = isProfessional;
		isProfessional = newIsProfessional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BowlingPackage.PLAYER__IS_PROFESSIONAL, oldIsProfessional, isProfessional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BowlingPackage.PLAYER__NAME:
				return getName();
			case BowlingPackage.PLAYER__DATE_OF_BIRD:
				return getDateOfBird();
			case BowlingPackage.PLAYER__HEIGHT:
				return getHeight();
			case BowlingPackage.PLAYER__IS_PROFESSIONAL:
				return isIsProfessional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BowlingPackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case BowlingPackage.PLAYER__DATE_OF_BIRD:
				setDateOfBird((Date)newValue);
				return;
			case BowlingPackage.PLAYER__HEIGHT:
				setHeight((Double)newValue);
				return;
			case BowlingPackage.PLAYER__IS_PROFESSIONAL:
				setIsProfessional((Boolean)newValue);
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
			case BowlingPackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BowlingPackage.PLAYER__DATE_OF_BIRD:
				setDateOfBird(DATE_OF_BIRD_EDEFAULT);
				return;
			case BowlingPackage.PLAYER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case BowlingPackage.PLAYER__IS_PROFESSIONAL:
				setIsProfessional(IS_PROFESSIONAL_EDEFAULT);
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
			case BowlingPackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BowlingPackage.PLAYER__DATE_OF_BIRD:
				return DATE_OF_BIRD_EDEFAULT == null ? dateOfBird != null : !DATE_OF_BIRD_EDEFAULT.equals(dateOfBird);
			case BowlingPackage.PLAYER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case BowlingPackage.PLAYER__IS_PROFESSIONAL:
				return isProfessional != IS_PROFESSIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", DateOfBird: ");
		result.append(dateOfBird);
		result.append(", height: ");
		result.append(height);
		result.append(", IsProfessional: ");
		result.append(isProfessional);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl