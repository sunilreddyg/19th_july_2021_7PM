package webdriver_script.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Syntax {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Primary usage:-->
		 * 			1. Clear is the method designed to clear existing text at editbox
		 * 			2. Clear command is only usefull for textbox to clear and don't use
		 * 					for any other objects like [links,button,dropdown ---etc]
		 * 			3. In case clear command use for other objects it throws exception 
		 * 							"Invalid Element State Exception"
		 */
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Launch browser
		driver.get("https://www.outlook.com/");		//Load webpage
		driver.manage().window().maximize();
		
		//Click on Signin button
		driver.findElement(By.xpath("(//a[@data-task='signin'])[1]")).click();
		
		
		
		driver.findElement(By.name("loginfmt")).sendKeys("arjun");
		driver.findElement(By.name("loginfmt")).clear(); //It clear arjun text at username editbox
		driver.findElement(By.name("loginfmt")).sendKeys("aadarsh");
	}

}
