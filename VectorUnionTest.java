

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
		//merge the 2 empty vectors 
	    	Vector<Integer> e1 = new Vector<Integer>(5); 
            	Vector<Integer> e2 = new Vector<Integer>(5); 		
		
		Vector<Integer> r3 = MyVector.union(e1,e2);

		Assert.assertTrue(r3.isEmpty());
	}

	@Test
	public void testFailureTest() {
		
	/ Declaring the Vector with 
        // initial size n 
        Vector<Integer> v1 = new Vector<Integer>(n); 
        Vector<Integer> v2 = new Vector<Integer>(n); 

        // Appending new elements at 
        // the end of the vector 
        for (int i = 1; i <= n; i= i+2) 
            v1.add(i); 
  
        for (int i = 2; i <= n; i= i+2) 
            v2.add(i); 		

	Vector<Integer> r3 = MyVector.union(v1,v2);

	Assert.assertTrue(r3.isEmpty());
	}
	

}
