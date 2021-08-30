package webdriver_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
		/*
		 * Note:-->
		 * 		Webdriver is a common interface class it can manipulate all
		 * 		browser instances supported by selenium.
		 * 
		 * 		WebDriver interface support cross browser automation
		 * 		[We can design code for one browser and same code we can use for other browser to automate]
		 */
		
		/*
		 * Exceptions:-->
		 * 	=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 		IllegalStateException:-->
		 * 			When Chromdriver.exe file not located
		 * 			under current system.
		 * 
		 * 	=> driver.get("http://google.com");
		 * 		
		 * 		SessionNotCreated:-->
		 * 			Exception display when browserdriver
		 * 			version mismatch with browser version.
		 * 
		 * 		InvalidArgumentException:-->
		 * 			When Url defined without http:// or https://
		 * 	
		 * 			Invalid:-->    driver.get("www.google.com");
		 * 			Valid:---->	   driver.get("http://google.com");
		 */
		
		
		

	}

}
