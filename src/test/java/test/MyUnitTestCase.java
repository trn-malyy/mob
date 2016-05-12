package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class MyUnitTestCase
{
   
	@Test
	public void true_test(){
	  
		assertTrue(true);
		
		
	}
	
	@Test
	public void true_test_again(){
	  
		assertFalse(false);
		
		
	}
	
	@Test
    public void testApp()
    {
        assertTrue( true );
    }
	
	
	@Test
	public void testGetProfile() throws Exception {
		
		String one = System.getProperty("one");
		String two = System.getProperty("two");
		 System.out.println(one);
		 System.out.println(two);
		
		int result = (Integer.valueOf(one) + Integer.valueOf(two));
		 System.out.println(result);

		
	    assertEquals(3, result);
	 
	}
    
}
