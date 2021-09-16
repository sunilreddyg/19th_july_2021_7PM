package ui_verification_Commands.cssvalue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Read_Element_Styles {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement Login_button=driver.findElement(By.name("login"));
		String BG_color=Login_button.getCssValue("background-color");
		System.out.println(BG_color);   //IT prints object color in RGBA format
		
		String Obj_font_Size=Login_button.getCssValue("font-size");
		System.out.println("Object font size available ---> "+Obj_font_Size);
		
		/*
		 * Because webdriver return color or backgroud color in RGBA format
		 * But somes color comparision we need to perform in HEX or RGB fortmat
		 */
		Color obj_color=Color.fromString(BG_color);
		System.out.println(obj_color.asHex());
		System.out.println(obj_color.asRgb());
		System.out.println(obj_color.asRgba());
	
		
		
	}

}
