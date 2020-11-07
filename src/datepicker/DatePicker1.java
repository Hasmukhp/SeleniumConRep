package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String month="September 2020";
		
		int actudday=20;
		int  day =actudday+2; 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://www.phptravels.net");
		Thread.sleep(3000);
       
		//input[@id='checkin']
	driver.findElement(By.xpath(" //input[@id='checkin']")).click();
	Thread.sleep(3000);
	
	while(true) 
	{
//capture the text september,2020
String text=driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).getText();
Thread.sleep(3000);
	if(text.equals(month))
	{
		break;
	}
	else
	{
		//click on right side arrow xapth clicking
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div["+day+"]")).click();
		//[contains(text(),"+day+")]
	}
	
	}
	}
}
