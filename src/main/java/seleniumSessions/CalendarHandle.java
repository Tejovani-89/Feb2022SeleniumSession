package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 
		 driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		 
		 driver.findElement(By.id("datepicker")).click();
		 
		 selectFuturenumbr("February 2023" , "30");
		
	}

	public static void selectFuturenumbr(String expctedmonthyr , String date) {
		if(expctedmonthyr.contains("February") && Integer.parseInt(date)>29) {
			System.out.println("Wrong date passed....Please pass the right day/date..." +date);
			return;
		}
		
		if(Integer.parseInt(date)>31) {
			System.out.println("Wrong date passed....Please pass the right day/date..." +date);
			return;
		}
		
		String actulmonthyear =  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		 System.out.println(actulmonthyear);
		 
		 while(!actulmonthyear.equalsIgnoreCase(expctedmonthyr)) {
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 actulmonthyear =  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		 }

		 selectDate(date);
		
	}
	
	public static void selectDate(String date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
	
	
}
