package org.gof.decorator.Finery;

import org.gof.decorator.Person;

public abstract class Finery extends Person {

	protected Person component;
	
	public Finery(String name) {
		super(name);
	}
	public void Decorate(Person component) {
			this.component=component;
	}
	
	public void show() {
		if(component!=null) {
			component.show();
		}
	}
	
}
