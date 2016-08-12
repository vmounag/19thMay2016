import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMaxElement {

	/*@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
@Test
public void testMaxElement()
{
	MaxTest m=new MaxTest();
	assertEquals(5,m.maxElement(new int[] {1,2,5,4,3}));
}
	
}
