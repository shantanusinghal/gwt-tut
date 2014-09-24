package com.ptc.tut.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SampleForm extends Composite {

	private static SampleFormUiBinder uiBinder = GWT
			.create(SampleFormUiBinder.class);

	interface SampleFormUiBinder extends UiBinder<Widget, SampleForm> {
	}

	public SampleForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setMessage(String text) {
		// set the text
	}
}
