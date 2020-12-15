package MyDashboard.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import MyDashboard.pages.Execute_Dashboard;
import MyDashboard.pages.OpenUrl_pages;


public class demo {
	public demo(WebDriver driver) {
		super();
		
	}
	
	static WebDriver driver;
	String Click_Dashboard= null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sudipta.sahoo\\InternetExplorer\\IEDriverServer_win64.exe");

		WebDriver driver = new InternetExplorerDriver();
			//System.setProperty("webdriver.chrome.driver",
			//"C:\\Users\\sudipta.sahoo\\eclipse-workspace\\Click\\Drivers\\chromebrowser\\chromedriver_win32.exe");		
			//WebDriver driver = new ChromeDriver();	
		
		driver.get("https://insightsmp.accenture.com");
		
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Execute_Dashboard.Click_Dashboard = new Execute_Dashboard();
		Execute_Dashboard.Click_Dashboard(driver);
		
		Execute_Dashboard.Main_Page = new Execute_Dashboard();
		Execute_Dashboard.Main_Page(driver);
		
		

	}

}
