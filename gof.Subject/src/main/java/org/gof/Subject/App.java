package org.gof.Subject;

import java.util.Date;

import org.gof.Subject.Notifier.Notifier;
import org.gof.Subject.Notifier.TeacherNotifier;
import org.gof.Subject.observor.GamingObserver;
import org.gof.Subject.observor.TvWatchingObserver;

/**
 * Observer pattern entry
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "obserer pattern design!" );
        GamingObserver gamingObserver=new GamingObserver();
        TvWatchingObserver tvWatchingObserver=new TvWatchingObserver();
        //notifier add delegate method to do  
        Notifier notifier=new TeacherNotifier();
        notifier.addListener(gamingObserver, "StopGaming", new Date());
        notifier.addListener(tvWatchingObserver, "stopWatchingTv", new Date());
        //
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        notifier.notifyx();
    }
}
