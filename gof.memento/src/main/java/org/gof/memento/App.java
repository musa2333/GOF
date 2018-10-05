package org.gof.memento;

import org.gof.memento.caretaker.Caretaker;
import org.gof.memento.original.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player player=new Player();
        player.setState("ready to kill the boss!");
        player.Show();
        /**
         * save the memento
         */
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(player.CreateMemento());
        /**
         * ready to do
         */
        player.setState("the player was failed to kill the boss and die,please try again !");
        player.Show();
        System.out.println("ready to read the mement");
        System.out.println("game start!!!");
        /**
         * ready to load the mement from start 
         */
        player.SetMemento(caretaker.getMemento());
        player.Show();
        	
    }
}
