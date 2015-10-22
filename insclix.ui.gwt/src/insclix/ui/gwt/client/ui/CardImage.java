package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasWaves;
import gwt.material.design.client.ui.MaterialCardImage;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardImage implements HasWaves, IsWidget{

	private MaterialCardImage cardImage;
	
	public CardImage(){
		cardImage = new MaterialCardImage();
	}

    public void add(final Widget child) {
    	cardImage.add(child);
    }

    public void insert(final Widget child, final int beforeIndex) {
        cardImage.insert(child, beforeIndex);
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
}