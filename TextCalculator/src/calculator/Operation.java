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
		
		if(op == '+') {
			return left + right;
		} else if(op == '-') {
			return left - right;
		} else if(op == '*') {
			return left * right;
		} else if(op == '/') {
			return left / right;
		} else {
			throw new IllegalArgumentException("Throwing!!!");	// how to throw exception?
																// how to handle?
		}
		
	}
	
	public static void main(String[] args) {
		
		int x = performOperation('-', 4, -5);
		
		System.out.println(x);
		
	}
}
