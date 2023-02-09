package mytests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {
	
	   
	   @Test(priority =  1)
	   public void googleTitleTest() {
		  
		   Assert.assertEquals(driver.getTitle(), "Google");
	   }
	   
	   //
	   @Test(priority = 2)
	   public void googleurlTest() {
		   Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	   }
	   
	   
}
