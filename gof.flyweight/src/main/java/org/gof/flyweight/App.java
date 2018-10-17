package org.gof.flyweight;

import org.gof.flyweight.User.User;
import org.gof.flyweight.factory.FlyweightFactory;
import org.gof.flyweight.flyweight.Website;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "flyweight design pattern!" );
        
        FlyweightFactory factory=new FlyweightFactory();
        
        Website fx=factory.getWebSite("产品展示");
        fx.Use(new User("小菜"));
        
        Website fx1=factory.getWebSite("产品论坛");
        fx.Use(new User("小美"));
        
        System.out.println("total website is:"+factory.getTotalWebSite());
        
        System.exit(0);
    }
}
