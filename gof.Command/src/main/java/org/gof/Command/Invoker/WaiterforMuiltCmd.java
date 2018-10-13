package org.gof.Command.Invoker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.gof.Command.Cmd.AbstractCmd;

public class WaiterforMuiltCmd {
   private List<AbstractCmd> cmds=new ArrayList<>();
   public void setOrder(AbstractCmd cmd) {
	   if(cmd.toString().contains("chick")) {
		   System.out.println("chicken is not enough! please order another meal");
	   }else {
		   cmds.add(cmd);
		   System.out.println("增加订单："+cmd.toString()+" 时间："+new Date());
	   }
   }
   
   public void cancelOrder(AbstractCmd cmd) {
	   cmds.remove(cmd);
	   System.out.println("取消订单："+cmd.toString()+" 时间："+new Date());
   }
   
   public void Notify() {
	   for(AbstractCmd cmd:cmds) {
		   cmd.onExecute();
	   }
   }
}
