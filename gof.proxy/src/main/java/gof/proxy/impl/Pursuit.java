package gof.proxy.impl;

import gof.proxy.Person;
import gof.proxy.api.GiveGift;

public class Pursuit implements GiveGift {
    private Person person;
	public Pursuit(Person person) {
		this.person=person;
	}
	
	public void giveGameBoy() {
		// TODO Auto-generated method stub
        System.out.println("give "+this.person.getName()+" game boy");
	}

	public void giveCandy() {
		// TODO Auto-generated method stub
        System.out.println("give "+this.person.getName()+" Candy");
	}

	public void givePen() {
		// TODO Auto-generated method stub
        System.out.println("give "+this.person.getName()+" Pen ");
	}

}
