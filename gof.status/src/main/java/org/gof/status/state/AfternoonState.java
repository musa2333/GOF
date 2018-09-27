package org.gof.status.state;

import org.gof.status.Context.Context;

public class AfternoonState extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
        if(context.getHour()>14&&context.getHour()<17) {
        	System.out.println("I feel energy to work ,the current time is "+ context.getHour());
        }else if(context.getHour()>17){
        	context.setCurrent(new EveningState());
        	context.workProgram();
        }
	}

}
