

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;
import org.junit.Test; // for @Test
import org.junit.Before; // for @Before



public class VectorUnionTest {
      //Tests for the class BoundedQueue

	private VectorUnion MyVector;

	@Before
	public void setUp() {
	}
	
	@Test
	public void testEmptyQueueTest() {
		Assert.assertEquals(null, MyVector.union(null,null));
	}

}
