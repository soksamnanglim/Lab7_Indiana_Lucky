/**
 * @author Indiana Huey && Lucky Lim
 * 
 * @version 0.0.1
 */

package calculator;

/**
 * This class does math operations
 */
public class Operation {

	/**
	 * Perform math operation on two operands and return the result
	 * 
	 * @param op, operator
	 * @param left, operand
	 * @param right operand
	 * 
	 * @return the result of the operation
	 */
	public static int performOperation(char op, int left, int right) {
		int result = 0;
		
		// perform correct operation
		if(op == '+') {
			result = left + right;
		} else if(op == '-') {
			result = left - right;
		} else if(op == '*') {
			result = left * right;
		} else if(op == '/') {
			
			// throw exception if try to divide by 0
			if(right == 0) {
				throw new ArithmeticException("Error: divide by zero");
			} else {
				result = left / right;
			}
			
		// throw exception if 'op' is not an operator
		} else {
			throw new IllegalArgumentException("Error: expected number or operator");
		}
		
		return result;
		} 
}