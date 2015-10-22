package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialCollapsibleBody;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;


public class CollapsibleBody implements HasColors, HasWaves, IsWidget{

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

}
