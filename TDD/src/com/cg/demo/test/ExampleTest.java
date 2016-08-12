package com.cg.demo.test;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class ExampleTest {
	/*
	 * userstory 
	 *  a is 0 give even
	 *  a is negative throw exception
	 */
Example e;
@Before
public void setUp() throws Exception {
	
	e=new Example();
}

@Test
public void whenNumberIsZeroItIsEven()
{
	assertTrue(e.even(0)=="even");
}

@Test
public void whenNumberIsOneOddShouldBeDisplayed()
{
	assertTrue(e.even(1)=="odd");
}

@Test(expected=java.lang.IllegalArgumentException.class)
public void whenNumberIsNegativeItShouldThrowException()
{
	assertTrue(e.even(-2)=="exception");

}

}