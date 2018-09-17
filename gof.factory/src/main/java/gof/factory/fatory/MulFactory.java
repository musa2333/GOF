package gof.factory.fatory;

import operations.Operation;
import operations.OperationMul;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}

}
