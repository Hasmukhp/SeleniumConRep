package elementhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//This script is workign  ok
public class EditBoxCon {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		
     /*   driver.manage().window().maximize();
        driver.manage().deleteAllCookies();	
		*/
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@id='u_0_2']")).click();//click on create new account 
	Thread.sleep(3000);

	 driver.findElement(By.name("firstname")).sendKeys("Hari");
	 driver.findElement(By.name("lastname")).sendKeys("Yadav");
	 driver.findElement(By.name("reg_email__")).sendKeys("hariyadav@noeamil.com.auu"); 
	 driver.findElement(By.name("reg_passwd__")).sendKeys("Har@noeamil");
	// driver.findElement(By.name("websubmit")).click();
	 
	 
	 WebElement firstName=driver.findElement(By.name("firstname"));
	 Thread.sleep(3000);

	 
	 System.out.println(firstName.getAttribute("value"));
	 System.out.println(firstName.getText());
	 System.out.println(firstName.isEnabled());
     firstName.clear();
     Thread.sleep(3000);
 
     
     System.out.println(firstName.getAttribute("value"));
	 System.out.println(firstName.getText());
     
    driver.quit();
	
	
	}
     
}
