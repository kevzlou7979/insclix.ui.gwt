package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasActivates;
import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasDisabled;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.custom.HasHref;
import gwt.material.design.client.custom.HasIcons;
import gwt.material.design.client.custom.HasTooltip;
import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialButton;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDoubleClickHandlers;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Button implements HasAllMouseHandlers, HasClickHandlers, HasDoubleClickHandlers, HasHref, HasTooltip
, HasGrid, HasActivates, HasColors, HasWaves, HasDisabled, HasText, HasIcons, IsWidget{

	private MaterialButton button = null;
	
	public Button() {
		button = new MaterialButton();
		button.onLoad();
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		// TODO Auto-generated method stub
		return button.addMouseDownHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		// TODO Auto-generated method stub
		return button.addMouseUpHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		// TODO Auto-generated method stub
		return button.addMouseOutHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		// TODO Auto-generated method stub
		return button.addMouseOverHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		// TODO Auto-generated method stub
		return button.addMouseMoveHandler(handler);
	}

	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		// TODO Auto-generated method stub
		return button.addMouseWheelHandler(handler);
	}

	@Override
	public void setIcon(String icon) {
		// TODO Auto-generated method stub
		button.setIcon(icon);
	}

	@Override
	public void setIconPosition(String iconPosition) {
		// TODO Auto-generated method stub
		button.setIconPosition(iconPosition);
	}

	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub
		button.setSize(size);
	}

	@Override
	public void setIconColor(String iconColor) {
		// TODO Auto-generated method stub
		button.setIconColor(iconColor);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return button.getText();
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		button.setText(text);
	}

	@Override
	public void setDisabled(boolean disabled) {
		// TODO Auto-generated method stub
		button.setDisabled(disabled);
	}

	@Override
	public boolean isDisabled() {
		// TODO Auto-generated method stub
		return button.isDisabled();
	}

	@Override
	public void setWaves(String waves) {
		// TODO Auto-generated method stub
		button.setWaves(waves);
	}

	@Override
	public void initWaves() {
		// TODO Auto-generated method stub
		button.initWaves();
	}

	@Override
	public void setBackgroundColor(String bgColor) {
		// TODO Auto-generated method stub
		button.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		// TODO Auto-generated method stub
		button.setTextColor(textColor);
	}

	@Override
	public void setActivates(String activates) {
		// TODO Auto-generated method stub
		button.setActivates(activates);
	}

	@Override
	public void setGrid(String grid) {
		// TODO Auto-generated method stub
		button.setGrid(grid);
	}

	@Override
	public void setOffset(String offset) {
		// TODO Auto-generated method stub
		button.setOffset(offset);
	}

	@Override
	public void setTooltip(String tooltip) {
		// TODO Auto-generated method stub
		button.setTooltip(tooltip);
	}

	@Override
	public void setTooltipLocation(String tooltipLocation) {
		// TODO Auto-generated method stub
		button.setTooltipLocation(tooltipLocation);
	}

	@Override
	public void initTooltip() {
		// TODO Auto-generated method stub
		button.initTooltip();
	}

	@Override
	public void setHref(String href) {
		// TODO Auto-generated method stub
		button.setHref(href);
	}

	@Override
	public void setTarget(String target) {
		// TODO Auto-generated method stub
		button.setTarget(target);
	}

	@Override
	public HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler) {
		// TODO Auto-generated method stub
		return button.addDoubleClickHandler(handler);
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		// TODO Auto-generated method stub
		return button.addClickHandler(handler);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return button;
	}

}
