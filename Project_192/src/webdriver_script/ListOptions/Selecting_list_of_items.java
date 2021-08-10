package webdriver_script.ListOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_list_of_items {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Launch browser
		driver.get("https://www.hdfcbank.com/");	//Load webpage
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[@value='4'][contains(.,'Loans')]")).click();
		
		
		/*
		 * Note:---> There is no separate option available for list  items to select
		 * 			=> Click First time to open list of items
		 * 			=> Then user click method to select option under list..
		 */
		

	}

}
