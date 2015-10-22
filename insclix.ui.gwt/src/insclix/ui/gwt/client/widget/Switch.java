package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.ComplexWidget;
import gwt.material.design.client.custom.HasError;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialSwitch;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;


public class Switch extends ComplexWidget implements HasClickHandlers, HasGrid, HasError{

	private MaterialSwitch iSwitch;
	public Switch() {
		iSwitch = new MaterialSwitch();
	}
	@Override
	public void setError(String error) {
		// TODO Auto-generated method stub
		iSwitch.setError(error);
		
	}
	@Override
	public void setSuccess(String success) {
		// TODO Auto-generated method stub
		iSwitch.setSuccess(success);
		
	}
	@Override
	public void setGrid(String grid) {
		// TODO Auto-generated method stub
		iSwitch.setGrid(grid);
		
	}
	@Override
	public void setOffset(String offset) {
		// TODO Auto-generated method stub
		iSwitch.setOffset(offset);
		
	}
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		// TODO Auto-generated method stub
		return iSwitch.addClickHandler(handler);
	}
	public MaterialSwitch getiSwitch() {
		return iSwitch;
	}
	public void setiSwitch(MaterialSwitch iSwitch) {
		this.iSwitch = iSwitch;
	}
	
	
	
}
