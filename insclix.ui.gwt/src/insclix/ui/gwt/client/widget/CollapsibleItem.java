package insclix.ui.gwt.client.widget;

import gwt.material.design.client.ui.MaterialCollapsibleItem;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CollapsibleItem implements HasWidgets, IsWidget{

	
	private MaterialCollapsibleItem collapsibleItem;
	
	public CollapsibleItem() {
		collapsibleItem = new MaterialCollapsibleItem();
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collapsibleItem;
	}

	@Override
	public void add(Widget w) {
		collapsibleItem.add(w);
	}

	@Override
	public void clear() {
		collapsibleItem.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return collapsibleItem.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return collapsibleItem.remove(w);
	}


}
