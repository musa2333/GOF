package gof.proxy.impl;

import gof.proxy.Person;
import gof.proxy.api.GiveGift;
/**
 * Proxy class
 * @author musa
 *
 */
public class Proxy implements GiveGift {

	Pursuit pursuit=null;
	
	public Proxy(Person person) {
		this.pursuit=new Pursuit(person);
	}
	
	public void giveGameBoy() {
		// TODO Auto-generated method stub
        pursuit.giveGameBoy();
	}

	public void giveCandy() {
		// TODO Auto-generated method stub
        pursuit.giveCandy();
	}

	public void givePen() {
		// TODO Auto-generated method stub
        pursuit.givePen();
	}

}
