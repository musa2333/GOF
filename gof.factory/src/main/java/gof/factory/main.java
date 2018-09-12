package gof.factory;

import operation.OperationFactory;
import operations.Operation;

/**
 * factory
 * @author musa
 *
 */
public class main {
	
	public static void main(String[] args) {
		
		Operation operate=null;
		System.out.println("add operation!!!");
		operate=OperationFactory.createOperation("+");
	    operate.setA(10d);
	    operate.setB(20d);
	    Double result=operate.getResult();
	    System.out.println("the result is "+result);
	    
	    System.out.println("----------------------------");
	    System.out.println("sub operation!!!!");
	    operate=OperationFactory.createOperation("-");
	    operate.setA(20d);
	    operate.setB(30d);
	    result=operate.getResult();
	    System.out.println("the result is "+result);
	    
	    System.out.println("----------------------------");
	    System.out.println("div operation!!!!");
	    operate=OperationFactory.createOperation("/");
	    operate.setA(4.0);
	    operate.setB(2.0);
	    result=operate.getResult();
	    System.out.println("the result is "+result);
	    
	    System.out.println("----------------------------");
	    System.out.println("mul operation!!!!");
	    operate=OperationFactory.createOperation("*");
	    operate.setA(13.2);
	    operate.setB(23.2);
	    result=operate.getResult();
	    System.out.println("the result is "+result);
	}
}
