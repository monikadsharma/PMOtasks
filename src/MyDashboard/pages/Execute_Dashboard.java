package MyDashboard.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Execute_Dashboard {
	
   public static Execute_Dashboard Click_Dashboard;
    static WebDriver driver= null;
	
	public static Execute_Dashboard Main_Page;
	
	public static void Click_Dashboard (WebDriver driver) {
		
		WebElement searchIconBar= driver.findElement(By.xpath("//a[@id=\"showRight\"]"));
		searchIconBar.click();
		WebElement searchmyDashboard= driver.findElement(By.xpath("//div//ul//li//a[@attr-selector='my-dashboards-title']"));
	    searchmyDashboard.click();
	    WebElement executiveDashboard= driver.findElement(By.xpath("(//div//ul//li//a[@attr-selector='Executive Dashboard-selector']"));
	    executiveDashboard.click();
	    WebElement learningBoardDashboard= driver.findElement(By.xpath("//div//ul//li//a[@attr-selector='R3834-report-id']"));
	    learningBoardDashboard.click();
	}
	   
	    
	  public static void Main_Page (WebDriver driver) throws InterruptedException {
		WebElement peopleBar= driver.findElement(By.xpath("//div[@attr-selector=\"People\"]"));
		peopleBar.click();  
		Thread.sleep(2000);
		
		WebElement detailBar= driver.findElement(By.xpath("//a[text()=\"Detail\"]"));
		detailBar.click(); 
		  
	    
	    }
		
	//public static void Click_MyDashboard(WebDriver driver) {
			
		//webElement 
			
		}
		
	

