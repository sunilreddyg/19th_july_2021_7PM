package framework.Testng.ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestB 
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

	@org.testng.annotations.Test
	public void verify_Signup_link()
	{
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
		Reporter.log("Testpass, Expected title displayed for signup link");
	}


	  @AfterClass
	  public void afterClass() throws Exception
	  
	  {
		  Thread.sleep(3000);
		  driver.close();
	  }

}
