package utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class AndroidRuntimeDriver {
	
	 static int result;
	
	public static void main (String[] args){
		
		String one = System.getProperty("one");
		String two = System.getProperty("two");
		result = (Integer.valueOf(one) + Integer.valueOf(two));
		
	 System.out.println(result);
	 System.out.println(result);
	 System.out.println(result);
	 System.out.println(result);
	 System.out.println(result);
	 System.out.println(result);
	 System.out.println(result);
	 
	
		
	}
	
	@Test
	public void testGetProfile() throws Exception {
		String one = System.getProperty("one");
		String two = System.getProperty("two");
		result = (Integer.valueOf(one) + Integer.valueOf(two));
		
	    assertEquals(3, result);
	 
	}

}
