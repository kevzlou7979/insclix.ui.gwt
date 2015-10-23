package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasDismissable;
import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.type.CollectionType;
import gwt.material.design.client.ui.MaterialCollectionItem;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CollectionItem implements IsWidget, HasColors, HasDismissable, HasWaves, HasClickHandlers, HasWidgets{

	private MaterialCollectionItem collectionItem;
	
	public CollectionItem() {
		collectionItem = new MaterialCollectionItem();
	}
	
	public void setType(CollectionType type){
		collectionItem.setType(type);
	}

	@Override
	public void setBackgroundColor(String bgColor) {
		collectionItem.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		collectionItem.setTextColor(textColor);
	}

	@Override
	public void setDismissable(boolean dismissable) {
		collectionItem.setDismissable(dismissable);
	}

	@Override
	public void setWaves(String waves) {
		collectionItem.setWaves(waves);
	}

	@Override
	public void initWaves(){
		collectionItem.initWaves();
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return collectionItem.addClickHandler(handler);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collectionItem;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		collectionItem.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		collectionItem.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return collectionItem.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return collectionItem.remove(w);
	}
	
}
