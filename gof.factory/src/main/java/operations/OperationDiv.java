package operations;
/**
 * division
 * @author musa
 *
 */
public class OperationDiv extends Operation{

	@Override
	public Double getResult() {
		System.out.println("use division for the operation!!!");
		Double result=null;
		if(this.getB().equals(0d)) {
			System.out.println("The divisor can not be 0!");
			return null;
		}else {
			result=this.getA()/this.getB();
			return result;
		}
	}
}
