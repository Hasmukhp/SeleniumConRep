package elementhandling;

import java.sql.Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverCon {
      static WebDriver wd;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	//WebDriver driver=new ChromeDriver();
    	
    	ChromeOptions options=new ChromeOptions(); 
    	options.addArguments("--disable-notifications");
    	wd=new ChromeDriver(options);
    	
    	wd.get("https://portal.qa.kidsxap.com.au/");
    	wd.manage().window().maximize();
        Thread.sleep(4000); 
    	Actions act=new Actions(wd);
    	
    	wd.findElement(By.id("txtUserName")).sendKeys("planetchildorg@4tmail.com");
    	wd.findElement(By.id("txtPassword")).sendKeys("Admin123");
    	wd.findElement(By.id("btnLogin")).click();
    	 Thread.sleep(8000);
    
    	  WebElement dashboardOption=wd.findElement(By.xpath("//aside[@class='sidebar sidebar-width']"));
    	  
    	  act.moveToElement(dashboardOption).perform();
    	  
    	  
    	  wd.findElement(By.xpath("//li[@id='liFamilies']//a")).click();
    	  Thread.sleep(4000);
    	  
    	  
    	  //wd.close();
                	
    	//span[@class='position']
    	////li[@id='liFamilies']//a  
	}

}
