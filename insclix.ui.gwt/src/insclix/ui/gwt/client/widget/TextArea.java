package insclix.ui.gwt.client.widget;
import gwt.material.design.client.custom.HasError;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialTextArea;

import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class TextArea  implements IsWidget,HasText,HasKeyPressHandlers,HasKeyDownHandlers,HasKeyUpHandlers,HasChangeHandlers, HasGrid, HasError {

	
	private MaterialTextArea textArea;
	public TextArea() {
		textArea = new MaterialTextArea();
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
		textArea.fireEvent(event);
		
	}

	@Override
	public void setError(String error) {
		// TODO Auto-generated method stub
		textArea.setError(error);
		
	}

	@Override
	public void setSuccess(String success) {
		// TODO Auto-generated method stub
		textArea.setSuccess(success);
		
	}

	@Override
	public void setGrid(String grid) {
		// TODO Auto-generated method stub
		textArea.setGrid(grid);
		
	}

	@Override
	public void setOffset(String offset) {
		// TODO Auto-generated method stub
		textArea.setOffset(offset);
		
	}

	@Override
	public HandlerRegistration addChangeHandler(ChangeHandler handler) {
		// TODO Auto-generated method stub
		return textArea.addChangeHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyUpHandler(KeyUpHandler handler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HandlerRegistration addKeyDownHandler(KeyDownHandler handler) {
		// TODO Auto-generated method stub
		return textArea.addKeyDownHandler(handler);
	}

	@Override
	public HandlerRegistration addKeyPressHandler(KeyPressHandler handler) {
		// TODO Auto-generated method stub
		return textArea.addKeyPressHandler(handler);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return textArea.getText();
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		textArea.setText(text);
		
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return textArea;
	}

	public MaterialTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(MaterialTextArea textArea) {
		this.textArea = textArea;
	}

	
}
