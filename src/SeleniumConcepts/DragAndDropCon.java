package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCon {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
        driver.get("https://jqueryui.com/droppable/");	
        Thread.sleep(3000);
             driver.switchTo().frame(0);//when frame is available then use this otherwise no need
             
             Actions action=new Actions(driver);
             action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
             .moveToElement(driver.findElement(By.xpath(" //div[@id='droppable']")))
             .release().build().perform(); 
	     System.out.println("drag and drop working ok");
	
	
	driver.quit();
	
	}

}
