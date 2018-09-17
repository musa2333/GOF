package gof.factory;

import gof.factory.fatory.AddFactory;
import gof.factory.fatory.DivFactory;
import gof.factory.fatory.IFactory;
import gof.factory.fatory.MulFactory;
import operation.OperationFactory;
import operations.Operation;

/**
 * factory
 * @author musa
 *
 */
public class main {
	
	public static void main(String[] args) {
		//simple factory
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
	    //factory method
	    System.out.println("--------------Factory METHOD------------------------");
	    IFactory IoperFactory=new DivFactory();//
	    Operation oper=IoperFactory.createOperation();//lazy load by child class
	    oper.setA(11.0d);
	    oper.setB(1.32d);
	    result=oper.getResult();
	    System.out.println("the result is "+result);
	    System.out.println("------------------------------------------------");
	    IoperFactory=new AddFactory();
	    oper=IoperFactory.createOperation();
	    oper.setA(11.1d);
	    oper.setB(-2.0d);
	    result=oper.getResult();
	    System.out.println("the result is "+result);
	    System.out.println("-------------------------------------------------");
	    IoperFactory=new MulFactory();
	    oper=IoperFactory.createOperation();
	    oper.setA(23.0d);
	    oper.setB(2.0d);
	    result=oper.getResult();
	    System.out.println("the result is "+result);
	    
	}
}
