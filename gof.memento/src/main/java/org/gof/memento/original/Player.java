package org.gof.memento.original;

import org.gof.memento.memento.Memento;

/**
 * original player 
 * @author musa
 *
 */
public class Player {
	
    private String state;

    public String getState() {
		return state;
	}
	
    public void setState(String state) {
		this.state = state;
	}
    /**
     * create memento
     * @return
     */
    public Memento CreateMemento() {
    	return (new Memento(state));
    }
    
    public void SetMemento(Memento memento) {
    	this.state=memento.getState();
    }
    
    public void Show() {
       System.out.println("the player now state is : "+state);	
    }
   
}
