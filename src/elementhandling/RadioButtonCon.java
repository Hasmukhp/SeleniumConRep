package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//This script is working ok

public class RadioButtonCon {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.xpath("//a[@id='u_0_2']")).click();//click on create new account 
    	Thread.sleep(3000);
        
    	//   driver.findElement(By.xpath("//input[@name='sex' and  @value ='1']")).click(); // or user this >>//input[@name='sex' and  @value ='1']
    	 //  driver.findElement(By.xpath("//input[@name='sex' and  @value ='2']")).click();
    	      driver.findElement(By.xpath("//input[@name='sex' and  @value ='-1']")).click();
    	      driver.findElement(By.xpath("//option[contains(text(),'She: \"Wish her a happy birthday!\"')]")).click();
    	      driver.findElement(By.name("custom_gender")).sendKeys("Male");
	  
	              System.out.println(driver.findElement(By.xpath("//input[@name='sex' and  @value ='1']")).isSelected());
	              System.out.println(driver.findElement(By.xpath("//input[@name='sex' and  @value ='2']")).isSelected());
	              System.out.println( driver.findElement(By.xpath("//input[@name='sex' and  @value ='-1']")).isSelected());
	             	Thread.sleep(2000);
	             	driver.quit();
	}

}
