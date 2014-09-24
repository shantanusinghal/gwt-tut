package com.ptc.tut.client.presenters;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.ptc.tut.client.events.ShowFullNameEvent;
import com.ptc.tut.client.events.ShowFullNameEventHandler;
import com.ptc.tut.client.shared.Person;

public class PersonPresenter implements Presenter {

	private Person person;
	private Display view;
	private EventBus eventBus;
	
	public interface Display {
		public void clear();
		public void setName(String name);
		public Widget asWidget();
		public void setPresenter(PersonPresenter presenter);
	}
	
	public PersonPresenter(Person person, Display view, EventBus eventBus) {
		this.view = view;
		this.person = person;
		this.eventBus = eventBus;
		
		bind();
	}

	@Override
	public void bind() {
		view.setPresenter(this);
		view.clear();
		ShowFullNameEventHandler eventHandler = new ShowFullNameEventHandler() {
			@Override
			public void onShowFullName(ShowFullNameEvent event) {
				view.setName(person.getFullName());
			}
		};
		this.eventBus.addHandler(ShowFullNameEvent.TYPE, eventHandler);
	}
	
	@Override
	public void go(Panel panel) {
		panel.add(view.asWidget());

	}

}
