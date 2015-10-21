package insclix.ui.gwt.client.polymer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Button extends Composite {

	private static ButtonUiBinder uiBinder = GWT.create(ButtonUiBinder.class);

	interface ButtonUiBinder extends UiBinder<Widget, Button> {
	}

	public Button() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
