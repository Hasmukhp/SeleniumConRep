package elementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

// Not working


public class AutoSuggrdionCon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		  driver.findElement(By.name("q")).sendKeys("Selenium");
			Thread.sleep(3000);
			
	  List<WebElement> list=driver.findElements(By.xpath("/html/body/div[4]/div[3]/div/div[2]/a[1]"));	
	  ////*[@id="realbox-matches"]/a[8]
	  //  //*[@id="realbox-matches"]
	  for(int i=0;i<list.size();i++)
	  {
		  System.out.println(list.get(i).getText());
	/*	  String searchText=list.get(i).getText();
		  
		  if(searchText.equals("selenium ide"))
		   {
			list.get(i).click();
			break;
			   
		   }
	*/
	  }
	 // driver.close();
	  
	  
	  
	}
}
