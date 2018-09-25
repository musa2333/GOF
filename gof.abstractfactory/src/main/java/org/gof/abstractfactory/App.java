package org.gof.abstractfactory;

import org.gof.abstractfactory.AbstracFactory.abstractfactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        abstractfactory factory=Factory.createFactory();
        factory.createFactoryA();
        factory.createFactoryB();
    }
}
