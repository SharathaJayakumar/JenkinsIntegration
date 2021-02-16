

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;
import org.junit.Test; // for @Test
import org.junit.Before; // for @Before

import java.io.*; 
import java.util.*; 



public class VectorUnionTest {
      //Tests for the class BoundedQueue

	private VectorUnion MyVector;

	@Before
	public void setUp() {
	}
	
	@Test
	public void testNullQueueTest() {
		Assert.assertEquals(null, MyVector.union(null,null));
	}

	@Test
	public void testEmptyQueueTest() {
	    Vector<Integer> e1 = new Vector<Integer>(5); 
        Vector<Integer> e2 = new Vector<Integer>(5); 
		
		Vector<Integer> r3 = MyVector.union(e1,e2);

		Assert.assertTrue(r3.isEmpty());
	}


}
