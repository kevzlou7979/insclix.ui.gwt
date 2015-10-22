package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasDisabled;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.type.CheckBoxType;
import gwt.material.design.client.ui.MaterialCheckBox;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CheckBox implements IsWidget, HasClickHandlers, HasGrid, HasDisabled{

	
	private MaterialCheckBox checkBox;
	
	public CheckBox() {
		checkBox = new MaterialCheckBox();
	}

	public Object getObject() {
		return checkBox.getObject();
	}

	public void setObject(Object object) {
		checkBox.setObject(object);
	}
	
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return checkBox.addClickHandler(handler);
	}

	public String getOld() {
		return getOld();
	}

	public void setOld(String old) {
		checkBox.setOld(old);
	}
	
	@Override
	public boolean isDisabled() {
		return checkBox.isDisabled();
	}
	
	@Override
	public void setDisabled(boolean disabled) {
		checkBox.setDisabled(disabled);
	}

	public void setType(CheckBoxType type) {
		checkBox.setType(type);
	}

	@Override
	public void setGrid(String grid) {
		checkBox.setGrid(grid);
	}
	
	@Override
	public void setOffset(String offset) {
		checkBox.setOffset(offset);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		checkBox.fireEvent(event);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return checkBox;
	}
	
	

}
