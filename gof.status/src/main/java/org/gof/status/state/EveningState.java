package org.gof.status.state;

import org.gof.status.Context.Context;

public class EveningState extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
       if(context.getHour()>17) {
    	   System.out.println("current time is "+context.getHour()+",finish today work and go home ");
       }
	}

}
