/**
 * @author Indiana Huey && Lucky Lim
 * 
 * @version 0.0.1
 */

package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test Operation methods
 */
class OperationTest {

	@Test
	void testPerformOperation() {
		
		// addition
		assertEquals(Operation.performOperation('+', 10, 2), 12);
		assertEquals(Operation.performOperation('+', -10, 2), -8);
		assertEquals(Operation.performOperation('+', -3, -5), -8);
		assertEquals(Operation.performOperation('+', 0, 2), 2);
		assertEquals(Operation.performOperation('+', 2, 0), 2);
		assertEquals(Operation.performOperation('+', 0, 0), 0);
		
		// subtraction
		assertEquals(Operation.performOperation('-', 3, 5), -2);
		assertEquals(Operation.performOperation('-', -10, 2), -12);
		assertEquals(Operation.performOperation('-', -3, -5), 2);
		assertEquals(Operation.performOperation('-', 0, 2), -2);
		assertEquals(Operation.performOperation('-', 10, 0), 10);
		assertEquals(Operation.performOperation('-', 0, 0), 0);
		
		// multiplication
		assertEquals(Operation.performOperation('*', 10, 2), 20);
		assertEquals(Operation.performOperation('*', -10, 2), -20);
		assertEquals(Operation.performOperation('*', -10, -2), 20);
		assertEquals(Operation.performOperation('*', 0, 2), 0);
		assertEquals(Operation.performOperation('*', -10, 0), 0);
		assertEquals(Operation.performOperation('*', -10, -0), 0);
		assertEquals(Operation.performOperation('*', 0, 0), 0);
		
		// division
		assertEquals(Operation.performOperation('/', 10, 2), 5);
		assertEquals(Operation.performOperation('/', -10, 2), -5);
		assertEquals(Operation.performOperation('/', -10, -2), 5);
		assertEquals(Operation.performOperation('/', 0, 2), 0);
	}

}
