package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialTabs;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Tabs  implements IsWidget{
	
	private MaterialTabs tabs;
	public Tabs(){
		tabs = new MaterialTabs();
	}
	public MaterialTabs getTabs() {
		return tabs;
	}
	public void setTabs(MaterialTabs tabs) {
		this.tabs = tabs;
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return tabs;
	}
}
