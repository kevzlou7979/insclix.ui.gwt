package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasActive;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.type.CollapsibleType;
import gwt.material.design.client.ui.MaterialCollapsible;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Collapsible implements HasGrid, HasActive, IsWidget, HasWidgets{

	private MaterialCollapsible collapsible;
	
	public Collapsible() {
		collapsible = new MaterialCollapsible();
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

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		collapsible.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		collapsible.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return collapsible.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return collapsible.remove(w);
	}
	
}
