package MyDashboard.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import MyDashboard.pages.Execute_Dashboard;
import MyDashboard.pages.OpenUrl_pages;


public class MyDashboardflow {
	public MyDashboardflow(WebDriver driver) {
		super();
		
	}
	
	static WebDriver driver =null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		OpenUrl_pages.openurl=new OpenUrl_pages();
		OpenUrl_pages.openUrl(driver);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Execute_Dashboard.Click_Dashboard = new Execute_Dashboard();
		Execute_Dashboard.Click_Dashboard(driver);
		

	}

}
