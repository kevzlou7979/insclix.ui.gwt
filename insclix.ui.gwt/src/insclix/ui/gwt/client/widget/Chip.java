package insclix.ui.gwt.client.widget;

import gwt.material.design.client.custom.HasIcons;
import gwt.material.design.client.custom.HasImage;
import gwt.material.design.client.ui.MaterialChip;
import gwt.material.design.client.ui.MaterialIcon;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;


public class Chip implements HasImage, HasIcons, IsWidget{

	private MaterialChip chip;
	
	public Chip(){
		chip = new MaterialChip();
	}
	
	public void setText(String text){
		chip.setText(text);
	}
	
	public String getText(){
		return chip.getText();
	}

	@Override
	public void setUrl(String url) {
		chip.setUrl(url);
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return chip.getUrl();
	}

	@Override
	public void setResource(ImageResource resource) {
		chip.setResource(resource);
	}

	@Override
	public ImageResource getResource() {
		return chip.getResource();
	}

	public Image getImage() {
		return chip.getImage();
	}

	public void setImage(Image image) {
		chip.setImage(image);
	}

	@Override
	public void setIcon(String icon) {
		chip.setIcon(icon);
	}

	@Override
	public void setIconPosition(String iconPosition) {
		chip.setIconPosition(iconPosition);
	}

	@Override
	public void setSize(String size) {
		chip.setSize(size);
	}

	@Override
	public void setIconColor(String iconColor) {
		chip.setIconColor(iconColor);
	}

	public MaterialIcon getIcon() {
		return chip.getIcon();
	}

	public void setIcon(MaterialIcon icon) {
		chip.setIcon(icon);
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return chip;
	}
	
}
