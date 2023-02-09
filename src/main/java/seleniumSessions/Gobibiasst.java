package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gobibiasst {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			 
			 driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491619965162!e!goibibo!c!&gclid=Cj0KCQjwvqeUBhCBARIsAOdt45bj-Pwtvfm78pi-7B89pPfbsjqnAZATtns3D_dCAGVHyndEyB2fcHwaAheFEALw_wcB");
			 
			 driver.findElement(By.xpath("(//div[@class='sc-bkkeKt gAqCbJ fswFld '])[last()-2]")).click();
			 expctedmnthyr("august 2022" , "34");
			
			 
			 
	}

		public static void expctedmnthyr(String exptdmnthyr , String date) {
			
			if(exptdmnthyr.contains("February") && Integer.parseInt(date)>29) {
				System.out.println("Wrong date passed....Please pass the right day/date..." +date);
			return;
			}
			
			if(Integer.parseInt(date)>31) {
				System.out.println("Wrong date passed....Please pass the right day/date..." +date);
				return;
			}
			
			
			 String actmonth = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
			 System.out.println(actmonth);
			 
			 while(!actmonth.equalsIgnoreCase(exptdmnthyr)) {
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				  actmonth = driver.findElement(By.cssSelector("div.DayPicker-Caption")).getText();
				 
			 }
			 selectDate(date);
			
			
			
		}
		
	public static void selectDate(String datenum) {
		driver.findElement(By.xpath("//p[text()='"+datenum+"']")).click();
		
	}
		
}
