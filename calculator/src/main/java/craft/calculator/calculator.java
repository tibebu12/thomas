package craft.calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class calculator implements Icalculator {

	@WebMethod 
	@Override
	public int sum(int param1, int param2) {
		// should return the sum of param1 and param2
		return param1 + param2;
	}
	@WebMethod 
	@Override
	public int sub(int param1, int param2) {
		// should return the subtraction of param1 and param2
		return param1 - param2;
	}
	@WebMethod 
	@Override
	public int div(int param1, int param2) {
		// should return the division of param1 and param2
		return param1 / param2;
	}
	@WebMethod 
	@Override
	public int mul(int param1, int param2) {
		// should return the multiplication of param1 and param2
		return param1 * param2;
	}
 	

}
