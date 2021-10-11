package framework.Testng;


import mq.selenium.library.CommonReusableActions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Facebook_links extends CommonReusableActions
{
  @BeforeClass
  public void beforeClass() 
  {
	  launch_browser("chrome");
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  
  }

}
