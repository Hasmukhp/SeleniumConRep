package robotapiconept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotApiCon {

	public static void main(String[] args) throws AWTException ,InterruptedException 
{

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wisdomaxis.com/technology/software/data/for-reports/");
		//driver.findElement(By.xpath("//body[@id='home']/div[@class='grid_4']/a[1]")).click();
		  driver.findElement(By.xpath("//div[@class='grid_4']//a[2]")).click();              
		Thread.sleep(4000);
		
		Robot robot=new Robot();
		
 // robot.keyPress(KeyEvent.VK_DOWN);  //when u want to open the excel file then do not user this line
 //Thread.sleep(3000);
  
 robot.keyPress(KeyEvent.VK_TAB);
  Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_TAB);
  Thread.sleep(3000);
  
  robot.keyPress(KeyEvent.VK_TAB);
  Thread.sleep(3000);
  
  robot.keyPress(KeyEvent.VK_ENTER);//Enter key
  Thread.sleep(10000);
    
   driver.close();

}

}
