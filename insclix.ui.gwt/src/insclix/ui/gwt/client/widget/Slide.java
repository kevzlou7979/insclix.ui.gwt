package insclix.ui.gwt.client.widget;


import gwt.material.design.client.ui.MaterialSlide;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Slide implements IsWidget{

	private MaterialSlide slide;
	
	public Slide() {
		slide = new MaterialSlide();
	}
	
	public MaterialSlide getSlide() {
		return slide;
	}
	
	public void setSlide(MaterialSlide slide) {
		this.slide = slide;
	}
	
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return slide;
	}
	
}
