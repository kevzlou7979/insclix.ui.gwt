package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.ui.MaterialCardContent;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardContent  implements HasColors, IsWidget, HasWidgets{

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
	
	@Override
	public void add(Widget w) {
		cardContent.add(w);
	}

	@Override
	public void clear() {
		cardContent.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return cardContent.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return cardContent.remove(w);
	}
	
}
