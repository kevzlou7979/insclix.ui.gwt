package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasActive;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialCollection;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Collection implements HasActive, HasGrid, IsWidget{
	
	
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
}
