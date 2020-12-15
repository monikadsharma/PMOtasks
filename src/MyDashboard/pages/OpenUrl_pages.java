package MyDashboard.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenUrl_pages {
	
	public static OpenUrl_pages openurl;
	WebDriver driver= null;

	public static void openUrl(WebDriver driver) throws InterruptedException {

		//System.setProperty("webdriver.ie.driver",
				//"C:\\Users\\sudipta.sahoo\\eclipse-workspace\\Click\\Drivers\\InternetExplorer\\IEDriverServer_win64.exe");
		
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sudipta.sahoo\\InternetExplorer\\IEDriverServer_win64.exe");

		WebDriver driver1 = new InternetExplorerDriver();
		
		driver1.get("https://insightsmp.accenture.com");
		
		Thread.sleep(20000);
		
		

	}

}
