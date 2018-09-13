package operations;
/***
 * subtraction
 * @author musa
 *
 */
public class OperationSub extends Operation {

	@Override
	public Double getResult() {
		
		System.out.println("use sub to the operation!!!");
		Double result=this.getA()-this.getB();
		return result;
	}
	
}
