package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) {
		
		/*
		 * Note:--> Inorder to launch firefox browser we need to download geckodriver.exe
		 * 			file and need to setup in environment variable before launching firefox browser
		 * 
		 * 		Download geckodriver.exe file:-->
		 * 				=> https://github.com/mozilla/geckodriver/releases
		 * 				=> findout what version of firefox  browser installed in your PC
		 * 							Open firefox browser ---Then click on setting Menu
		 * 							---> Select Help Option ----> Select About firefox
		 * 							--> It display in new window along with offical browser version
		 * 
		 * 				=>  Findout suitable driver version w.r.t to browser version
		 * 					[https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html]
		 * 
		 * 				=>  Under geckodriver version go to assets
		 * 				=>  Downlaod zip formation file w.r.t oprating systems and hotspot size
		 * 				
		 * 				=> Select operating systems and download zip format file for windows 
		 * 
		 * 				=> After downloading unzip file [For this action we receive msedgedriver.exe file]
		 * 				=> Setup Environment variable for msedgedriver.exe file before launch edge browser
		 * 					
		 */		
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\New_browser_Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("https://google.com");
		
		
		System.out.println(firefox.getTitle());

	}

}
