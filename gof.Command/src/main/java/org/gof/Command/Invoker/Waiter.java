package org.gof.Command.Invoker;

import org.gof.Command.Cmd.AbstractCmd;

public class Waiter extends Invoker {

	public Waiter(AbstractCmd cmd) {
		super(cmd);
		// TODO Auto-generated constructor stub
	}
    /**
     * do the cmd
     */
	@Override
	public void onExcute() {
		// TODO Auto-generated method stub
		cmd.onExecute();
	}
	
}
