package elementhandling;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This script is working ok

public class DropDownCon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.xpath("//a[@id='u_0_2']")).click();//click on create new account 
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//select[@id='day']")).sendKeys("7");
    	driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jul");
    	//driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2016"); //1>way to select the year
    	
    	//2>way of selecting the year
    	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
    	List<WebElement> Options=year.findElements(By.cssSelector("option"));
           
    	for(WebElement option:Options)
    	{
    		if (option.getAttribute("value").equals("2010"))
    		{
    			option.click();
    			break;
    			
    		}
    		
    		
    	}
    	Thread.sleep(4000);
    	driver.quit();
	}

}
