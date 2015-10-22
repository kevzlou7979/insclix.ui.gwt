package insclix.ui.gwt.client.widget;
import gwt.material.design.client.custom.HasError;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.ui.MaterialTimePicker;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class TimePicker  implements HasGrid, HasError, IsWidget{
	private MaterialTimePicker timePicker;
	public TimePicker() {
		timePicker = new MaterialTimePicker();
	}

	@Override
	public void setError(String error) {
		// TODO Auto-generated method stub
		timePicker.setError(error);
		
	}

	@Override
	public void setSuccess(String success) {
		// TODO Auto-generated method stub
		timePicker.setSuccess(success);
		
	}

	@Override
	public void setGrid(String grid) {
		// TODO Auto-generated method stub
		timePicker.setGrid(grid);
		
	}

	@Override
	public void setOffset(String offset) {
		timePicker.setOffset(offset);
		
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return timePicker;
	}

	public MaterialTimePicker getTimePicker() {
		return timePicker;
	}

	public void setTimePicker(MaterialTimePicker timePicker) {
		this.timePicker = timePicker;
	}

	
	
}
