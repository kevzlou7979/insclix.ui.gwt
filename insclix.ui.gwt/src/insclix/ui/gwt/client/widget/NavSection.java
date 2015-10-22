package insclix.ui.gwt.client.widget;

import gwt.material.design.client.ui.MaterialNavSection;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class NavSection implements IsWidget{

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
	
}
