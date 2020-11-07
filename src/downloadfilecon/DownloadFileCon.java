package downloadfilecon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileCon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://demo.automationtesting.in/FileDownload.html");
    	
    	    driver.findElement(By.id("textbox")).sendKeys("This is the first file for Download");
    	    driver.findElement(By.id("createTxt")).click();
    	    driver.findElement(By.id("link-to-download")).click();
 
    	    driver.findElement(By.id("pdfbox")).sendKeys("This is the Pdf file for Download");
    	    driver.findElement(By.id("createPdf")).click();
    	    driver.findElement(By.id("pdf-link-to-download")).click();
	
	           //driver.quit();
	
	}

}
