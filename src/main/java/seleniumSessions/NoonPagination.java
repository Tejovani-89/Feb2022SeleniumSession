package seleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoonPagination {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		
		driver.findElement(By.xpath("//div[@class='swiper-button-next custom-navigation']")).click();
//		if(crousel.getAttribute("class").contains("disabled")) {
//			System.out.println("Pagination is over");
//		}

	}

//	public static void  {
//		WebElement ele = driver.findElement(By.xpath("//td[text()='"+cityName+"']"));
//		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();
//		
	
}
