package webdriver_script.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singin_With_Keyboard_Shortcuts {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		//Launch browser
		driver.get("https://www.outlook.com/");		//Load webpage
		driver.manage().window().maximize();
		
		//Click on Signin button
		driver.findElement(By.xpath("(//a[@data-task='signin'])[1]")).click();
		
		
		//Type text into edtibox and press Enter key using keyboard shortcut
		driver.findElement(By.name("loginfmt")).sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		Thread.sleep(5000); //It pause execution for 5 seconds
		
		
		//Type text into password textbox and press enter key using keboard shortcut
		driver.findElement(By.name("passwd")).sendKeys("Hello12345"+Keys.ENTER);

	}

}
