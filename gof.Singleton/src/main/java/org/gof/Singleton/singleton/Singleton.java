package org.gof.Singleton.singleton;
/**
 * singleton class
 * @author musa
 *
 */
public class Singleton {
    private final static  Object object=new Object();
	private static Singleton instance;
	private Singleton() {
		
	}
	//DLC LAZY LOAD 
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(object) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}
