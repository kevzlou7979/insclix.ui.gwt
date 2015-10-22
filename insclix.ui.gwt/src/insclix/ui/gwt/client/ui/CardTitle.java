package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasIcons;
import gwt.material.design.client.ui.MaterialCardTitle;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardTitle implements IsWidget, HasIcons, HasColors{

	private MaterialCardTitle cardTitle;
	
	public CardTitle(){
		cardTitle = new MaterialCardTitle();
	}

	@Override
	public void setIcon(String icon) {
		cardTitle.setIcon(icon);
	}

	@Override
	public void setIconPosition(String iconPosition) {
		cardTitle.setIconPosition(iconPosition);
	}

	@Override
	public void setSize(String size) {
		cardTitle.setSize(size);
	}

	@Override
	public void setIconColor(String iconColor) {
		cardTitle.setIconColor(iconColor);
	}
	
	public String getText() {
		return cardTitle.getText();
	}

	public void setText(String text) {
		cardTitle.setText(text);
	}

	@Override
	public void setBackgroundColor(String bgColor) {
		cardTitle.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		cardTitle.setTextColor(textColor);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return cardTitle;
	}

}
