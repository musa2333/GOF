package org.gof.status;

import org.gof.status.Context.Context;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "status design start!" );
        Context context=new Context();
        
        context.setHour(8);
        context.workProgram();
        
        context.setHour(16);
        context.workProgram();
        
        context.setHour(13);
        context.workProgram();
        
        context.setHour(20);
        context.workProgram();
    }
}
