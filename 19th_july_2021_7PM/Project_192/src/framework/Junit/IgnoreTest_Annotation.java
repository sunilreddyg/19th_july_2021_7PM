package framework.Junit;


import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest_Annotation {

	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Ignore  //Ignore method execution
	public void test2() 
	{
		System.out.println("Test2 executed");
	}
	
	@Test
	public void test3() 
	{
		System.out.println("Test3 executed");
	}



}
