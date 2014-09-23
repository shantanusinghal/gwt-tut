package com.ptc.tut.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	private SampleForm form = new SampleForm();
	
	@Override
	public void onModuleLoad() {
//		form.setMessage("Hello World!");
		RootPanel.get().add(form);
	}

}
