package org.gof.decorator.Finery;

public class BigTrouser extends Finery {

	public BigTrouser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void show(){
		System.out.print(" BigTrouser");
		super.show();
	}

}
