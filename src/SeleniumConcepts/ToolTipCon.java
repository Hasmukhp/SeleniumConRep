package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Not working 

public class ToolTipCon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/tooltip/");
		//Thread.sleep(5000);
		
		String expectedtitle="We ask for your age only for statistical purposes.";   // You hovered over the text field
		WebElement hoverForTooltip=driver.findElement(By.id("age"));
				String actualtitle=hoverForTooltip.getAttribute("title");
		//
		//xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"))	
		System.out.println(actualtitle);
		 
		  if(actualtitle.matches(expectedtitle))
		  {
			 System.out.println( "Tool tip is passed");
		  }
		  else
		  {
			  System.out.println(" tooltip is Fail");  
		  }	  
		//Thread.sleep(5000);
		driver.close();
	}

}
