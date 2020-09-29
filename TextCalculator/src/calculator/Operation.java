package calculator;

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
			result = right + left;
		} else if(op == '-') {
			result = right - left;
		} else if(op == '*') {
			result = right * left;
		} else if(op == '/') {
			
			// throw exception if try to divide by 0
			if(left == 0) {
				throw new ArithmeticException("Error: divide by zero");
			} else {
				result = right / left;
			}
			
		// throw exception if 'op' is not an operator
		} else {
			throw new IllegalArgumentException("Error: expected number or operator");
		}
		
		return result;
		
		} 
}

// goes right to left (stack order is correct); can divide 0, but not divide by 0; throws error if invalid char