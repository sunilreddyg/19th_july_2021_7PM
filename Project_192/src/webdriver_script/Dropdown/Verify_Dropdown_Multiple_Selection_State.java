package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Multiple_Selection_State {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();				//Launch browser
		driver.get("http://bridgeqsystems.com/demo.php");	//Load webpage
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1"))).isMultiple();
		System.out.println("Dropdown Multiple option selection state is ? ---> "+flag);
		
		
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown Multiple option selection state is ? ---> "+flag1);
		
	}

}
