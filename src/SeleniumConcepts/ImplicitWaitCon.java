package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitCon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();//lunch chrome 
		
        driver.manage().window().maximize();//maximize window
        
        driver.manage().deleteAllCookies();//delete all cookies
        
       driver.get("https://half.ebay.com");	//Enter url
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
        
        
        driver.close();
	}

}
