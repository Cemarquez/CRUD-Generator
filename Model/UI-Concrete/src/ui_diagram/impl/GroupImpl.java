/**
 */
package ui_diagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ui_diagram.Group;
import ui_diagram.Ui_diagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_diagram.impl.GroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link ui_diagram.impl.GroupImpl#getTitleFont <em>Title Font</em>}</li>
 *   <li>{@link ui_diagram.impl.GroupImpl#getTitleFontSize <em>Title Font Size</em>}</li>
 *   <li>{@link ui_diagram.impl.GroupImpl#getTitleFontColor <em>Title Font Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends GraphicalContainerImpl implements Group {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected String titleFont = TITLE_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected String titleFontSize = TITLE_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFontColor() <em>Title Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFontColor() <em>Title Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontColor()
	 * @generated
	 * @ordered
	 */
	protected String titleFontColor = TITLE_FONT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_diagramPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.GROUP__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleFont() {
		return titleFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleFont(String newTitleFont) {
		String oldTitleFont = titleFont;
		titleFont = newTitleFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.GROUP__TITLE_FONT, oldTitleFont, titleFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleFontSize() {
		return titleFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleFontSize(String newTitleFontSize) {
		String oldTitleFontSize = titleFontSize;
		titleFontSize = newTitleFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.GROUP__TITLE_FONT_SIZE, oldTitleFontSize, titleFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleFontColor() {
		return titleFontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleFontColor(String newTitleFontColor) {
		String oldTitleFontColor = titleFontColor;
		titleFontColor = newTitleFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.GROUP__TITLE_FONT_COLOR, oldTitleFontColor, titleFontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_diagramPackage.GROUP__TITLE:
				return getTitle();
			case Ui_diagramPackage.GROUP__TITLE_FONT:
				return getTitleFont();
			case Ui_diagramPackage.GROUP__TITLE_FONT_SIZE:
				return getTitleFontSize();
			case Ui_diagramPackage.GROUP__TITLE_FONT_COLOR:
				return getTitleFontColor();
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
			case Ui_diagramPackage.GROUP__TITLE:
				setTitle((String)newValue);
				return;
			case Ui_diagramPackage.GROUP__TITLE_FONT:
				setTitleFont((String)newValue);
				return;
			case Ui_diagramPackage.GROUP__TITLE_FONT_SIZE:
				setTitleFontSize((String)newValue);
				return;
			case Ui_diagramPackage.GROUP__TITLE_FONT_COLOR:
				setTitleFontColor((String)newValue);
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
			case Ui_diagramPackage.GROUP__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Ui_diagramPackage.GROUP__TITLE_FONT:
				setTitleFont(TITLE_FONT_EDEFAULT);
				return;
			case Ui_diagramPackage.GROUP__TITLE_FONT_SIZE:
				setTitleFontSize(TITLE_FONT_SIZE_EDEFAULT);
				return;
			case Ui_diagramPackage.GROUP__TITLE_FONT_COLOR:
				setTitleFontColor(TITLE_FONT_COLOR_EDEFAULT);
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
			case Ui_diagramPackage.GROUP__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Ui_diagramPackage.GROUP__TITLE_FONT:
				return TITLE_FONT_EDEFAULT == null ? titleFont != null : !TITLE_FONT_EDEFAULT.equals(titleFont);
			case Ui_diagramPackage.GROUP__TITLE_FONT_SIZE:
				return TITLE_FONT_SIZE_EDEFAULT == null ? titleFontSize != null : !TITLE_FONT_SIZE_EDEFAULT.equals(titleFontSize);
			case Ui_diagramPackage.GROUP__TITLE_FONT_COLOR:
				return TITLE_FONT_COLOR_EDEFAULT == null ? titleFontColor != null : !TITLE_FONT_COLOR_EDEFAULT.equals(titleFontColor);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", titleFont: ");
		result.append(titleFont);
		result.append(", titleFontSize: ");
		result.append(titleFontSize);
		result.append(", titleFontColor: ");
		result.append(titleFontColor);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
