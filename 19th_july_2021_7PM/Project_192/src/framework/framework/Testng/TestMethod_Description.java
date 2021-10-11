package framework.framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod_Description 
{
	
	
  @Test(priority=0,description="verifying login with valid data")
  public void tc001() 
  {
	  Reporter.log("Login successfull with valid data");
  }
  
  @Test(priority=0,description="verifying login with Invalid data")
  public void tc002() 
  {
	  Reporter.log("Error message displayed when user attempted with invalid email");
  }
  
  
  
}
