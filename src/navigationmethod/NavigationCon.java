package navigationmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Working

public class NavigationCon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("SDET Tutorial");
		driver.findElement(By.name("btnK")).submit();
		driver.navigate().to("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("hari@keil123.com");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
/*		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
	*/
		Thread.sleep(8000);
		
	driver.close();
	}

}
