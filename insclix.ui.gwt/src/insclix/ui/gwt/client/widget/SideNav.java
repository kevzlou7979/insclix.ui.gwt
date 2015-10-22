package insclix.ui.gwt.client.widget;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialSideNav;

public class SideNav  implements IsWidget,HasWaves {
 
	private MaterialSideNav sideNav;
	
	public SideNav() {
		// TODO Auto-generated constructor stub
		setSideNav(new MaterialSideNav());
	}

	@Override
	public void setWaves(String waves) {
		// TODO Auto-generated method stub
		sideNav.setWaves(waves);
		
	}

	@Override
	public void initWaves() {
		// TODO Auto-generated method stub
		sideNav.initWaves();
	}

	public MaterialSideNav getSideNav() {
		return sideNav;
	}

	public void setSideNav(MaterialSideNav sideNav) {
		this.sideNav = sideNav;
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return sideNav;
	}
}
