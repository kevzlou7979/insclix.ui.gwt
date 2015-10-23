package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.ui.MaterialContainer;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Container implements IsWidget, HasWidgets{

	
	private MaterialContainer container;
	
	public Container() {
		container = new MaterialContainer();
	}

	@Override
	public Widget asWidget() {
		return container;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		container.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		container.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return container.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return container.remove(w);
	}

	
}
