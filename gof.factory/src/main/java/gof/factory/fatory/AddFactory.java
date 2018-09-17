package gof.factory.fatory;

import operations.Operation;
import operations.OperationAdd;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
