package com.datadrivencon.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

//Do not use kiddatadrive,test utility AND COM.TEST DATA Pakage

/*
public class KidDataDrivenTest 

{
	WebDriver driver;
	
	
  @BeforeMethod
    public void setup()
    {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
  	   WebDriver driver=new ChromeDriver();
  	   driver.manage().window().maximize();
  	   driver.manage().deleteAllCookies();
  	   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
       driver.get("https://portal.qa.kidsxap.com.au/");
	   
    }
	
   @DataProvider
      public Iterator<Object[]> getTestData()
      {
	  ArrayList<Object[]>testData= TestUtil.getDataFromExcel();
	   return testData.iterator();
      }
  
  
  
  
 
  
  
	@Test(dataProvider="getTestData")
	 public void kidsPageTest(String firstName,String lastName,String dob,String email,
			 String cFirstName,String cLastName,String cDob,String paymentMethod)
	 {
		
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"dx-bcde8112-695a-1993-18d6-d448e3547e52\"]/div[1]/div/div[1]/div[2]/div[6]/div")));
		//select.selectByVisibleText();
		driver.findElement(By.xpath("//*[@id=\\\"txtAddFamilyFirstName\\\"]/div[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\\\"txtAddFamilyFirstName\\\"]/div[1]/div[1]/input")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//*[@id=\\\"txtAddFamilyLastName\\\"]/div[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\\\"txtAddFamilyLastName\\\"]/div[1]/div[1]/input")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//*[@id=\\\"dtAddFamilyDOB\\\"]/div/div/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\\\"dtAddFamilyDOB\\\"]/div/div/div[1]/input")).sendKeys(dob);
		
		driver.findElement(By.xpath("//*[@id=\\\"txtAddFamilyEmail\\\"]/div[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\\\"txtAddFamilyEmail\\\"]/div[1]/div[1]/input")).sendKeys(email);
		
		driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildFirstName']")).clear();
		driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildFirstName']")).sendKeys(cFirstName);
		
		driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildLastName']")).clear();
		driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildLastName']")).sendKeys(cLastName);
		
		driver.findElement(By.xpath("//*[@id=\\\"dtAddFamilyChildDOB\\\"]/div[1]/div/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\\\"dtAddFamilyChildDOB\\\"]/div[1]/div/div[1]/input")).sendKeys(cDob);
		
		driver.findElement(By.xpath("//div[contains(text(),'Direct To Centre')]")).clear();
		driver.findElement(By.xpath("//div[contains(text(),'Direct To Centre')]")).sendKeys(paymentMethod);
		
		
		
		
		
		
		
	 }
  
  
  
  
  @AfterMethod
	 public void tearDown()
	 {
		driver.quit();
	 }
	
	
	
	
	
	
}

*/