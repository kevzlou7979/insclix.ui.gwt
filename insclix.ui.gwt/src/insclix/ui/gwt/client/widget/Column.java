package insclix.ui.gwt.client.widget;


import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialColumn;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Column implements HasGrid, IsWidget{

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

}
