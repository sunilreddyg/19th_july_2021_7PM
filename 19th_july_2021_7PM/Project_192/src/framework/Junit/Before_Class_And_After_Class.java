package framework.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_Class_And_After_Class
{

	@BeforeClass //Invoke before execution of first @Test with in class
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass //Invoke after executino of last @Test with in class
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
	}

	@Test //Invoke method to run without object creation
	public void test1() 
	{
		System.out.println("Test1 executed");
	}
	
	@Test //Invoke method to run without object creation
	public void test2() 
	{
		System.out.println("Test2 executed");
	}

}
