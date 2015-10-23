package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasHref;
import gwt.material.design.client.ui.MaterialCollectionSecondary;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CollectionSecondary implements HasHref, IsWidget, HasWidgets{

	private MaterialCollectionSecondary collectionSecondary;
	
	public CollectionSecondary(){
		collectionSecondary = new MaterialCollectionSecondary();
	}
	
	@Override
	public void setHref(String href) {
		collectionSecondary.setHref(href);
	}

	@Override
	public void setTarget(String target) {
		collectionSecondary.setTarget(target);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collectionSecondary;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		collectionSecondary.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		collectionSecondary.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return collectionSecondary.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return collectionSecondary.remove(w);
	}

}
