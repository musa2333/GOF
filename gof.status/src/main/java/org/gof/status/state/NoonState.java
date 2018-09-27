package org.gof.status.state;

import org.gof.status.Context.Context;

public class NoonState extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
        if(context.getHour()<14&&context.getHour()>12) {
        	System.out.println("current time is "+context.getHour()+",finish my lunch and feel sleepy" );
        }else if(context.getHour()>14) {
        	context.setCurrent(new AfternoonState());
        	context.workProgram();
        }
	}

}
