package com.ptc.tut.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.ptc.tut.client.events.ShowFullNameEvent;
import com.ptc.tut.client.presenters.PersonPresenter;
import com.ptc.tut.client.presenters.PersonPresenter.Display;

public class PersonView extends Composite implements Display {

	@UiField Label name;
	@UiField Button button;
	
	private EventBus eventBus;
	private PersonPresenter presenter;
	private static PersonViewUiBinder uiBinder = GWT
			.create(PersonViewUiBinder.class);

	interface PersonViewUiBinder extends UiBinder<Widget, PersonView> {
	}

	public PersonView(EventBus eventBus) {
		this.eventBus = eventBus;
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("button")
	void onClick(ClickEvent e) {
		this.eventBus.fireEvent(new ShowFullNameEvent());
	}

	@Override
	public void clear() {
		this.name.setText("");
	}

	@Override
	public void setName(String name) {
		this.name.setText(name);
	}

	@Override
	public void setPresenter(PersonPresenter presenter) {
		this.presenter = presenter;
	}

}
