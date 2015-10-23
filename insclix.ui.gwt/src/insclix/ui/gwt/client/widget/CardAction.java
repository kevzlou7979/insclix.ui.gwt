package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.ui.MaterialCardAction;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;


public class CardAction implements IsWidget, HasColors, HasWidgets{

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
	
	@Override
	public void add(Widget w) {
		cardAction.add(w);
	}

	@Override
	public void clear() {
		cardAction.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return cardAction.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return cardAction.remove(w);
	}
}
