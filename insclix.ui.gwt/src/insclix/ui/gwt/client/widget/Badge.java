package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.ui.MaterialBadge;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Badge implements HasColors, HasText, IsWidget{

	private MaterialBadge badge;
	
	
	public Badge() {
		badge = new MaterialBadge();
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

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return badge;
	}

}
