package ui_verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//Get Current Window Runtime Browser Title
		String Pagetitle=driver.getTitle();
		System.out.println("Current Window title is --> "+Pagetitle);
		
		//Get Current window Runtime Browser URL
		String Page_url=driver.getCurrentUrl();
		System.out.println("Current Window url is ---> "+Page_url);
		
		//Get Current Window Dynamic ID [It is a runtime id only genarate by webdriver]
		String WindowID=driver.getWindowHandle();
		System.out.println("Current Window ID is ---> "+WindowID);
		
		//Get Current WIndow pageSource
		String page_source=driver.getPageSource();
		System.out.println(page_source);
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
