package insclix.ui.gwt.client.widget;

import gwt.material.design.client.ui.MaterialTitle;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
public class Title implements IsWidget {
	
	
	private MaterialTitle title;
	
	public Title(){
		title = new MaterialTitle();
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return title;
	}
	public MaterialTitle getTitle() {
		return title;
	}

	public void setTitle(MaterialTitle title) {
		this.title = title;
	}

	


	

	
	
	
}
