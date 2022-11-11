/**
 */
package ui_concrete.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui_concrete.CheckBox;
import ui_concrete.Column;
import ui_concrete.Ui_concretePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.impl.CheckBoxImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link ui_concrete.impl.CheckBoxImpl#getText <em>Text</em>}</li>
 *   <li>{@link ui_concrete.impl.CheckBoxImpl#getColumnSQL <em>Column SQL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckBoxImpl extends GraphicalIndividualImpl implements CheckBox {
	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

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
	protected CheckBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_concretePackage.Literals.CHECK_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.CHECK_BOX__SELECTED, oldSelected, selected));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.CHECK_BOX__TEXT, oldText, text));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ui_concretePackage.CHECK_BOX__COLUMN_SQL, oldColumnSQL, columnSQL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.CHECK_BOX__COLUMN_SQL, oldColumnSQL, columnSQL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_concretePackage.CHECK_BOX__SELECTED:
				return isSelected();
			case Ui_concretePackage.CHECK_BOX__TEXT:
				return getText();
			case Ui_concretePackage.CHECK_BOX__COLUMN_SQL:
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
			case Ui_concretePackage.CHECK_BOX__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case Ui_concretePackage.CHECK_BOX__TEXT:
				setText((String)newValue);
				return;
			case Ui_concretePackage.CHECK_BOX__COLUMN_SQL:
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
			case Ui_concretePackage.CHECK_BOX__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case Ui_concretePackage.CHECK_BOX__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Ui_concretePackage.CHECK_BOX__COLUMN_SQL:
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
			case Ui_concretePackage.CHECK_BOX__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case Ui_concretePackage.CHECK_BOX__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Ui_concretePackage.CHECK_BOX__COLUMN_SQL:
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
		result.append(" (selected: ");
		result.append(selected);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //CheckBoxImpl
