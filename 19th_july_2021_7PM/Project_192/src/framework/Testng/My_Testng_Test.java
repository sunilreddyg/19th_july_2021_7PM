package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_Testng_Test 
{
  @Test //Invoke test without object creation and main method
  public void test1() 
  {
	  Reporter.log("test1 executed");
  }
  
  @Test //Invoke test without object creation and main method
  public void test2() 
  {
	  Reporter.log("test2 executed");
  }
  
  
  @Test //Invoke test without object creation and main method
  public void test3() 
  {
	  Reporter.log("test3 executed");
  }
}
