package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasActive;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialCollection;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Collection implements HasActive, HasGrid, IsWidget, HasWidgets{
	
	
	private MaterialCollection collection;
	
	public Collection() {
		collection = new MaterialCollection();
	}
	
	public void setHeader(String header){
		collection.setHeader(header);
	}

	@Override
	public void setActive(int index) {
		collection.setActive(index);
	}

	@Override
	public int getActive() {
		return collection.getActive();
	}

	@Override
	public void setGrid(String grid) {
		collection.setGrid(grid);
	}

	@Override
	public void setOffset(String offset) {
		collection.setOffset(offset);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collection;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		collection.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		collection.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return collection.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return collection.remove(w);
	}
}
