package webdriver_script.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Footer_links {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Launch browser
		driver.get("https://www.facebook.com/");		//Load webpage
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Messenger")).click();
		Thread.sleep(2000);
		
		//Identifying link with partial name..
		driver.findElement(By.partialLinkText("Lite")).click();
		
	}

}
