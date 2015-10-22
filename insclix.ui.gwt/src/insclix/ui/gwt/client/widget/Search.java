package insclix.ui.gwt.client.widget;


import gwt.material.design.client.ui.MaterialSearch;

import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Search  implements IsWidget, HasText,HasKeyUpHandlers {

	private MaterialSearch search;
	public Search() {
		search = new MaterialSearch();
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		// TODO Auto-generated method stub
		search.fireEvent(event);
		
	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		// TODO Auto-generated method stub
		return search.addKeyUpHandler(handler);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return search.getText();
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		search.setText(text);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return search;
	}

	public MaterialSearch getSearch() {
		return search;
	}

	public void setSearch(MaterialSearch search) {
		this.search = search;
	}
	

}


