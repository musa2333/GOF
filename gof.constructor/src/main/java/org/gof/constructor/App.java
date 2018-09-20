package org.gof.constructor;

import org.gof.constructor.bean.Product;
import org.gof.constructor.builder.ProductABuilder;
import org.gof.constructor.builder.ProductBBuilder;
import org.gof.constructor.director.DirectorLee;

/**
 * constructor pattern example entry
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "construct design pattern begin!" );
        ProductABuilder productABuilder=new ProductABuilder();
        ProductBBuilder productBBuilder=new ProductBBuilder();
        System.out.println(" build product A ");
        DirectorLee Lee=new DirectorLee(productABuilder);
        Lee.construct();
        Product productA=productABuilder.getResult();
        productA.show();
        System.out.println(" build product B ");
        Lee=new DirectorLee(productBBuilder);
        Lee.construct();
        Product productB=productBBuilder.getResult();
        productB.show();
    }
}
