package org.gof.Composite.component;

import java.util.ArrayList;
import java.util.List;

/**
 * ab
 * @author musa
 *
 */
public abstract class Component {
	
    protected String name;
    
    public Component(String name) {
    	this.name=name;
    }
    
    public abstract void add(Component component);
    
    public abstract void remove(Component component);
    
    public abstract void show(int depth);
}
