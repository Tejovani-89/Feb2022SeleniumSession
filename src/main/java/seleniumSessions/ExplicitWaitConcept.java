package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By name = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phnnumbr = By.id("Form_submitForm_Contact");
		
		waitForElementPresent(name, 10).sendKeys("Tejovani");
		waitForElementPresent(email, 5).sendKeys("tejovani@gmail.com");
		getElement(phnnumbr).sendKeys("9234562345");
		
		//Imp interview pt of view
		//An expectation for checking that an element is present on the DOM of a page. 
		//This does not necessarily mean that the element is visible.
		
		/**
		 * An expectation for checking that an element is present on the DOM of a page and visible.
		 * Visibility means that the element is not only displayed 
		 * but also has a height and width that isgreater than 0.
		 */
		
//		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
//		
//		WebElement name_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
//		name_ele.sendKeys("Tejovani");
//		
//		driver.findElement(email).sendKeys("tejovani@gmail.com");
//		driver.findElement(phnnumbr).sendKeys("95846327185");
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresent(By locator , int timeout) {
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(timeout));
		
		return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForElementvisible(By locator , int timeout) {
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(timeout));
		
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
