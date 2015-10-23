package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialSideNav;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class SideNav  implements IsWidget,HasWaves, HasWidgets {
 
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

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		sideNav.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		sideNav.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return sideNav.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return sideNav.remove(w);
	}

}
