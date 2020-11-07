package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_85.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.xpedia.ca/");
        driver.manage().window().maximize();	
           driver.findElement(By.xpath("")).click();
       
         String month="September 2020";
         String exp_date="25";
	
         while(true)
         {
        	 String text=driver.findElement(By.xpath("")).getText();
        	 
        	 if(text.equals(month))
        	 {
        		 break;
             }
        	 else
        	 {
        		 driver.findElement(By.xpath("")).click();
        		 
        	 }
        	 
        	 
        	 
        	 
        		 
        	 
        	 }         
         
         
         
         
         
         
	
	
	
	
	}

}
