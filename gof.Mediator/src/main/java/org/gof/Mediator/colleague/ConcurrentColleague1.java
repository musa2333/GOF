package org.gof.Mediator.colleague;

import org.gof.Mediator.mediator.Mediator;

public class ConcurrentColleague1 extends Colleague {
    
	public ConcurrentColleague1(String name,Mediator mediator) {
		super(name,mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		mediator.send(message, this);
	}

	@Override
	public void getMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("this guy name is "+this.getName()+" recieve message is :"+message);
	}

}
