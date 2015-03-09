package com.lab2.transit;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;
@RunWith(Parameterized.class)

public class FareCalculatorTest {

	private double expected;
	private int age;
	private String time;
	private boolean isHoliday;
	private	static	final double DELTA = 1e-15;
	
	public FareCalculatorTest(double expected, int age, String time, boolean isHoliday){
		this.expected = expected;
		this.age = age;
		this.time = time;
		this.isHoliday = isHoliday;
		
	}
	private FareCalculatorTest myTest;
	
	@Parameters
	public static Collection<Object[]> testParams(){
		return Arrays.asList(new Object[][]{
				{0.0, 4, "6:00", false}
		});
	}
	@Before
	public void setUp(){
		Object testP[] = testParams().toArray();
		myTest = new FareCalculatorTest((double)testP[0], (int)testP[1], testP[3].toString(), (boolean)testP[0]);
		
	}
	
	@Test
	public void calculateFareTest() {
		
		assertEquals(0.0, FareCalculator.calculateFare(myTest.age, myTest.time, myTest.isHoliday), DELTA);
		
		fail("Not yet implemented");
	}

}
