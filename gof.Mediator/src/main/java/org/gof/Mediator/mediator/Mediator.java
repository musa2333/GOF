package org.gof.Mediator.mediator;

import org.gof.Mediator.colleague.Colleague;

public abstract class Mediator {
	 public abstract void send(String message,Colleague colleague);
}
