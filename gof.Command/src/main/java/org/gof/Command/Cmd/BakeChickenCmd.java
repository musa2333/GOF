package org.gof.Command.Cmd;

import org.gof.Command.Reciever.Barbecuer;

public class BakeChickenCmd extends AbstractCmd {

	public BakeChickenCmd(Barbecuer barbecuer) {
		super(barbecuer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onExecute() {
		// TODO Auto-generated method stub
       System.out.println("Start to bake chicken!!!");
       barbecuer.action();
	}

	@Override
	public String toString() {
		return "bake chicken!!";
	}
}
