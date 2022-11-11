/**
 */
package ui_diagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui_diagram.Button;
import ui_diagram.Ui_diagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_diagram.impl.ButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link ui_diagram.impl.ButtonImpl#getTextFont <em>Text Font</em>}</li>
 *   <li>{@link ui_diagram.impl.ButtonImpl#getTextFontSize <em>Text Font Size</em>}</li>
 *   <li>{@link ui_diagram.impl.ButtonImpl#getTextFontColor <em>Text Font Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends GraphicalIndividualImpl implements Button {
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
	 * The default value of the '{@link #getTextFont() <em>Text Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFont()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFont() <em>Text Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFont()
	 * @generated
	 * @ordered
	 */
	protected String textFont = TEXT_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextFontSize() <em>Text Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFontSize() <em>Text Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFontSize()
	 * @generated
	 * @ordered
	 */
	protected String textFontSize = TEXT_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextFontColor() <em>Text Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FONT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextFontColor() <em>Text Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFontColor()
	 * @generated
	 * @ordered
	 */
	protected String textFontColor = TEXT_FONT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_diagramPackage.Literals.BUTTON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.BUTTON__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFont() {
		return textFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFont(String newTextFont) {
		String oldTextFont = textFont;
		textFont = newTextFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.BUTTON__TEXT_FONT, oldTextFont, textFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFontSize() {
		return textFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFontSize(String newTextFontSize) {
		String oldTextFontSize = textFontSize;
		textFontSize = newTextFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.BUTTON__TEXT_FONT_SIZE, oldTextFontSize, textFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFontColor() {
		return textFontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFontColor(String newTextFontColor) {
		String oldTextFontColor = textFontColor;
		textFontColor = newTextFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.BUTTON__TEXT_FONT_COLOR, oldTextFontColor, textFontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_diagramPackage.BUTTON__TEXT:
				return getText();
			case Ui_diagramPackage.BUTTON__TEXT_FONT:
				return getTextFont();
			case Ui_diagramPackage.BUTTON__TEXT_FONT_SIZE:
				return getTextFontSize();
			case Ui_diagramPackage.BUTTON__TEXT_FONT_COLOR:
				return getTextFontColor();
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
			case Ui_diagramPackage.BUTTON__TEXT:
				setText((String)newValue);
				return;
			case Ui_diagramPackage.BUTTON__TEXT_FONT:
				setTextFont((String)newValue);
				return;
			case Ui_diagramPackage.BUTTON__TEXT_FONT_SIZE:
				setTextFontSize((String)newValue);
				return;
			case Ui_diagramPackage.BUTTON__TEXT_FONT_COLOR:
				setTextFontColor((String)newValue);
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
			case Ui_diagramPackage.BUTTON__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Ui_diagramPackage.BUTTON__TEXT_FONT:
				setTextFont(TEXT_FONT_EDEFAULT);
				return;
			case Ui_diagramPackage.BUTTON__TEXT_FONT_SIZE:
				setTextFontSize(TEXT_FONT_SIZE_EDEFAULT);
				return;
			case Ui_diagramPackage.BUTTON__TEXT_FONT_COLOR:
				setTextFontColor(TEXT_FONT_COLOR_EDEFAULT);
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
			case Ui_diagramPackage.BUTTON__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Ui_diagramPackage.BUTTON__TEXT_FONT:
				return TEXT_FONT_EDEFAULT == null ? textFont != null : !TEXT_FONT_EDEFAULT.equals(textFont);
			case Ui_diagramPackage.BUTTON__TEXT_FONT_SIZE:
				return TEXT_FONT_SIZE_EDEFAULT == null ? textFontSize != null : !TEXT_FONT_SIZE_EDEFAULT.equals(textFontSize);
			case Ui_diagramPackage.BUTTON__TEXT_FONT_COLOR:
				return TEXT_FONT_COLOR_EDEFAULT == null ? textFontColor != null : !TEXT_FONT_COLOR_EDEFAULT.equals(textFontColor);
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
		result.append(", textFont: ");
		result.append(textFont);
		result.append(", textFontSize: ");
		result.append(textFontSize);
		result.append(", textFontColor: ");
		result.append(textFontColor);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
