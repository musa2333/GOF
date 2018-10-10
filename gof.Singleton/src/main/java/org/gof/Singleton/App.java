package org.gof.Singleton;

import org.gof.Singleton.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "singleton test!!" );
      //initialize class
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        if(singleton1.hashCode()==singleton2.hashCode()) {
        	System.out.println("two class is equals");
        }
    }
}
