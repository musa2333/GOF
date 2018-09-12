package operation;

import operations.Operation;
import operations.OperationAdd;
import operations.OperationDiv;
import operations.OperationMul;
import operations.OperationSub;

public class OperationFactory {
	
	public static Operation createOperation(String operate) {
		
		Operation oper=null;
		
		switch(operate) {
		  case "+":
			oper=new OperationAdd();
			break;
		  case "-":
			  oper=new OperationSub();
			  break;
		  case "/":
			  oper=new OperationDiv();
			  break;
		  case "*":
			  oper=new OperationMul();
			  break;
		}
		return oper;
	}

}
