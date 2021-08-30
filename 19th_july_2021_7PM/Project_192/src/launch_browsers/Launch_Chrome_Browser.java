package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		
		
		/*
		 * Note:--> Inorder to launch chrome browser we need to download chromedriver.exe
		 * 			file and need to setup in environment variable before launching chrome browser
		 * 
		 * 		Download chromdriver.exe file:-->
		 * 				=> https://chromedriver.chromium.org/
		 * 				=> findout what version of chrome browser installed in your PC
		 * 							Open chrome browser ---Then click on setting Menu
		 * 							---> Select Help Option ----> Select About Google Chrome
		 * 							--> It display in new window along with offical browser version
		 * 				=> Click on chromedriver version link w.r.t your chrome browser version
		 * 
		 * 								chromebrowser is 92 Then downlaod ChromeDriver 92.0.4515.107
		 * 								chromebrowser is 93 Then download ChromeDriver 93.0.4577.15
		 * 				=> Select operating systems and download zip format file for windows 
		 * 
		 * 				=> After downloading unzip file [For this action we receive chromedriver.exe file]
		 * 				=> Setup Environment variable for chromedriver.exe file before launch chrome browser
		 * 					
		 */		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		
		System.out.println(chrome.getTitle());
		
		//chrome.close();      //This action will close browser window
		
	
		

	}

}
