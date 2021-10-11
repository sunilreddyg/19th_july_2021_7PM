package framework.Testng.CrossBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test 
{
	public WebDriver driver;
	String path="new_drivers\\";
	
	@Test(priority=0)
	@Parameters("browsername")  //Parameter from suite file
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			//Set Runtime environment variable for chrome driver
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver",path+"msedgedriver.exe");
			driver=new EdgeDriver();
				
		default:System.out.println("browser mismatch");
			break;
		}
	}
	
	
	@Test(priority=1)
	@Parameters("appurl")   //Parameter from suite file
	public void loadApp(String url) throws Exception
	{
		Thread.sleep(5000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=2)
	@Parameters({"UID","PWD"})
	public void LoginDetails(String Auid, String Apwd) throws Exception
	{
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys(Auid);
		Reporter.log("Email enter finished");
		
		WebElement Passoword_EB=driver.findElement(By.id("pass"));
		Passoword_EB.clear();
		Passoword_EB.sendKeys(Apwd);
		Reporter.log("Password Enter finished");
				

	}
	
	@AfterSuite
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}
