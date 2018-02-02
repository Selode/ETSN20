package trianglepackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TriangleTest for testing the Triangle class.
 * This template is used in the exercise phase 1.
 * Students should add relevant unit test cases related to the Triangle 
 * class to this class.
 */
public class TriangleTest {

	private Triangle rightAngledTriangle;

	
	@BeforeClass
	/*
	 * The method run once before any of the test methods in the class.
	 */
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	/* 
	 * The method will be run after all the tests in the class have been run
	 */
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	/*
	 * Initializes common objects. The method will be run before the Test method.
	 */
	public void setUp() throws Exception {
		rightAngledTriangle = new Triangle(3, 4, 5);
	}

	@After
	/*
	 *   Cleanup method. This method will be run after the Test method is completed
	 */
	public void tearDown() throws Exception {
		rightAngledTriangle = null;
	}

	@Test
	/* 
	 * Tests whether the triangle specified in the fixture (setUp) 
	 * is right-angled. 	
	 *
	 * A public void method that is attached to be run as a test case. 
	 * To run the method, JUnit first constructs a fresh instance of the class then 
	 * invokes the annotated method. Any exceptions thrown by the test will be reported
	 * by JUnit as a failure. If no exceptions are thrown, the test is assumed to have 
	 * succeeded. 
	*/
	public void test() {
		assertTrue("Should return true for a right-angled triangle",
	            rightAngledTriangle.isRightAngled());
		assertEquals("Should return 'right-angled'", "right-angled", rightAngledTriangle.classify());		
	}

}