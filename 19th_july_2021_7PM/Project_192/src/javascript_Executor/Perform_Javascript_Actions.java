package javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perform_Javascript_Actions {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//enabled javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Type text into exitbox using javascript
		js.executeScript("document.getElementById('email').value = 'Johnny Bravo'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value = ''");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
