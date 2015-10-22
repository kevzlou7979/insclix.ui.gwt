package insclix.ui.gwt.client.widget;

import gwt.material.design.client.ui.MaterialContainer;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Container implements IsWidget{

	
	private MaterialContainer container;
	
	public Container() {
		container = new MaterialContainer();
	}

	@Override
	public Widget asWidget() {
		return container;
	}

	
}
