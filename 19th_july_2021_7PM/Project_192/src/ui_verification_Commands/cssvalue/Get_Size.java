package ui_verification_Commands.cssvalue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement Login_button=driver.findElement(By.name("login"));
		
		int Obj_height=Login_button.getSize().getHeight();
		int Obj_width=Login_button.getSize().getWidth();
		System.out.println("Object height available is "+Obj_height);
		System.out.println("OBject width available is "+Obj_width);
		
		
		/*
		 * Getrect:-->
		 * 			Method capture object x and y and object height and width
		 */
		 int objx=Login_button.getRect().getX();
		 int objH=Login_button.getRect().getHeight();
		 System.out.println("Rect object height is --> "+objH);
		 System.out.println("Rect object x is --> "+objx);
		
		
		

	}

}
