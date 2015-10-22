package insclix.ui.gwt.client.widget;

import gwt.material.design.client.ui.MaterialTopNav;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class TopNav  implements IsWidget  {
	private MaterialTopNav topNav;
	public TopNav(){
		setTopNav(new MaterialTopNav());
	}
	public MaterialTopNav getTopNav() {
		return topNav;
	}
	public void setTopNav(MaterialTopNav topNav) {
		this.topNav = topNav;
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return topNav;
	}
	

	

}
