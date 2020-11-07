package headless;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.chrome.ChromeOptions;


//working
public class HeadlessFirefox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");	
		
		FirefoxOptions options=new FirefoxOptions();
		//options.setHeadless(true);
		options.addArguments("--Headless");
		
		WebDriver driver=new FirefoxDriver(options);
		
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nopcommerce.com/");
        System.out.println("Title of the page:"+driver.getTitle());
		
		
		
	}

}
