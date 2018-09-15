package org.gof.decorator;

import org.gof.decorator.Finery.BigTrouser;
import org.gof.decorator.Finery.Sneaker;
import org.gof.decorator.Finery.Tshirts;

public class main {
	
	public static void main(String args[]) {
		String name="Tony";
		Person person=new Person(name);
		System.out.println("Start to wear cloth");
		//Tony first decorate
		BigTrouser bigTrouser=new BigTrouser(name);
		Sneaker sneaker=new Sneaker(name);
		Tshirts tshirts=new Tshirts(name);
		bigTrouser.Decorate(person);
		sneaker.Decorate(bigTrouser);
		tshirts.Decorate(sneaker);
		
		tshirts.show();
	}

}
