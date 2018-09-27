package org.gof.status.state;

import org.gof.status.Context.Context;

public class ForenoonState extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
        if(context.getHour()<12&&context.getHour()>=8) {
        	System.out.println("current time is "+context.getHour()+", work status is well");
        }else if(context.getHour()>12){
        	context.setCurrent(new NoonState());
        	context.workProgram();
        }
	}

}
