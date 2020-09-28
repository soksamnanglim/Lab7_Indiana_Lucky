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
		
		if(op == '+') {
			result = left + right;
		} else if(op == '-') {
			result = left - right;
		} else if(op == '*') {
			result = left * right;
		} else if(op == '/') {
			if(right == 0) {
				throw new ArithmeticException("Error: divide by zero");
			} else {
				result = left / right;
			}
		} else {
			throw new IllegalArgumentException("Error: expected number or operator");
		}
		
		return result;
		
		} 
}
