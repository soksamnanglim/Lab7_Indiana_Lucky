/**
 * @author Indiana Huey & Lucky Lim
 * 
 * @version 0.0.1
 */

package calculator;

import java.util.Scanner;

/**
 * This class contains the main calculator program
 */
public class Calculator {
	
	public CalculatorMemory stack;
	
	/**
	 * Construct calculator
	 */
	public Calculator() {
		stack = new CalculatorMemory();
	}
	
	/**
	 * Return whether a string is a number
	 * 
	 * @return whether string is a number
	 */
	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Run the calculator
	 */
	public void run() {
		
		// instantiate new Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number or operator: ");
		String input = sc.nextLine();
		
		// run until user inputs nothing
		while(!input.isEmpty()) {
		
			// perform correct actions based on user input
			if(isInt(input)) {
				stack.push(Integer.parseInt(input));
			} else if(input.equals("pop")) {
				
				// pop only if there's an element to pop
				if(stack.size() < 1) {
					System.out.println("Error: pop requires one argument");
				} else {
					stack.pop();
				}
				
			} else if(input.equals("clear")) {
				stack.clear();
			} else if(input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
				
				// perform operation only if there are enough arguments and not dividing by 0
				if(stack.size() < 2) {
					System.out.println("Error: operator requires two arguments");
				} else if(input.equals("/") && stack.peek(0) == 0) {
					System.out.println("Error: divide by zero");
				} else {
					int result = Operation.performOperation(input.charAt(0), stack.peek(1), stack.pop());
					stack.pop();
					stack.push(result);
					System.out.println("Answer: " + result);
				}
				
			// user input is invalid
			} else {
				System.out.println("Error: expected number or operator");
			}
			
			System.out.println("\nMemory contents:\n" + stack);
			
			// continue program
			System.out.print("\nEnter a number or operator: ");
			input = sc.nextLine();
		}
	}
	
	/**
	 * Main method; create instance of calculator and run
	 */
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.run();
	}
}
