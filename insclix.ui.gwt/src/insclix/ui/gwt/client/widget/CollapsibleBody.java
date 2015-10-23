package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialCollapsibleBody;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;


public class CollapsibleBody implements HasColors, HasWaves, IsWidget, HasWidgets{

	private MaterialCollapsibleBody collapsibleBody;
	
	public CollapsibleBody(){
		collapsibleBody = new MaterialCollapsibleBody();
	}
	
	@Override
	public void setBackgroundColor(String bgColor) {
		collapsibleBody.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		collapsibleBody.setTextColor(textColor);
	}
	
	@Override
	public void setWaves(String waves) {
		collapsibleBody.setWaves(waves);
	}


	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collapsibleBody;
	}

	@Override
	public void initWaves() {
		collapsibleBody.initWaves();
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		collapsibleBody.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		collapsibleBody.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return collapsibleBody.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return collapsibleBody.remove(w);
	}

}
