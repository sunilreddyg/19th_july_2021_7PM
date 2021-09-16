package ui_verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_url {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		if(driver.getCurrentUrl().equals("https://www.selenium.dev/"))
		{
			System.out.println("Testpass, Expected url presented");
			
			WebElement Download=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
			Download.click();
			
			if(driver.getCurrentUrl().contains("downloads/"))
				System.out.println("Testpass, Downlaod page url verified");
			else
				System.out.println("Testfail, Download page url not verified");
		}
		else
		{
			System.out.println("Testfail, Expected url not presented");
		}
		
		
		
		

	}

}
