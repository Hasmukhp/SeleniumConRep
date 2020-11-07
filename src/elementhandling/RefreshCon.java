package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//working


public class RefreshCon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		//1st method
		driver.navigate().refresh();
		System.out.println("1st method : i am refresh");
		
		//2nd method
		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		System.out.println("2nd method : i am refresh");
		
		//3rd
		driver.get(driver.getCurrentUrl());
		System.out.println("3rd method : i am refresh");
        
		//4th
		driver.navigate().to(driver.getCurrentUrl());
		System.out.println("4th method : i am refresh");
		
	    //5th
		driver.findElement(By.id("email")).sendKeys("\ue035");
		System.out.println("5th method : i am refresh");
		
	}

}
