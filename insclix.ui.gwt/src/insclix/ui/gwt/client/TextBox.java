package insclix.ui.gwt.client;

import gwt.material.design.client.custom.HasError;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialTextBox;

import com.google.gwt.editor.client.IsEditor;
import com.google.gwt.editor.ui.client.adapters.ValueBoxEditor;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.GestureChangeHandler;
import com.google.gwt.event.dom.client.GestureEndHandler;
import com.google.gwt.event.dom.client.GestureStartHandler;
import com.google.gwt.event.dom.client.HasAllDragAndDropHandlers;
import com.google.gwt.event.dom.client.HasAllFocusHandlers;
import com.google.gwt.event.dom.client.HasAllGestureHandlers;
import com.google.gwt.event.dom.client.HasAllKeyHandlers;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasAllTouchHandlers;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.AutoDirectionHandler;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.i18n.shared.HasDirectionEstimator;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasName;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class TextBox  implements HasChangeHandlers, HasName, HasDirectionEstimator, HasValue<String>,
HasText, AutoDirectionHandler.Target, IsEditor<ValueBoxEditor<String>>,
HasKeyUpHandlers, HasClickHandlers, HasDoubleClickHandlers,
HasEnabled, HasAllDragAndDropHandlers, HasAllFocusHandlers,
HasAllGestureHandlers, HasAllKeyHandlers, HasAllMouseHandlers,
HasAllTouchHandlers, HasGrid, HasError, IsWidget{

	private MaterialTextBox textBox = null;

	public TextBox() {
		textBox = new MaterialTextBox();
		textBox.onAttach();
	}

	@Override
	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<String> handler) {
		// TODO Auto-generated method stub
		return textBox.addValueChangeHandler(handler);
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		textBox.setDirection(direction);
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return textBox.getDirection();
	}

	@Override
	public HandlerRegistration addDragEndHandler(DragEndHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDragEndHandler(handler);
	}

	@Override
	public HandlerRegistration addDragEnterHandler(DragEnterHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDragEnterHandler(handler);
	}

	@Override
	public HandlerRegistration addDragLeaveHandler(DragLeaveHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDragLeaveHandler(handler);
	}

	@Override
	public HandlerRegistration addDragHandler(DragHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDragHandler(handler);
	}

	@Override
	public HandlerRegistration addDragOverHandler(DragOverHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDragOverHandler(handler);
	}

	@Override
	public HandlerRegistration addDragStartHandler(DragStartHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDragStartHandler(handler);
	}

	@Override
	public HandlerRegistration addDropHandler(DropHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDropHandler(handler);
	}

	@Override
	public HandlerRegistration addFocusHandler(FocusHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addFocusHandler(handler);
	}

	@Override
	public HandlerRegistration addBlurHandler(BlurHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addBlurHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureStartHandler(
			GestureStartHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addGestureStartHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureChangeHandler(
			GestureChangeHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addGestureChangeHandler(handler);
	}

	@Override
	public HandlerRegistration addGestureEndHandler(GestureEndHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addGestureEndHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addKeyDownHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addKeyPressHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addMouseDownHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addMouseUpHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addMouseOutHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addMouseOverHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addMouseMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addMouseWheelHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchStartHandler(TouchStartHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addTouchStartHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchMoveHandler(TouchMoveHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addTouchMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchEndHandler(TouchEndHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addTouchEndHandler(handler);
	}

	@Override
	public HandlerRegistration addTouchCancelHandler(TouchCancelHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addTouchCancelHandler(handler);
	}

	@Override
	public void setError(String error) {
		// TODO Auto-generated method stub
		textBox.setError(error);
	}

	@Override
	public void setSuccess(String success) {
		// TODO Auto-generated method stub
		textBox.setSuccess(success);
	}

	@Override
	public void setGrid(String grid) {
		// TODO Auto-generated method stub
		textBox.setGrid(grid);
	}

	@Override
	public void setOffset(String offset) {
		// TODO Auto-generated method stub
		textBox.setOffset(offset);
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return textBox.isEnabled();
	}

	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		textBox.setEnabled(enabled);
	}

	@Override
	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addDoubleClickHandler(handler);
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addClickHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addKeyUpHandler(handler);
	}

	@Override
	public ValueBoxEditor<String> asEditor() {
		// TODO Auto-generated method stub
		return textBox.asEditor();
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return textBox.getText();
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		textBox.setText(text);
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return textBox.getValue();
	}

	@Override
	public void setValue(String value) {
		// TODO Auto-generated method stub
		textBox.setValue(value);
	}

	@Override
	public void setValue(String value, boolean fireEvents) {
		// TODO Auto-generated method stub
		textBox.setValue(value, fireEvents);
	}

	@Override
	public DirectionEstimator getDirectionEstimator() {
		// TODO Auto-generated method stub
		return textBox.getDirectionEstimator();
	}

	@Override
	public void setDirectionEstimator(boolean enabled) {
		// TODO Auto-generated method stub
		textBox.setDirectionEstimator(enabled);
	}

	@Override
	public void setDirectionEstimator(DirectionEstimator directionEstimator) {
		// TODO Auto-generated method stub
		textBox.setDirectionEstimator(directionEstimator);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		textBox.setName(name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return textBox.getName();
	}

	@Override
	public HandlerRegistration addChangeHandler(ChangeHandler handler) {
		// TODO Auto-generated method stub
		return textBox.addChangeHandler(handler);
	}
	
	public void setInvalid() {
		textBox.setInvalid();
	}

	public void setValid() {
		textBox.setValid();
	}

	public void clear() {
		textBox.clear();
	}

	public void backToDefault() {
		textBox.backToDefault();
	}
	
	public String getPlaceholder() {
		return textBox.getPlaceholder();
	}

	public void setPlaceholder(String placeholder) {
		textBox.setPlaceholder(placeholder);
	}

	public String getType() {
		return textBox.getType();
	}

	public void setType(String type) {
		textBox.setType(type);
	}

	public String getIcon() {
		return textBox.getIcon();
	}

	public void setIcon(String icon) {
		textBox.setIcon(icon);
	}

	public boolean isValid() {
		return textBox.isValid();
	}

	public void setValid(boolean isValid) {
		textBox.setValid(isValid);
	}
	
	public String getLength() {
		return textBox.getLength();
	}

	public void setLength(String length) {
		textBox.setLength(length);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return textBox;
	}

}
