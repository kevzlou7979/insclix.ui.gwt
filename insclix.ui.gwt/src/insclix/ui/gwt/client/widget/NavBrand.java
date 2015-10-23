package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasHref;
import gwt.material.design.client.ui.MaterialNavBrand;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class NavBrand implements IsWidget, HasText, HasHref, HasWidgets{

	private MaterialNavBrand navBrand;
	
	public NavBrand() {
		navBrand = new MaterialNavBrand();
	}
	
	@Override
	public void setText(String text) {
		navBrand.setText(text);
	}

	@Override
	public void setHref(String href) {
		navBrand.setHref(href);
	}

	public void setAlign(String align){
		navBrand.setAlign(align);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return navBrand.getText();
	}

	@Override
	public void setTarget(String target) {
		navBrand.setTarget(target);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return navBrand;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		navBrand.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		navBrand.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return navBrand.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return navBrand.remove(w);
	}
	
}
