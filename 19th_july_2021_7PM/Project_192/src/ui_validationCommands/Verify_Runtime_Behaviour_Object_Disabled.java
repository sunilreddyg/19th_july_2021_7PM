package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_Behaviour_Object_Disabled {

	public static void main(String[] args) 
	{
		/*
		 * 	Testcase:-->
		 *
		 *	Given site url is "https://v1.hdfcbank.com/branch-atm-locator"
		 * 	Verify Locality editbox disabled before select state and city dropdown
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement Locality_Editbox=driver.findElement(By.xpath("//input[@id='customLocality']"));
		
		if(!Locality_Editbox.isEnabled())
		{
			System.out.println("Testpass, Editbox is in disabled mode");
		}
		else
		{
			System.out.println("Testfail, editbox in enabled mode");
		}
		
		
		
		/*
		 * Note:--> IN Selenium webdriver we don't have direct method to validate disabled
		 * 			functionality. So that we can use enabled method to validate disabled
		 * 			behaviour by just adding  [!] Validation.
		 */
		

	}

}
