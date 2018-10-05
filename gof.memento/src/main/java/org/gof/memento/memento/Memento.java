package org.gof.memento.memento;
/**
 * Memento
 * @author musa
 *
 */
public class Memento {
  
	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento(String state) {
		this.state=state;
	}
	
}
