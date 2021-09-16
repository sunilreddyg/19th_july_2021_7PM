package ui_verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_At_PageSource {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Perform action when element presented at source and avoid 
		 * performing action when element not presented at source
		 */
		
		
		//Condition to verify selected elemnet available at pagesource
		if(driver.getPageSource().contains("email"))
		{
			System.out.println("Element is presented at source");
			driver.findElement(By.id("email")).sendKeys("darshan");
			//FindElemnet will throw exception when elemnet is not available at source
		}
		else
		{
			System.out.println("Element is not presented at source");
		}
		
		
		
		
		//Similar action we can also manage with try-catch block
		try {
			
			driver.findElement(By.id("email868dhfkhdsgf")).sendKeys("darshan"); //FindElemnet method throw exception on invalid identification
			System.out.println("Element is presented");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		driver.findElement(By.id("passwordsjfkdjkflj")).sendKeys("darshan");
		System.out.println("password element is identified");

	}

}
