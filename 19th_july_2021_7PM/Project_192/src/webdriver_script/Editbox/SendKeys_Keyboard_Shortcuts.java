package webdriver_script.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Keyboard_Shortcuts {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();				//Launch browser
		driver.get("https://www.facebook.com/r.php");		//Load webpage
		driver.manage().window().maximize();
		
		
		//Press TAB key inorder to move for next control object
		driver.findElement(By.name("firstname")).sendKeys(Keys.TAB,Keys.TAB,"Surugi");
		
		
		//Select a dropdown and press Arrowdown key
		Thread.sleep(4000);
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		/*
		 * Note:--> Sendkeys can not only managing typing text into editboxes
		 * 			it also usefull to pass some keybaord shortcuts on selected location..
		 */

		
		
		
		
	}

}
