package org.gof.Iterator.Aggregate;

import java.util.ArrayList;
import java.util.List;

import org.gof.Iterator.iterator.ConcurrentIterator;
import org.gof.Iterator.iterator.Iterator;

public class ConcurrentAggregate implements Aggregate {

	private List<Object> item=new ArrayList<>();
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcurrentIterator(this);
	}
    
	public int getCount() {
		return item.size();
	}
	
	public void insert(Object object) {
		item.add(object);
	}
	
	public Object get(int index) {
		return item.get(index);
	}
	
}
