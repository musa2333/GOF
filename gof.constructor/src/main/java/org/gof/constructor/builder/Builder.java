package org.gof.constructor.builder;

import org.gof.constructor.bean.Product;

public interface Builder {
	
	public void buildPartA();
	
	public void buildPartB();
	
	public Product getResult();

}
