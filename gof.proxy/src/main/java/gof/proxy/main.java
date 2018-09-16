package gof.proxy;

import java.lang.reflect.Proxy;

import gof.proxy.api.GiveGift;
import gof.proxy.impl.DynamicProxyHandler;
import gof.proxy.impl.Pursuit;

public class main {
	
	public static void main(String[] args) {
		System.out.println("Tony has a Proxy to give gift to someone!!!");
		
		Person person=new Person();
		person.setName("Cindy");
		/*//proxy 
		Proxy proxy=new Proxy(person);
		
		proxy.giveCandy();
		proxy.giveGameBoy();
		proxy.givePen();*/
		GiveGift pursuit=new Pursuit(person);
		
		GiveGift proxy=(GiveGift)Proxy.newProxyInstance(GiveGift.class.getClassLoader(), new Class[] {GiveGift.class}, new DynamicProxyHandler(pursuit));
		
		proxy.giveCandy();
		
	}

}
