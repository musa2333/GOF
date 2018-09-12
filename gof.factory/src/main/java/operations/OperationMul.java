package operations;
/**
 * mutiplier
 * @author musa
 *
 */
public class OperationMul extends Operation {
  
	@Override
	public Double getResult() {
		
		System.out.println("use mutiplier to the operation!!!");
		
		Double result=null;
		result=this.getA()*this.getB();
		return result;
	}
}
