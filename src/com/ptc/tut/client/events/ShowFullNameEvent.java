package com.ptc.tut.client.events;

import com.google.gwt.event.shared.GwtEvent;

public class ShowFullNameEvent extends GwtEvent<ShowFullNameEventHandler> {
	
	public static Type<ShowFullNameEventHandler> TYPE = new Type<ShowFullNameEventHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<ShowFullNameEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ShowFullNameEventHandler handler) {
		handler.onShowFullName(this);
	}

}
