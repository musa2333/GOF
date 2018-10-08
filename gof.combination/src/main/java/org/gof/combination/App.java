package org.gof.combination;

import org.gof.Composite.component.Composite;
import org.gof.Composite.component.Leaf;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Composite test!" );
        
        Composite root=new Composite("root");
        root.add(new Leaf("LeafA"));
        root.add(new Leaf("LeafB"));
        
        Composite comp=new Composite("Composite X");
        comp.add(new Leaf("LeafX A"));
        comp.add(new Leaf("LeafX B"));
        
        
        
        Composite comp2=new Composite("Composite Y");
        comp2.add(new Leaf("LeafY A"));
        comp2.add(new Leaf("LeafY B"));
        
        comp.add(comp2);
        
        
        root.add(comp);
        //show the tree 
        root.show(1);
    }
}
