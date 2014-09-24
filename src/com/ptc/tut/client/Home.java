package com.ptc.tut.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.ptc.tut.client.presenters.PersonPresenter;
import com.ptc.tut.client.presenters.PersonPresenter.Display;
import com.ptc.tut.client.presenters.Presenter;
import com.ptc.tut.client.shared.Person;
import com.ptc.tut.client.views.PersonView;

public class Home implements EntryPoint {

	private final SimpleEventBus eventBus = new SimpleEventBus();
	
	@Override
	public void onModuleLoad() {
		Person person = new Person();
		
		Display view = new PersonView(eventBus);
		Presenter presenter = new PersonPresenter(person, view, eventBus);
		
		presenter.go(RootPanel.get());
	}

}
