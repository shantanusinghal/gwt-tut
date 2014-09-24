package com.ptc.tut.client.presenters;

import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.ptc.tut.client.shared.Person;

public class PersonPresenter implements Presenter {

	private Person person;
	private Display view;
	
	public interface Display {
		public void clear();
		public void setName(String name);
		public Widget asWidget();
		public void setPresenter(PersonPresenter presenter);
	}
	
	public PersonPresenter(Person person, Display view) {
		this.view = view;
		this.person = person;
		bind();
	}

	@Override
	public void bind() {
		view.setPresenter(this);
		view.clear();
	}
	
	@Override
	public void go(Panel panel) {
		panel.add(view.asWidget());

	}

	public void showFullName() {
		view.setName(person.getFullName());
		// EventBus.thisHappened();
	}

}
