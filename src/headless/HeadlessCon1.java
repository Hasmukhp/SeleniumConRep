package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Working
public class HeadlessCon1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--Headless");
		
		WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nopcommerce.com/");
        System.out.println("Title of the page:"+driver.getTitle());
        
        
	}

}
