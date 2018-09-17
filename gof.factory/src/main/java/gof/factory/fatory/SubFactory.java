package gof.factory.fatory;

import operations.Operation;
import operations.OperationSub;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}

}
