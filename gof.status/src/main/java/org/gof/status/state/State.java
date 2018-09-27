package org.gof.status.state;

import org.gof.status.Context.Context;

public abstract class State {
  
	public abstract void Handle(Context context);
	
}
