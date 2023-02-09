package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Tejovani");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("Tejovani@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("2564328951");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
