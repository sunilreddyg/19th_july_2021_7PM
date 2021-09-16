package ui_verification_Commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_input_Presented_At_Editbox {

	public static void main(String[] args) 
	{
		//Capture text inside editbox
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Typing text into editbox/textbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Darshan");
		
		//Read Text inside editbox
		String Typed_Email=Email.getAttribute("value");
		System.out.println("Typed characters at email is ---> "+Typed_Email);
		
		//Clear Text at editbox
		Email.clear();
		
		//Verify Text  Cleared at editbox
		if(Email.getAttribute("value").isEmpty())
			System.out.println("No Text presented at editbox");
		else
			System.out.println("After clear also text presented at editbox");
		

	}

}
