package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialCard;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Card implements IsWidget, HasColors, HasGrid{


	private MaterialCard card;
	
	public Card(){
		card = new MaterialCard();
	}

	@Override
	public void setBackgroundColor(String bgColor) {
		card.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		card.setTextColor(textColor);
	}

	@Override
	public void setGrid(String grid) {
		card.setGrid(grid);
	}

	@Override
	public void setOffset(String offset) {
		card.setOffset(offset);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return card;
	}

}
