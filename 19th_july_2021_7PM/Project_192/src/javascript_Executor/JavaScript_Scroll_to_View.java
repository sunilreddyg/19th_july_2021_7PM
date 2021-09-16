package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Scroll_to_View {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//enabled javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		WebElement signin_link=driver.findElement(By.linkText("Sign Up"));
		js.executeScript("arguments[0].scrollIntoView()", signin_link);
		

	}

}
