package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select_Commands {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();						//Launch browser
		driver.get("https://opensource-demo.orangehrmlive.com/");	//Load webpage
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Identifying object with linkname 
		driver.findElement(By.linkText("Recruitment")).click();
		
		//Selecting dropdown option using visibel option name
		new Select(driver.findElement(By.id("candidateSearch_jobTitle")))
		.selectByVisibleText("Account Assistant");
		
		
		//Selecting dropdown option using option value property
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("candidateSearch_jobVacancy")))
		.selectByValue("5");
		
		
		//Selecting dropdown option using index number
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("candidateSearch_hiringManager")))
		.selectByIndex(1);
		
		/*
		 * Que:-->How to Select Dropdown option without using Select Class:-->
		 * 	Ans:--> use direct click on by selection option tag
		 */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='candidateSearch_status']/option[2]")).click();
		
		
		/*
		 * Que:--> How to select dropdown option without using select class
		 * Ans:--> Using sendkeys we can select dropdown
		 * 
		 * Remark:-->
		 * 		Because sendkeys accept keyboard shortcuts webdriver doesn't throw
		 * 		exception when Requied option not available at dropdown
		 */
		driver.findElement(By.id("candidateSearch_modeOfApplication")).sendKeys("Sunil");
		System.out.println("Sunil is Selected");
		
	}

}
