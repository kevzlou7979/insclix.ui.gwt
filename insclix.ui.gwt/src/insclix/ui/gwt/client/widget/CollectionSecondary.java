package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasHref;
import gwt.material.design.client.ui.MaterialCollectionSecondary;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CollectionSecondary implements HasHref, IsWidget{

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

}
