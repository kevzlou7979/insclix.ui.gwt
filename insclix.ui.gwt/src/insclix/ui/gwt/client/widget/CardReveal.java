package insclix.ui.gwt.client.widget;

import gwt.material.design.client.ui.MaterialCardReveal;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardReveal implements IsWidget{

	private MaterialCardReveal cardReveal;
	
	public CardReveal(){
		cardReveal = new MaterialCardReveal();
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return cardReveal;
	}
	
	
}