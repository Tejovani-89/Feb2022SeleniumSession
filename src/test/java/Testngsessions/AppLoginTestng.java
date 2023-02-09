package Testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTestng {
WebDriver driver;
	
   @BeforeTest
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
   
   @Test
   public void headerTest() {
	 Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Your Store']")).isDisplayed());
	   
   }
   @Test
   public void custmrheaderTest() {
	 Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='New Customer']")).isDisplayed());
	   
   }
 
   @Test
   public void registerTest() {
	 Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
	   
   }
   @Test
   public void forgotpswdTest() {
	 Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	   
   }
   @AfterTest
   public void tearDown() {
	   driver.close();
	   
   }
	
	
}
