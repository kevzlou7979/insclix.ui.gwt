package insclix.ui.gwt.client.ui;

import gwt.material.design.client.custom.HasError;
import gwt.material.design.client.custom.HasGrid;
import gwt.material.design.client.custom.MaterialSuggestionOracle;
import gwt.material.design.client.ui.ListItem;
import gwt.material.design.client.ui.MaterialAutoComplete;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.Widget;

public class Autocomplete implements HasError,  HasGrid, IsWidget{

	private MaterialAutoComplete autocomplete;
	
	public Autocomplete() {
		autocomplete = new MaterialAutoComplete();
	}

	@Override
	public void setGrid(String grid) {
		// TODO Auto-generated method stub
		autocomplete.setSuccess(grid);
	}

	@Override
	public void setOffset(String offset) {
		// TODO Auto-generated method stub
		autocomplete.setSuccess(offset);
	}

	@Override
	public void setError(String error) {
		// TODO Auto-generated method stub
		autocomplete.setSuccess(error);
	}

	@Override
	public void setSuccess(String success) {
		// TODO Auto-generated method stub
		autocomplete.setSuccess(success);
	}
	
	public void clear() {
		autocomplete.clear();
	}
 
	public List<String> getItemValues() {
		return autocomplete.getItemValues();
	}
	
	public void setItemValues(List<String> itemValues) {
		autocomplete.setItemValues(itemValues);
	}

	public List<ListItem> getItemsHighlighted() {
		return autocomplete.getItemsHighlighted();
	}
	
	public void setItemsHighlighted(List<ListItem> itemsHighlighted) {
		autocomplete.setItemsHighlighted(itemsHighlighted);
	}

	public MultiWordSuggestOracle getSuggestions() {
		return autocomplete.getSuggestions();
	}
	
	public void setSuggestions(MaterialSuggestionOracle suggestions) {
		autocomplete.setSuggestions(suggestions);
	}

	public String getPlaceholder() {
		return autocomplete.getPlaceholder();
	}

	public void setPlaceholder(String placeholder) {
		autocomplete.setPlaceholder(placeholder);
	}

	public boolean isDisabled() {
		return autocomplete.isDisabled();
	}

	public void setDisabled(boolean disabled) {
		autocomplete.setDisabled(disabled);
	}

	@Override
	public Widget asWidget() {
		return autocomplete;
	}

	
}
