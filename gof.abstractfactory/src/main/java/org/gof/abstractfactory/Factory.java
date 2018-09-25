package org.gof.abstractfactory;

import org.gof.abstractfactory.AbstracFactory.abstractfactory;

public class Factory {
   private static String className=Property.name;
   
   public static abstractfactory createFactory() throws InstantiationException, ReflectiveOperationException {
	   try {
		Class<?> factory=Class.forName("org.gof.abstractfactory.AbstracFactory.Impl.Factory"+className);
		return (abstractfactory)factory.newInstance();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
   }
}
