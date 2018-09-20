package org.gof.constructor.builder;

import org.gof.constructor.bean.Product;

public class ProductBBuilder implements Builder {
   
	private Product productB=new Product();
	
 	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		productB.add("arm");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		productB.add("leg");
	} 

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return productB;
	}

}
