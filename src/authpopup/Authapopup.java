package authpopup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Authapopup 
{
	
		public static void main(String []args) 
		{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); 
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/digest_auth");
		
		//http://username:password@test.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
	   String text=driver.findElement(By.cssSelector("P")).getText();
	   System.out.println(text);
	   System.out.println("git 2nd commeit2");
	  
		}
}




