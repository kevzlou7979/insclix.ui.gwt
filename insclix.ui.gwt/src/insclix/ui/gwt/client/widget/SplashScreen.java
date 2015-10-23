package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialSplashScreen;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class SplashScreen  implements IsWidget{

	private MaterialSplashScreen splashScreen;
	public SplashScreen(){
		splashScreen = new MaterialSplashScreen();
	}
	public MaterialSplashScreen getSplashScreen() {
		splashScreen.getSplashTime();
		return splashScreen;
	}
	public void setSplashScreen(MaterialSplashScreen splashScreen) {
		splashScreen.setSplashTime(splashScreen.getSplashTime());
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return splashScreen;
	}

}
