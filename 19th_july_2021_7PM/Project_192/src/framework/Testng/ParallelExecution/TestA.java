package framework.Testng.ParallelExecution;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestA 
{
	
WebDriver driver;
String driver_path="C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe";
String url="http://facebook.com";

@BeforeClass
public void setupbrowser()
{
	System.setProperty("webdriver.chrome.driver", driver_path);
	driver=new ChromeDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}

	@Test
	public void verify_login_link()
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		Assert.assertEquals(driver.getTitle(),"Log in to Facebook");
		Reporter.log("Testpass, Expected title displayed for login link");
	}

  @AfterClass
  public void afterClass() throws Exception
  
  {
	  Thread.sleep(3000)
	  ;driver.close();
  }

}
