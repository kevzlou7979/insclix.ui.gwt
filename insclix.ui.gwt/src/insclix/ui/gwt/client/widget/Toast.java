package insclix.ui.gwt.client.widget;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;

public class Toast  {
	
	
	private MaterialToast toast;
	public Toast() {
		// TODO Auto-generated constructor stub
		toast =new MaterialToast();
	}
	public static native void alert(String msg) /*-{
	 	$wnd.Materialize.toast(msg, 4000);
	}-*/;

	public static void alert(String msg, MaterialLink link) {
		String genId = DOM.createUniqueId();
		alertWithAction(msg, genId);
		link.getElement().getStyle().setPaddingLeft(30, Unit.PX);
		RootPanel.get(genId).add(link);
	}

	public static native void alertWithAction(String msg, String id)/*-{
		$wnd.Materialize.toast(msg, 4000);
		 $wnd.jQuery(".toast").attr('id',  id);
	}-*/;


	public static native void alert(String msg, String type) /*-{
		 $wnd.Materialize.toast(msg, 4000, type);
		 $wnd.jQuery(".toast").attr('id',  'toast');
	}-*/;
	
	}
