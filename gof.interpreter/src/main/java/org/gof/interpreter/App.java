package org.gof.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.gof.interpreter.Context.Context;
import org.gof.interpreter.Expression.AbstractExpression;
import org.gof.interpreter.Expression.NoneTerminalExpression;
import org.gof.interpreter.Expression.TerminalExpression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Interpreter start ...." );
        Context context=new Context();
        context.setOutput("expression interpretor is excuting");
        List<AbstractExpression> expressions=new ArrayList<>();
        
        expressions.add(new NoneTerminalExpression());
        expressions.add(new NoneTerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new NoneTerminalExpression());
        
        for(AbstractExpression e:expressions) {
        	e.Exceute(context);
        }
        
    }
}
