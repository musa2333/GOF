package org.gof.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import org.gof.flyweight.flyweight.ShoppingWebSite;
import org.gof.flyweight.flyweight.Website;

public class FlyweightFactory {
   private Map<String,Object> website=new HashMap();
   public Website getWebSite(String key) {
	   if(!website.containsKey(key)) {
		   website.put(key, new ShoppingWebSite());
	   }
	   return (Website)website.get(key);
   }
   
   public int getTotalWebSite() {
	   return website.size();
   }
}
