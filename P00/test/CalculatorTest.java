import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	} // add comment
	// code executed before all test methods
	
	@Before
	public void setUp() throws Exception {
	// code executed before each test method
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented"); 
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented"); 
				int a = 9876;
				int b = 4321;
				
				Calculator cal = new Calculator();
				int actual = cal.subtract(a, b);
				
				int expected = 5555;
				assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented"); 
				int a = 6;
				int b = 5;
				
				Calculator cal = new Calculator();
				int actual = cal.multiply(a, b);
				
				int expected = 30;
				assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented"); 
				int a = 90;
				int b = 9;
				
				Calculator cal = new Calculator();
				int actual = cal.divide(a, b);
				
				int expected = 10;
				assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws Exception {
	// code executed after each test method
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	// code executed after each test method
	}
}
