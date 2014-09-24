package com.ptc.tut.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
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

	@Override
	public void onModuleLoad() {
		Person person = new Person();
		
		Display view = new PersonView();
		Presenter presenter = new PersonPresenter(person, view);
		
		presenter.go(RootPanel.get());
	}

}
