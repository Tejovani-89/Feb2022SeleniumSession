package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitleandUrl {
static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		driver.findElement(By.linkText("CONTACT SALES")).click();
//		String title = waitForTitleContains("Contact" , 5);
//		System.out.println(title);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.urlContains("contact-sales"));
		wait.until(ExpectedConditions.urlToBe("https://www.orangehrm.com/contact-sales/"));
		
		
		
		
	}
public static String waitForUrlContains(String urlFraction , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		return null;
		
	}
	
public static String waitForUrlIs(String urlvalue , int timeOut) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	if(wait.until(ExpectedConditions.titleIs(urlvalue))) {
		return driver.getCurrentUrl();
	}
	return null;
	
}

	
	public static String waitForTitleContains(String titleFraction , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		return null;
		
	}
public static String waitForTitleIs(String titlevalue , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleIs(titlevalue))) {
			return driver.getTitle();
		}
		return null;
		
	}
	
}
