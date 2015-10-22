package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasLoader;
import gwt.material.design.client.type.NavBarType;
import gwt.material.design.client.ui.MaterialNavBar;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class NavBar implements IsWidget, HasWidgets, HasColors, HasLoader{

	private MaterialNavBar navBar;
	
	public NavBar() {
		navBar = new MaterialNavBar();
	}

	public void setSideBar(String sideBar){
		navBar.setSideBar(sideBar);
	}


	@Override
	public void add(Widget w) {
		navBar.add(w);
	}

	@Override
	public void clear() {
		navBar.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return navBar.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return navBar.remove(w);
	}

	@Override
	public void setBackgroundColor(String bgColor) {
		navBar.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		navBar.setTextColor(textColor);
	}

	public void setType(NavBarType type) {
		navBar.setType(type);
	}

	@Override
	public void showLoader() {
		navBar.showLoader();
	}

	@Override
	public void hideLoader() {
		navBar.hideLoader();
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return navBar;
	}


}
