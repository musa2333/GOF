package org.gof.Iterator.iterator;
import org.gof.Iterator.Aggregate.ConcurrentAggregate;
/**
 * concurrent Iterator
 * @author musa
 *
 */
public class ConcurrentIterator implements Iterator {
	private ConcurrentAggregate aggregate;
	private int current=0;
	public ConcurrentIterator(ConcurrentAggregate aggregate) {
		this.aggregate=aggregate;
	}

	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.get(0);
	}

	public Object Next() {
		// TODO Auto-generated method stub
		Object result=null;
		
		if(current<aggregate.getCount()) {
			result=aggregate.get(current);
		}
		current++;
		return result;
	}

	public Boolean IsDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.getCount()?true:false;
	}

	public Object currentItem() {
		// TODO Auto-generated method stub
		Object result=aggregate.get(current);
		return result;
	}

}
