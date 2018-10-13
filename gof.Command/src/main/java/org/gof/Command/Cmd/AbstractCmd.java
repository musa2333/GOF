package org.gof.Command.Cmd;

import org.gof.Command.Reciever.Barbecuer;

public abstract class AbstractCmd {
     protected Barbecuer barbecuer;
     public AbstractCmd(Barbecuer barbecuer) {
    	 this.barbecuer=barbecuer;
     }
     
     public abstract void onExecute();
}
