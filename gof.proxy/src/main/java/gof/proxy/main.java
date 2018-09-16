package gof.proxy;

import gof.proxy.impl.Proxy;

public class main {
	
	public static void main(String[] args) {
		System.out.println("Tony has a Proxy to give gift to someone!!!");
		
		Person person=new Person();
		person.setName("Cindy");
		//proxy 
		Proxy proxy=new Proxy(person);
		
		proxy.giveCandy();
		proxy.giveGameBoy();
		proxy.givePen();
		
	}

}
