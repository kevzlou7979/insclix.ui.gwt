package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasHref;
import gwt.material.design.client.ui.MaterialNavBrand;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class NavBrand implements IsWidget, HasText, HasHref{

	private MaterialNavBrand navBrand;
	
	public NavBrand() {
		navBrand = new MaterialNavBrand();
	}
	
	@Override
	public void setText(String text) {
		navBrand.setText(text);
	}

	@Override
	public void setHref(String href) {
		navBrand.setHref(href);
	}

	public void setAlign(String align){
		navBrand.setAlign(align);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return navBrand.getText();
	}

	@Override
	public void setTarget(String target) {
		navBrand.setTarget(target);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return navBrand;
	}
	
}
