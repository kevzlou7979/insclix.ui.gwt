package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasError;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialSwitch;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;


public class Switch  implements IsWidget, HasClickHandlers, HasGrid, HasError, HasWidgets{

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
	@Override
	public void fireEvent(GwtEvent<?> event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		iSwitch.add(w);
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		iSwitch.clear();
	}
	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return iSwitch.iterator();
	}
	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return iSwitch.remove(w);
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return iSwitch;
	}
	
	
	
}
