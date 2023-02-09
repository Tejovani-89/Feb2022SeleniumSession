package Testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTestWithBM {
	WebDriver driver;
	
	   @BeforeMethod
		public void setUp(){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/index.php?route=account/login");
				
		}
	   
	   @Test
	   public void titleTest() {
		   String title = driver.getTitle();
		   System.out.println("Page title is :" + title);
		  Assert.assertEquals(title, "Account Login");
	   }
	   
	   @Test
	   public void urlTest() {
		   String url = driver.getCurrentUrl();
		   System.out.println("Page url is :" + url);
		   Assert.assertTrue(url.contains("route=account/login"));
	   }
	   
	  
	   @AfterMethod
	   public void tearDown() {
		   driver.close();
		   
	   }
		
	
	
	
}
