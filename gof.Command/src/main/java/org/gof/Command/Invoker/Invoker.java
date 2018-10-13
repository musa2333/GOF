package org.gof.Command.Invoker;

import org.gof.Command.Cmd.AbstractCmd;

public abstract class Invoker {
   
	protected AbstractCmd cmd;
	
	public Invoker(AbstractCmd cmd) {
		this.cmd=cmd;
	}
	
	public abstract void onExcute();
	
}
