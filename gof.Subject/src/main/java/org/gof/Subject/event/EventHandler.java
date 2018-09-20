package org.gof.Subject.event;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {
   private List<Event> events;
   
   public EventHandler() {
	   events=new ArrayList<>();
   }
   
   public void addEvent(Object object,String methodName,Object ...args) {
	   this.events.add(new Event(object,methodName,args));
   }
   /**
    * notify all
    * @throws Exception
    */
   public void Notifyx() throws Exception {
	   for(Event event:events) {
		   event.invoke();
	   }
   }
}
