package ui_verification_Commands.getAttribute;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Attribute_Value1 {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Roundtrip radio button selection
		 * 		Given site url is "http://makemytrip.com"
		 * 		And verify triptype selecton oneway on browser launch
		 * 		When user tap on return date for bigger discounts
		 * 		Then Selection comes to roundtrip from oneway
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		
		
		WebElement TripType_oneway=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String OneWay_Class=TripType_oneway.getAttribute("class");
		
		//Condition to accept on Oneway trip type is selected
		if(OneWay_Class.equals("selected"))
		{
			System.out.println("As expected oneway is Selected on browser launch");
			WebElement ReturnData=driver.findElement(By.xpath("//span[contains(.,'RETURN')]"));
			ReturnData.click();
			Thread.sleep(4000);
			
				WebElement TripType_Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
				String Roundtrip_class=TripType_Roundtrip.getAttribute("class");
				
				if(Roundtrip_class.equals("selected"))
				{
					System.out.println("Testpass, Roundtrip is Selected");
				}
				else
				{
					System.out.println("Testfail, Roundtrip is not selected ");
				}
				
		}
		else
		{
			System.out.println("Oneway trip type is not selected on browser launch");
		}
		
		
		

	}

}
