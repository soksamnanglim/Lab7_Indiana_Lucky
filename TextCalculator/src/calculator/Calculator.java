package calculator;

import java.util.Scanner;

public class Calculator {
	
	CalculatorMemory stack; // = new CalculatorMemory() ????
	
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
	 * 
	 */
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number or operator: ");
		String input = sc.nextLine();
		
		while(!input.isEmpty()) {
		
			if(isInt(input)) {
				stack.push(Integer.parseInt(input));
			} else if(input == "pop") {
				stack.pop();
			} else if(input == "clear") {
				stack.clear();
			} else {
				
				try {
					stack.push(Operation.performOperation(input.charAt(0), stack.pop(), stack.pop()));
				} catch(Exception e) {
					System.out.println("Error: expected number or operator");
				}
				
			}
			
			System.out.println("\nMemory contents:\n" + stack);
			
			System.out.print("\nEnter a number or operator: ");
			sc.nextLine();
		}
		
	}

	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.run();
	}
}
