package operations;
/**
 * method for add +
 * @author musa
 *
 */
public class OperationAdd extends Operation {
   @Override
   public Double getResult() {
	   System.out.println("use add operation to the operation!!!");
	   Double result=this.getA()+this.getB();
	   return result;
   }
}
