package org.gof.Subject.Notifier;

import org.gof.Subject.event.EventHandler;
/**
 * abstract notifier
 * @author musa
 *
 */
public abstract class Notifier {

	private EventHandler eventHandler=new EventHandler();
	
	public EventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	public abstract void addListener(Object object,String methodName,Object ...objects);
	
	public abstract void notifyx();
	
	
	
}
