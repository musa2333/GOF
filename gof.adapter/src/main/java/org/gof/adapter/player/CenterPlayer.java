package org.gof.adapter.player;

public class CenterPlayer extends Player {

	public CenterPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" is attacking");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
	      System.out.println(this.name+ " is defensing");
	}

}
