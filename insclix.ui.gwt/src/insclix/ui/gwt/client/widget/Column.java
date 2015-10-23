package insclix.ui.gwt.client.widget;


import java.util.Iterator;

import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialColumn;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Column implements HasGrid, IsWidget, HasWidgets{

	private MaterialColumn column;
	
	public Column(String html) {
		column = new MaterialColumn("");
	}

	@Override
	public void setGrid(String grid) {
		column.setGrid(grid);
	}

	@Override
	public void setOffset(String offset) {
		column.setOffset(offset);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return column;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		column.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		column.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return column.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return column.remove(w);
	}

}
