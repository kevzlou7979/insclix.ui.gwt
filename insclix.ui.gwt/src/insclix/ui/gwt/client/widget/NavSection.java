package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.ui.MaterialNavSection;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class NavSection implements IsWidget, HasWidgets{

	private MaterialNavSection navSection;
	
	public NavSection() {
		// TODO Auto-generated constructor stub
		navSection = new MaterialNavSection();
	}
	
	public void setAlign(String align){
		navSection.setAlign(align);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return navSection;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		navSection.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		navSection.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return navSection.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return navSection.remove(w);
	}
	
}
