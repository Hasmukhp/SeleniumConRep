package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



//not working this script
public class ImageHandling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		boolean imageStatus=driver.findElement(By.id("logo-default")).isDisplayed();
		System.out.println(imageStatus);
		/*	String imageTitle=driver.findElement(By.id("logo-default")).getAttribute("title");
		System.out.println(imageTitle);
		*/
		driver.close();
		
	}

}
