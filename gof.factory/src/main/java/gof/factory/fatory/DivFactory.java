package gof.factory.fatory;

import operations.Operation;
import operations.OperationDiv;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}

}
