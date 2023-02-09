package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest{
	
	
	@DataProvider
		public Object [] [] getLoginData() {
		
		//5rows and 2 columns 5*2 matrix
		return new Object [] [] {
			{"test12345@gmail.com" , "test@12345"},
			{"naveenanimation20@gmail.com" , "test@12121212"},
			{"test12345@.@.gmail.com" , "test@123412212"},
			{"  " , "     "},
			{"@$.%.@.@.gmail.com" , "test12212"},
			
			
		};
			
		}
	
	
	
	 
	   @Test(dataProvider = "getLoginData")
	   public void loginWithWrongDataTest(String username, String password) {
		   driver.get("https://demo.opencart.com/index.php?route=account/login");
		   
		   driver.findElement(By.id("input-email")).sendKeys(username);
		   driver.findElement(By.id("input-password")).sendKeys(password);
		   driver.findElement(By.xpath("//input[@value='Login']")).click();
		   String errrMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		   System.out.println(errrMsg);
		   Assert.assertTrue(errrMsg.contains("Warning: No match for E-Mail Address and/or Password"));
		   
	   }

}
