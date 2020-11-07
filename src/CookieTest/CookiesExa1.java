package CookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExa1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
     Set<Cookie> cookies= driver.manage().getCookies(); //capture all cookies form browser
       cookies.size();
       System.out.println("Size of  cookies:"+cookies.size()); //Print size of cookies
   /* for (Cookie cookie:cookies)//read and print all cookies
    {
     System.out.println (cookie.getName()+":"+cookie.getValue()); 
    }  
  */
    //System.out.println(driver.manage().getCookieNamed("session-id-time"));   //Specific cookie according to name
    
    //   Add Cookies
   Cookie cobj=new Cookie("my cookies1" ,"3434343HKHKJH11" );        
    driver.manage().addCookie(cobj);           
       cookies= driver.manage().getCookies();
       System.out.println("Size of  cookies:"+cookies.size());
       
       for (Cookie cookie:cookies)//read and print all cookies
       {
        System.out.println (cookie.getName()+":"+cookie.getValue()); 
       }  
      
    //Delete cookies >>Only this delete cookies is not working
             
    /*   driver.manage().deleteCookie(cobj);           
       cookies=driver.manage().getCookies();
          System.out.println("Size of  cookies:"+cookies.size());
          
          for (Cookie cookie:cookies)//read and print all cookies
          {
           System.out.println (cookie.getName()+":"+cookie.getValue()); 
          }  
     */     
       
    //Delete AllCookies
    /*       driver.manage().deleteAllCookies();
          cookies=driver.manage().getCookies();
         System.out.println("Size of  cookies:"+cookies.size());
          
      */
          
          
     driver.quit();
	
	}

}


/*
capture given below 
1>Capture all the cookies
2>get the size of the cookies
3>printed cookies name and their values
4>printed cookies base on name
5>Add cookie to the browser
6>delete specific cookies
7>delete all cookies

 */



