package org.gof.abstractfactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
   public static String name;
   
   static {
	   Properties p=new Properties();
	   try {
		   p.load(Property.class.getResourceAsStream("/factory.properties"));
	   }catch (IOException e) {
           e.printStackTrace();
       }
	   name=p.getProperty("className");
   }
}
