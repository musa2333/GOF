package org.gof.Command;

import org.gof.Command.Cmd.AbstractCmd;
import org.gof.Command.Cmd.BakeBeefCmd;
import org.gof.Command.Cmd.BakeChickenCmd;
import org.gof.Command.Invoker.WaiterforMuiltCmd;
import org.gof.Command.Reciever.Barbecuer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "command starting!!" );
        Barbecuer barbecuer=new Barbecuer();
        AbstractCmd cmd=new BakeBeefCmd(barbecuer);
        AbstractCmd chickCmd=new BakeChickenCmd(barbecuer);
        //cmd.onExecute();
        
        WaiterforMuiltCmd waiter=new WaiterforMuiltCmd();
        waiter.setOrder(cmd);
        waiter.setOrder(chickCmd);
        System.out.println("order finish!!!");
        waiter.Notify();
        
    }
}
