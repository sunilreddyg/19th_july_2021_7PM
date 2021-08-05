package webdriver_script;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Script 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();							//Launch browser
		driver.get("https://opensource-demo.orangehrmlive.com/");		//Load webpage
	    driver.manage().window().setSize(new Dimension(1366, 728)); 	//Maximize browser
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");		//Type username
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");	//Type password
	    driver.findElement(By.id("btnLogin")).click();				  	//Login button
		

	}

}
