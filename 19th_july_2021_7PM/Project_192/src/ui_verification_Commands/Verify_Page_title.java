package ui_verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_title {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//Get Current Window Runtime Browser Title
		String Pagetitle=driver.getTitle();
		System.out.println("Current Window title is --> "+Pagetitle);
		
		
		String Exp_title="Selenium";
		
		//Verify Equal Comparision between two strings
		boolean flag=Pagetitle.equals(Exp_title);
		System.out.println("Title Equal comparision is ---> "+flag);
		
		
		//Writing Decision statement to Continue execution based on true/false
		if(flag==true)    //Doubleequalsto  == is comparision command and return boolean value
		{
			System.out.println("Tespass, As expected expected title presented");
			WebElement Download=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
			Download.click();
			
			if(driver.getTitle().equals("Downloads | Selenium"))
				System.out.println("Testpass, Download page title verified");
			else
				System.out.println("Testfail,Download page title not verified");
			
		}
		else
		{
			System.out.println("Testfail, Your testcase failed because wrong title presented");
		}
		

	}

}
