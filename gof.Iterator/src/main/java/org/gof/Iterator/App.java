package org.gof.Iterator;

import org.gof.Iterator.Aggregate.ConcurrentAggregate;
import org.gof.Iterator.iterator.Iterator;

/**
 * Iterator just like Iterator<> and for ... in
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Iterator is testing!" );
        System.out.println("Add to fruit basket.");
        ConcurrentAggregate aggregate=new ConcurrentAggregate();
        aggregate.insert("apple");
        aggregate.insert("banana");
        aggregate.insert("peach");
        aggregate.insert("strawberry");
        
        System.out.println("show the iterator method ");
        System.out.println("how many spieces of fruit in the basket?");
        System.out.println("there have fruits like:");
        Iterator iterator=aggregate.createIterator();//iterator create
        while(!iterator.IsDone()) {
        	System.out.println(iterator.Next());
        }
    }
}
