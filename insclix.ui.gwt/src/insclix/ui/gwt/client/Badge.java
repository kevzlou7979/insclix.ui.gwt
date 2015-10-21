package insclix.ui.gwt.client;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.ui.MaterialBadge;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class Badge extends Composite implements HasColors, HasText{

	interface BadgeUiBinder extends UiBinder<Widget, Badge> {
	}

	private MaterialBadge badge;
	
	@SuppressWarnings("deprecation")
	public Badge() {
		badge = new MaterialBadge();
		setWidget(badge);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return badge.getText();
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		badge.setText(text);
	}

	@Override
	public void setBackgroundColor(String bgColor) {
		// TODO Auto-generated method stub
		badge.setBackgroundColor(bgColor);
	}

	@Override
	public void setTextColor(String textColor) {
		// TODO Auto-generated method stub
		badge.setTextColor(textColor);
	}

}