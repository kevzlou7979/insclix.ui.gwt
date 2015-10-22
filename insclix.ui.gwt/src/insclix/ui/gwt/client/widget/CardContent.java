package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.ui.MaterialCardContent;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardContent  implements HasColors, IsWidget{

	private MaterialCardContent cardContent;
	
	public CardContent(){
		cardContent = new MaterialCardContent();
	}
	
	@Override
	public void setBackgroundColor(String bgColor) {
		cardContent.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		cardContent.setTextColor(textColor);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return cardContent;
	}
	
}
