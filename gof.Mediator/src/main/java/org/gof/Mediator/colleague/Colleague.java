package org.gof.Mediator.colleague;

import org.gof.Mediator.mediator.Mediator;

public abstract class Colleague {
   protected Mediator mediator;
   private String name;
  
   
   public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Colleague(String name,Mediator mediator) {
	   this.mediator=mediator;
	   this.name=name;
   }
   
   public abstract void sendMessage(String message);
   public abstract void getMessage(String message);
}
