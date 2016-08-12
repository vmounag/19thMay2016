import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOperatin {

	//@BeforeClass
	//public static void setUpBeforeClass() throws Exception {
	//}
AdditionExample a;
	/*@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
@Test
public void testAddition()
{
	AdditionExample a=new AdditionExample();
	assertEquals(5,a.add(2,3));
}
}