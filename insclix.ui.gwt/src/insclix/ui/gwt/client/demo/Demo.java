package insclix.ui.gwt.client.demo;

import gwt.material.design.client.custom.MaterialSuggestionOracle;
import insclix.ui.gwt.client.Autocomplete;
import insclix.ui.gwt.client.Button;
import insclix.ui.gwt.client.TextBox;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.paper.widget.PaperItem;
import com.vaadin.polymer.paper.widget.PaperMenu;

public class Demo extends Composite {

	private static DemoUiBinder uiBinder = GWT.create(DemoUiBinder.class);

	interface DemoUiBinder extends UiBinder<Widget, Demo> {
	}

	@UiField Button btnTest;
	@UiField TextBox txtSample;
	@UiField Autocomplete autocomplete;
	
	@UiField PaperMenu menu1;
	
	private static String[] letters = { "alpha", "beta", "gamma", "delta",
    "epsilon" };
	
	public Demo() {
		initWidget(uiBinder.createAndBindUi(this));
		initAutocomplete();
		initPolyMenu();
	}

	private void initPolyMenu() {
		for (String letter : letters) {
            menu1.add(new PaperItem(letter));
        }
	}

	private void initAutocomplete() {
		MaterialSuggestionOracle oracle = new MaterialSuggestionOracle();
		oracle.add("Name 1");
		oracle.add("Name 2");
		oracle.add("Name 3");
		oracle.add("Name 4");
		autocomplete.setSuggestions(oracle);
		
	}

	@UiHandler("btnTest")
	void onGetName(ClickEvent e){
		Window.alert(txtSample.getText());
	}
	
}
