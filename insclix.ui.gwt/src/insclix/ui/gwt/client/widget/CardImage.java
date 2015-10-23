package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialCardImage;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardImage implements HasWaves, IsWidget, HasWidgets{

	private MaterialCardImage cardImage;
	
	public CardImage(){
		cardImage = new MaterialCardImage();
	}
	
	@Override
	public void setWaves(String waves) {
		cardImage.setWaves(waves);
	}
	
	
	public void initWaves(){
		cardImage.initWaves();
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return cardImage;
	}
	
	@Override
	public void add(Widget w) {
		cardImage.add(w);
	}

	@Override
	public void clear() {
		cardImage.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return cardImage.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return cardImage.remove(w);
	}
}