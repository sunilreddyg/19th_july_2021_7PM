package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Example 
{
	public static void main(String[] args) throws Exception
	{
				
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement ATM=driver.findElement(By.xpath("//input[@id='amenity_category_order_types50']"));
		System.out.println("before selection --> "+ATM.isSelected());
		Thread.sleep(5000);
		
		ATM.click();
		System.out.println("after selection --> "+ATM.isSelected());
		
		

	}

}
