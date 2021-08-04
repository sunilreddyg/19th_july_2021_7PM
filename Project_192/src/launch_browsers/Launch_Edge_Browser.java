package launch_browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Inorder to launch edge browser we need to download msedgedriver.exe
		 * 			file and need to setup in environment variable before launching edge browser
		 * 
		 * 		Download msedgedriver.exe file:-->
		 * 				=> https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads
		 * 				=> findout what version of edge browser installed in your PC
		 * 							Open edge browser ---Then click on setting Menu
		 * 							---> Select Help Option ----> Select About microsoft edge
		 * 							--> It display in new window along with offical browser version
		 * 				=> Click on edgedriver version link w.r.t your chrome browser version
		 * 
		 * 								edgebrowser is 92 Then downlaod msedgedriver 92.0.4515.107
		 * 								
		 * 				=> Select operating systems and download zip format file for windows 
		 * 
		 * 				=> After downloading unzip file [For this action we receive msedgedriver.exe file]
		 * 				=> Setup Environment variable for msedgedriver.exe file before launch edge browser
		 * 					
		 */		
		
		
		System.setProperty("webdriver.edge.driver", "E:\\New_browser_Drivers\\msedgedriver.exe");
		EdgeDriver edge=new EdgeDriver();
		edge.get("http://instagram.com");
		
		System.out.println(edge.getTitle());
		
		

	}

}
