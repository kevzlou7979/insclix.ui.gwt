package insclix.ui.gwt.client.widget;


import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialCollapsibleHeader;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CollapsibleHeader implements IsWidget, HasColors, HasWaves{
	
	private MaterialCollapsibleHeader collapsibleHeader;
	
	public CollapsibleHeader() {
		collapsibleHeader = new MaterialCollapsibleHeader(); 
	}
	

	@Override
	public void setBackgroundColor(String bgColor) {
		collapsibleHeader.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		collapsibleHeader.setTextColor(textColor);
	}

	@Override
	public void setWaves(String waves) {
		collapsibleHeader.setWaves(waves);
	}

	@Override
	public void initWaves(){
		collapsibleHeader.initWaves();
	}


	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return collapsibleHeader;
	}

	
}
