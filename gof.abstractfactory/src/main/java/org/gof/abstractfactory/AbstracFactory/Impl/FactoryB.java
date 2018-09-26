package org.gof.abstractfactory.AbstracFactory.Impl;

import org.gof.abstractfactory.AbstracFactory.abstractfactory;
import org.gof.abstractfactory.productfactory.Iproduct;

public class FactoryB implements abstractfactory {

	public void createFactoryA() {
		// TODO Auto-generated method stub
		System.out.println("construct the factory a");
	}

	public void createFactoryB() {
		// TODO Auto-generated method stub
		System.out.println("construct the factory b");
	}

	

}
