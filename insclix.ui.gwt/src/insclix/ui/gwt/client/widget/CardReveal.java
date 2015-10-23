package insclix.ui.gwt.client.widget;

import java.util.Iterator;

import gwt.material.design.client.ui.MaterialCardReveal;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class CardReveal implements IsWidget, HasWidgets{

	private MaterialCardReveal cardReveal;
	
	public CardReveal(){
		cardReveal = new MaterialCardReveal();
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return cardReveal;
	}

	@Override
	public void add(Widget w) {
		// TODO Auto-generated method stub
		cardReveal.add(w);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		cardReveal.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return cardReveal.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return cardReveal.remove(w);
	}
	
	
}