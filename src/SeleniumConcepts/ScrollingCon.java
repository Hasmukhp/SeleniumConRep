package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingCon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();//lunch chrome 
		
        driver.manage().window().maximize();//maximize window
        
        driver.manage().deleteAllCookies();//delete all cookies
        
       driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
       
       JavascriptExecutor js =(JavascriptExecutor)driver;
 
        //1.Scrolling by using Pixel
       //js.executeScript("Window ,scrollBy(0,1000)","");     
	
       //2>Scrolling till the element is not found
      // WebElement flag=driver.findElement(By.xpath("//table[1]//tbody[1]//tr[86]//td[1]//img[1]"));
      // js.executeScript("arguments[0].scrollIntoView();", flag);
       
       //3>Scroll page till bottom
         js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       
       
       
       
	
	
	
	}

}
