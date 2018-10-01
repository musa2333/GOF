package org.gof.adapter;

import org.gof.adapter.player.ForwordPlayer;
import org.gof.adapter.player.Player;
import org.gof.adapter.player.Translator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "adapter test!" );
        
        Player f=new ForwordPlayer("harden");
        f.attack();
        f.defense();
        
        Player c=new Translator("zhou");
        c.attack();
        c.defense();
    }
}
