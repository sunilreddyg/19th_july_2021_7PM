package ui_verification_Commands.cssvalue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement Login_button=driver.findElement(By.name("login"));
		
		//This program hide obejct from webpage
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','display:none')",Login_button);
		
		//Get Located object x coordinates
		int Obj_x=Login_button.getLocation().getX();
		System.out.println("Object x coordinations available ---> "+Obj_x);
		
		//Get Located object y Coordinates
		int Obj_y=Login_button.getLocation().getY();
		System.out.println("Object y coordinations are --> "+Obj_y);
		
		/*
		 * Using obeject coodinates prove object is visible at webapge
		 * Because getx value return 0 when object is available at hidden state
		 */
		if(Obj_x > 0)
		{
			System.out.println("Object is visible at webpage");
		}
		else
		{
			System.out.println("Object is not visible at webpage");
		}
		

	}

}
