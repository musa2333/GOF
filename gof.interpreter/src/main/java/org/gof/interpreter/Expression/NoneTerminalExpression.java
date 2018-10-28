package org.gof.interpreter.Expression;

import org.gof.interpreter.Context.Context;

public class NoneTerminalExpression extends AbstractExpression {

	@Override
	public void Exceute(Context context) {
		// TODO Auto-generated method stub
        System.out.println("NoneTerminalExpression :"+context.getOutput());
	}

}
