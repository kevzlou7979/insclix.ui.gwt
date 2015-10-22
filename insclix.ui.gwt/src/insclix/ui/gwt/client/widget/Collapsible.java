package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasActive;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.type.CollapsibleType;
import gwt.material.design.client.ui.MaterialCollapsible;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Collapsible implements HasGrid, HasActive, IsWidget{

	private MaterialCollapsible collapsible;
	
	public Collapsible() {
		collapsible = new MaterialCollapsible();
	}
		
	public void add(Widget child) {
		collapsible.add(child);
	}

	public void setType(CollapsibleType type) {
		collapsible.setType(type);
	}

	@Override
	public void setGrid(String grid) {
		collapsible.setGrid(grid);
	}
	
	@Override
	public void setOffset(String offset) {
		collapsible.setOffset(offset);
	}

	@Override
	public void setActive(int index) {
		collapsible.setActive(index);
	}

	@Override
	public int getActive() {
		return collapsible.getActive();
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collapsible;
	}
	
}
