package ui_verification_Commands.getAttribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_TextBox_input_Value {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		WebElement MobileNum=driver.findElement(By.xpath("//input[@type='tel']"));
		MobileNum.sendKeys("9441213490");
		Thread.sleep(5000);
		
		
		WebElement Operator_Textbox=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		String Operatorname=Operator_Textbox.getAttribute("value");
		System.out.println(Operatorname);
		

	}

}
