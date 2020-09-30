/**
 * @author Indiana Huey && Lucky Lim
 * 
 * @version 0.0.1
 */

package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test CalculatorMemory methods
 */
class CalculatorMemoryTest {

	@Test
	void testPeekPush() {
		
		CalculatorMemory stack = new CalculatorMemory();

		stack.push(1);
		assertEquals(stack.peek(0), 1);
		
		stack.push(0);
		assertEquals(stack.peek(0), 0);
		stack.push(-3);
		assertEquals(stack.peek(0), -3);
		
		assertEquals(stack.peek(2), 1);
	}
	
	@Test
	void testPop() {
		
		CalculatorMemory stack = new CalculatorMemory();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(stack.pop(), 3);
		assertEquals(stack.pop(), 2);
		stack.push(2);
		assertEquals(stack.pop(), 2);
		assertEquals(stack.pop(), 1);
	}
	
	@Test
	void testIsEmpty() {
		
		CalculatorMemory stack = new CalculatorMemory();
		
		assertEquals(stack.isEmpty(), true);
		stack.push(1);
		assertEquals(stack.isEmpty(), false);
		stack.pop();
		assertEquals(stack.isEmpty(), true);
	}
	
	@Test
	void testSize() {
		
		CalculatorMemory stack = new CalculatorMemory();
		
		assertEquals(stack.size(), 0);
		stack.push(0);
		assertEquals(stack.size(), 1);
		stack.push(1);
		stack.push(2);
		assertEquals(stack.size(), 3);
		stack.pop();
		assertEquals(stack.size(), 2);
		stack.pop();
		stack.pop();
		assertEquals(stack.size(), 0);
	}
	
	@Test
	void testClear() {
		
		CalculatorMemory stack = new CalculatorMemory();
		
		stack.clear();
		assertEquals(stack.size(), 0);
		stack.push(1);
		stack.push(1);
		stack.clear();
		assertEquals(stack.size(), 0);
	}

	@Test
	void testToString() {
		
		CalculatorMemory stack = new CalculatorMemory();
		
		assertEquals(stack.toString(), "---");
		
		stack.push(1);
		stack.push(2);
		
		assertEquals(stack.toString(), "2\n1\n---");
	}
}
