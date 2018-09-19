package org.gof.facade;

import org.gof.facade.Fund.Fund;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "we buy fund to invest" );
        Fund fund=new Fund();
        
        fund.buy();
        System.out.println("somedays pass by");
        fund.sell();
        System.out.println("we have some profit!!");
    }
}
