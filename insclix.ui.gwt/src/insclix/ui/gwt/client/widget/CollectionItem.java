package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasDismissable;
import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.type.CollectionType;
import gwt.material.design.client.ui.MaterialCollectionItem;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CollectionItem implements IsWidget, HasColors, HasDismissable, HasWaves, HasClickHandlers{

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
	
}
