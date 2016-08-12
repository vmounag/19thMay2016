import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathsTest {

	/*
	 * User story
	 * factorial of 0 is 1
	 * factorial of 1 is 1
	 * if the number less than zero it should throw exception
	 * 
	 * 
	 */
	
	
	Maths m;
	@Before
	public void setUp() throws Exception {
		
		m=new Maths();
	}

	@Test
	public void whenNumberIsZeroFactorialIsOne()
	{
		assertEquals(1,m.fact(0));
	}
	
	@Test
	public void whenNumberIsOneFactorialIsOne()
	{
		assertEquals(1,m.fact(1));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenNumberIsNegativeItShouldThrowException()
	{
		assertEquals(1,m.fact(-10));
	}

}
