package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialTeamItem;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class TeamItem implements IsWidget {

	public MaterialTeamItem teamItem;

	public TeamItem(){
		teamItem = new MaterialTeamItem();
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return teamItem;
	}
	

}
