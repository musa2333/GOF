package org.gof.Iterator.Aggregate;

import org.gof.Iterator.iterator.ConcurrentIterator;
import org.gof.Iterator.iterator.Iterator;

public class ConcurrentAggregate implements Aggregate {

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcurrentIterator(this);
	}

	
}
