package ui_verification_Commands.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Get_Page_Text {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:-->
		 * 			Verify login with invalid email
		 * 	
		 * 			Given site url http://outlook.com
		 * 			And click signin button
		 * 			When user Enter invalid email "info3efdf@gmail.com"
		 * 			And click Next button
		 * 			Then verify Error message displayed at error location
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement Singin_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Singin_button.click();
		
		
		//Type Invalid email
		WebElement Email_Textbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_Textbox.clear();
		Email_Textbox.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		Thread.sleep(4000);
		
		
		//locate a page
		WebElement page=driver.findElement(By.tagName("body"));
		String page_text=page.getText();
		System.out.println(page_text);
		
		
		String Exp_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		//verify Expected text visible at webpage
		if(page_text.contains(Exp_text))
		{
			System.out.println("Testpass, Expected text visible at webpage");
		}
		else
		{
			System.out.println("Expected text not visible at webapge");
		}

	}

}

