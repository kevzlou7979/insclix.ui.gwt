package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.ui.MaterialCardAction;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;


public class CardAction implements IsWidget, HasColors{

	private MaterialCardAction cardAction;
	
	public CardAction(){
		cardAction = new MaterialCardAction();
	}
	
	@Override
	public void setBackgroundColor(String bgColor) {
		cardAction.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		cardAction.setTextColor(textColor);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return cardAction;
	}
	
}
