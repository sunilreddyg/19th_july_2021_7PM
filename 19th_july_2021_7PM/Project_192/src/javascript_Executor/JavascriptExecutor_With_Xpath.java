package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_With_Xpath 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//enabled javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//click on button using javascript
		WebElement Login_button=driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", Login_button);
		
		
		
		
		
		

	}

}
