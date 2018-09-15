package org.gof.decorator.Finery;

public class Tshirts extends Finery {
	
	public Tshirts(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.print(" Tshirt");
		super.show();
	}

}
