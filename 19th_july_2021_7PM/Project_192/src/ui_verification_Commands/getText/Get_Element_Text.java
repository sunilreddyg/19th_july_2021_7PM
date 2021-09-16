package ui_verification_Commands.getText;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Text {

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
		Email_Textbox.sendKeys("qadarshan@gmail.com"+Keys.ENTER);  //Enter keyword submit email id
		Thread.sleep(5000);
		
		//Identify location and read text init
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Act_errmsg=Error_location.getText();
		System.out.println(Act_errmsg);
		
		String Exp_errmsg="That Microsoft account doesn't exist. Enter a different account or get a new one.";

		//Verify Expected and Actual text
		if(Act_errmsg.equals(Exp_errmsg))
		{
			System.out.println("Testpass, Expected error message was displayed");
		}
		else
		{
			System.out.println("Testfail, Expected error message not displayed");
		}
	}

}
