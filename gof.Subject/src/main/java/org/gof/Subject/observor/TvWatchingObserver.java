package org.gof.Subject.observor;

import java.util.Date;

public class TvWatchingObserver {

	public TvWatchingObserver() {
		System.out.println("I'm watching Tv at "+new Date());
	}
	
	public void stopWatchingTv(Date date) {
		System.out.println("the teacher's comming,stop watching Tv at "+date);
	}
}
