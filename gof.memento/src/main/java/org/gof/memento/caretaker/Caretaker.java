package org.gof.memento.caretaker;

import org.gof.memento.memento.Memento;

/**
 * care taker save now state
 * @author musa
 *
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
