package framework.Junit;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Junit_WebDriver_Test 
{
	static WebDriver driver;
	@Rule public TestName test=new TestName();  //Get Current Constrcuted test name

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\"+test.getMethodName()+".png"));
	}

	@Test
	public void tc001_Verifying_Signup_now_link() 
	{
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Testpass, Expected title displayed for signup link");
	}
	
	
	@Test
	public void tc002_Verifying_Login_link()
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
		System.out.println("Testpass, Expected title displayed for login link");
	}
	
	@Test
	public void tc003_Verifying_Messenger_link()
	{
		driver.findElement(By.xpath("//a[@title='Take a look at Messenger.']")).click();
		Assert.assertEquals("https://www.messenger.com/", driver.getCurrentUrl());
		System.out.println("Tetpass, Expected url displayed for messenger link");
	}

}
