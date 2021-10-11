package framework.Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_And_AfterMethod {

  @BeforeMethod//Invoke before each @Test annotation method
  public void beforeMethod()
  {
	  System.out.println("Method PreCondition");
  }

  @AfterMethod //Invoke after each @Test annotation method
  public void afterMethod() 
  {
	  System.out.println("Method PostCondition");
  }
  
  
  @Test
  public void tc001() 
  {
	  Reporter.log("tc001 executed",true);
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("tc002 executed",true);
  }

}
