package org.gof.Iterator.iterator;

public interface Iterator {

	public Object First();
	
	public Object Next();
	
	public Boolean IsDone();
	
	public Object currentItem();
}
