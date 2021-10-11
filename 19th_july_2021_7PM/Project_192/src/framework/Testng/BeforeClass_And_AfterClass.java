package framework.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{

  @BeforeClass  //Invoke before execution of first @Test annotation
  public void beforeClass() 
  {
	  System.out.println("Pre class method Executed");
  }

  @AfterClass  //Invoke after execution of last @Test annotation
  public void afterClass() 
  {
	  System.out.println("PostClass method executed");
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
