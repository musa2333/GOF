package org.gof.decorator.Finery;

public class Sneaker extends Finery {
	public Sneaker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void show() {
		System.out.print(" sneakers");
		super.show();
	}

}
