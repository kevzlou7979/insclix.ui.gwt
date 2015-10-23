
package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialSection;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Section implements IsWidget, HasWidgets{

	private MaterialSection section;
	
	public Section() {
		section = new MaterialSection();
	}

	@Override
	public void add(Widget w) {
		section.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		section.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return section.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return section.remove(w);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return null;
	}

}
