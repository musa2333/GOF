package org.gof.Command.Cmd;

import org.gof.Command.Reciever.Barbecuer;

public class BakeBeefCmd extends AbstractCmd {

	public BakeBeefCmd(Barbecuer barbecuer) {
		super(barbecuer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onExecute() {
		// TODO Auto-generated method stub
        System.out.println("Start to bake the beef!!!");
        barbecuer.action();
	}
	
	@Override
	public String toString() {
		return "bake beef";
	}

}
