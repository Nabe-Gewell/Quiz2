package TuitionCalculator_Test;

import static org.junit.Assert.*;
import base.TuitionCalculator; //
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class TuitionCalculator_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calculateTotalTuitionTest() 
	{
		assertTrue(TuitionCalculator.calculateTotalTuition(20200, 25) == 95950.00);
		assertFalse(TuitionCalculator.calculateTotalTuition(14242, 44) == 99499.00);
	}

	@Test
	public void calculateMonthlyPaymentsTest() 
	{
		assertTrue(TuitionCalculator.calculateMonthlyPayments(1, 33, 70000.00) == 207.61);
		assertFalse(TuitionCalculator.calculateMonthlyPayments(4, 20, 12300.00) == 75.54);
	}

}