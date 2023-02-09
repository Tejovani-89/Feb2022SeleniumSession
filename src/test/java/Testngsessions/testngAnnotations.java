package Testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngAnnotations {
	
	@BeforeSuite
	public void connectwithDB(){
		System.out.println("BS----connect with DB");
		
	}
	
	@BeforeTest
	public void createUser(){
		System.out.println("BT----connect with DB");
		
	}

	@BeforeClass
	public void launchBrowser(){
		System.out.println("BC----connect with DB");
		
	}
	@BeforeMethod
	public void loginToApp(){
		System.out.println("BM----connect with DB");
		
	}
	@Test
	public void homePageTitleTest(){
		System.out.println("hp----title test");
		
	}
	
	@Test
	public void homePageUrlTest(){
		System.out.println("hp----url test");
		
	}
	@Test
	public void isUserLoggedInTest(){
		System.out.println("user loggedin test");
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM user is logged out");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- close browser");
	}
	@AfterTest
	public void deleteuser() {
		System.out.println("AT-- delete user");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS-- disconnectDB");
	}
}
