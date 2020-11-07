package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousemovmentCon {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
        driver.manage().window().maximize(); 
	     driver.manage().deleteAllCookies();
	 // System.out.println("Spicejet open and close there is no  error ");
	  Thread.sleep(3000);
        
	  Actions action=new Actions(driver);
      action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
        driver.findElement(By.linkText("SpiceMAX")).click();
        
        
        //driver.quit();
		
		
	}

}
