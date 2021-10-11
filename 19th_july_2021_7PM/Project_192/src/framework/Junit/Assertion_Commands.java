package framework.Junit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Assertion_Commands 
{

	@Test
	public void test_characters() 
	{
		Assert.assertEquals("login", "login");
		System.out.println("Text is matching");
		
	}
	
	@Test
	public void test_numbers() 
	{
	
		Assert.assertEquals(11,10);
		System.out.println("Number are matching");
		
	}
	
	@Test
	public void test_boolean_value() 
	{
	
		Assert.assertEquals(true,true);
		System.out.println("Boolean value is mathing");
	}
	
	
	@Test
	public void test_Status() 
	{
	
		Assert.assertTrue(false);
		System.out.println("Status is true");
	}
	
	
	@BeforeClass
	public static void setupbeforeclass() throws Exception
	{
		System.out.println("Datatype testing started");
	}

}
