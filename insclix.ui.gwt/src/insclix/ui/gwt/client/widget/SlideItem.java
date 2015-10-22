package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialSlideItem;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class SlideItem implements IsWidget {

	
	private MaterialSlideItem slideItem;
	public SlideItem() {
		slideItem = new MaterialSlideItem();
	}
	public MaterialSlideItem getSlideItem() {
		return slideItem;
	}
	public void setSlideItem(MaterialSlideItem slideItem) {
		this.slideItem = slideItem;
	}
	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return slideItem;
	}

	
	
	
}
