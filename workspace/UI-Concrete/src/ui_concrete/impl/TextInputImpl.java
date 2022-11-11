/**
 */
package ui_concrete.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui_concrete.Column;
import ui_concrete.TextInput;
import ui_concrete.Ui_concretePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.impl.TextInputImpl#getText <em>Text</em>}</li>
 *   <li>{@link ui_concrete.impl.TextInputImpl#getPlaceHolder <em>Place Holder</em>}</li>
 *   <li>{@link ui_concrete.impl.TextInputImpl#getColumnSQL <em>Column SQL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextInputImpl extends GraphicalIndividualImpl implements TextInput {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceHolder() <em>Place Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceHolder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_HOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceHolder() <em>Place Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceHolder()
	 * @generated
	 * @ordered
	 */
	protected String placeHolder = PLACE_HOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumnSQL() <em>Column SQL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSQL()
	 * @generated
	 * @ordered
	 */
	protected Column columnSQL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_concretePackage.Literals.TEXT_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.TEXT_INPUT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceHolder() {
		return placeHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceHolder(String newPlaceHolder) {
		String oldPlaceHolder = placeHolder;
		placeHolder = newPlaceHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.TEXT_INPUT__PLACE_HOLDER, oldPlaceHolder, placeHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getColumnSQL() {
		if (columnSQL != null && columnSQL.eIsProxy()) {
			InternalEObject oldColumnSQL = (InternalEObject)columnSQL;
			columnSQL = (Column)eResolveProxy(oldColumnSQL);
			if (columnSQL != oldColumnSQL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ui_concretePackage.TEXT_INPUT__COLUMN_SQL, oldColumnSQL, columnSQL));
			}
		}
		return columnSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetColumnSQL() {
		return columnSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnSQL(Column newColumnSQL) {
		Column oldColumnSQL = columnSQL;
		columnSQL = newColumnSQL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.TEXT_INPUT__COLUMN_SQL, oldColumnSQL, columnSQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_concretePackage.TEXT_INPUT__TEXT:
				return getText();
			case Ui_concretePackage.TEXT_INPUT__PLACE_HOLDER:
				return getPlaceHolder();
			case Ui_concretePackage.TEXT_INPUT__COLUMN_SQL:
				if (resolve) return getColumnSQL();
				return basicGetColumnSQL();
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
			case Ui_concretePackage.TEXT_INPUT__TEXT:
				setText((String)newValue);
				return;
			case Ui_concretePackage.TEXT_INPUT__PLACE_HOLDER:
				setPlaceHolder((String)newValue);
				return;
			case Ui_concretePackage.TEXT_INPUT__COLUMN_SQL:
				setColumnSQL((Column)newValue);
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
			case Ui_concretePackage.TEXT_INPUT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Ui_concretePackage.TEXT_INPUT__PLACE_HOLDER:
				setPlaceHolder(PLACE_HOLDER_EDEFAULT);
				return;
			case Ui_concretePackage.TEXT_INPUT__COLUMN_SQL:
				setColumnSQL((Column)null);
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
			case Ui_concretePackage.TEXT_INPUT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Ui_concretePackage.TEXT_INPUT__PLACE_HOLDER:
				return PLACE_HOLDER_EDEFAULT == null ? placeHolder != null : !PLACE_HOLDER_EDEFAULT.equals(placeHolder);
			case Ui_concretePackage.TEXT_INPUT__COLUMN_SQL:
				return columnSQL != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", placeHolder: ");
		result.append(placeHolder);
		result.append(')');
		return result.toString();
	}

} //TextInputImpl
