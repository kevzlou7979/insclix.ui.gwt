package insclix.ui.gwt.client;

import insclix.ui.gwt.client.demo.Demo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Insclix_ui_gwt implements EntryPoint {
	
	public void onModuleLoad() {
		
		RootPanel.get().add(new Demo());
	}
}
