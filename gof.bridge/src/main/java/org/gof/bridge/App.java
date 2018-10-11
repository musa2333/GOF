package org.gof.bridge;

import org.gof.bridge.phone.NokiaPhone;
import org.gof.bridge.phone.Phone;
import org.gof.bridge.phone.VivoPhone;
import org.gof.bridge.software.MobileGame;
import org.gof.bridge.software.Mp3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "run different soft on different phone!" );
        Phone phone;
        phone=new NokiaPhone();
        
        phone.setSoft(new MobileGame());
        phone.run();
        
        phone=new VivoPhone();
        phone.setSoft(new Mp3());
        phone.run();
        
        phone.setSoft(new MobileGame());
        phone.run();
    }
}
