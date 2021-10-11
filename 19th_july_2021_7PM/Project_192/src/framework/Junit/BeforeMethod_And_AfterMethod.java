package framework.Junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod {

	@Before //Invoke every @Test annotation before
	public void setUp() throws Exception
	{
		System.out.println("Test preCondition");
	}

	@After //Invoke every @Test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("Test postcondition");
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
