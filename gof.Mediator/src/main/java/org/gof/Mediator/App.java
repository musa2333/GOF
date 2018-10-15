package org.gof.Mediator;

import org.gof.Mediator.colleague.ConcurrentColleague;
import org.gof.Mediator.colleague.ConcurrentColleague1;
import org.gof.Mediator.mediator.ConcurrentMediator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Mediator pattern show!" );
        ConcurrentMediator mediator=new ConcurrentMediator();
        
        ConcurrentColleague colleague2=new ConcurrentColleague("Tony",mediator);
        ConcurrentColleague1 colleague1=new ConcurrentColleague1("Bob",mediator);
        
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        
        colleague1.sendMessage("Do you have lunch?");
        colleague2.sendMessage("Not yet,a few minutes later");
    }
}
