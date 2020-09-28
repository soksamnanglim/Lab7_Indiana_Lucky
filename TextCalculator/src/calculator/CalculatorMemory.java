package calculator;

import java.util.LinkedList;

public class CalculatorMemory {
	
	protected LinkedList<Integer> stack = new LinkedList<Integer>(); // memory of values

	/**
	 * Add the number to stack
	 * 
	 * @param number
	 */
	public void push(int number) {
		stack.addFirst(number); // this is O(1)?
	}
	
	/**
	 * Return and remove the most recently pushed number
	 * 
	 * @return removed number
	 */
	public int pop() {
		return stack.removeFirst(); // HANDLE EMPTY ERROR
	}
	
	/**
	 * Return whether or not stack is empty
	 * 
	 * @return whether or not stack is empty
	 */
	public boolean isEmpty() {
		return stack.size() == 0;
	}
	
	/**
	 * Return stack size
	 * 
	 * @return stack size
	 */
	public int size() {
		return stack.size();
	}
	
	/**
	 * Remove everything from stack
	 */
	public void clear() {
		stack = new LinkedList<Integer>(); // test? & not memory efficient? or gc'ed
	}
	
	/**
	 * Return a String version of the numbers stored
	 * 
	 * @return a String version of the numbers stored
	 */
	public String toString() {
		String s = " ";
		
		for(int i = 0; i < stack.size(); i++) {
			s += Integer.toString(stack.get(i)) + "\n";
		}
		
		s += "---";
				
		return s;
	}
}
