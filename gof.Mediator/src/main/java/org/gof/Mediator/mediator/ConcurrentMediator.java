package org.gof.Mediator.mediator;

import org.gof.Mediator.colleague.Colleague;
import org.gof.Mediator.colleague.ConcurrentColleague;
import org.gof.Mediator.colleague.ConcurrentColleague1;

public class ConcurrentMediator extends Mediator {

	private ConcurrentColleague1 colleague1;
	public ConcurrentColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcurrentColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public ConcurrentColleague getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcurrentColleague colleague2) {
		this.colleague2 = colleague2;
	}

	private ConcurrentColleague colleague2;
	
	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
       if(colleague instanceof ConcurrentColleague) {
    	   colleague1.getMessage(message);
       }else {
    	   colleague2.getMessage(message);
       }
	}

}
