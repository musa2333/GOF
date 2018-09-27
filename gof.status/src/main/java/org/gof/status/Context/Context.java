package org.gof.status.Context;

import org.gof.status.state.ForenoonState;
import org.gof.status.state.State;

/**
 * context 
 * @author musa
 *
 */
public class Context {
    private int hour=0;
    private State current;
    public Context() {
    	this.current=new ForenoonState();
    }
    public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public State getCurrent() {
		return current;
	}
	public void setCurrent(State current) {
		this.current = current;
	}
	
	public void workProgram() {
		current.Handle(this);
	}
    
}
