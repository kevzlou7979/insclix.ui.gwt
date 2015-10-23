package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.custom.HasColors;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialCard;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Card implements IsWidget, HasColors, HasGrid, HasWidgets{


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

	@Override
	public void add(Widget w) {
		card.add(w);
	}

	@Override
	public void clear() {
		card.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return card.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return card.remove(w);
	}

}
