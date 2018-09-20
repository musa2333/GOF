package org.gof.Subject.observor;

import java.util.Date;
/**
 * Observer
 * @author musa
 *
 */
public class GamingObserver {

	public GamingObserver() {
		System.out.println("I'm playing game,start at "+new Date());
	}
	
	public void StopGaming(Date date) {
		System.out.println("the teacher is comming,stop and ready to do homework at "+date);
	}
}
