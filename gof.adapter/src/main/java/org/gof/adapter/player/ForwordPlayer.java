package org.gof.adapter.player;

public class ForwordPlayer extends Player {


	public ForwordPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		// TODO Auto-generated method stub
      System.out.println(this.name+" is attacking");
	}

	public void defense() {
		// TODO Auto-generated method stub
      System.out.println(this.name+ " is defensing");
	}

}
