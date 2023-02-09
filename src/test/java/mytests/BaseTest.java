package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	   @BeforeMethod
	   @Parameters({"browser","url" , "headless"})
		public void setUp(String browserName , String appURL , String headLess ){
		   
		   System.out.println("Browser Name is : " + browserName);
		   
		   if(browserName.equalsIgnoreCase("chrome")) {
			   WebDriverManager.chromedriver().setup();
			   ChromeOptions co = new ChromeOptions();
			   
			   if(Boolean.parseBoolean(headLess)) {
				   co.setHeadless(true);
			   }
				driver = new ChromeDriver(co);
		   }
		   else {
			   System.out.println("Pass the right browser name :" + browserName);
		   }
		   driver.get(appURL);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
				
		}
	   @AfterMethod
	   public void tearDown() {
		   driver.close();
		   
	   }
}
