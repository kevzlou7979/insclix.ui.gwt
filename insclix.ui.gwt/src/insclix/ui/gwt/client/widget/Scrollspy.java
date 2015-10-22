package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialScrollspy;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Scrollspy implements IsWidget {
	private MaterialScrollspy scrollSpy;
	public Scrollspy() {
		scrollSpy = new MaterialScrollspy();
	}
	public MaterialScrollspy getScrollSpy() {
		return scrollSpy;
	}
	public void setScrollSpy(MaterialScrollspy scrollSpy) {
		this.scrollSpy = scrollSpy;
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return scrollSpy;
	}
	
	
	
	
}
