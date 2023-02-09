package Testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	
	@Test
	public void homePageTest() {
		System.out.println("hp Test");
		int i = 9/0;
	}
	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println("search Test");
		
	}
	@Test(dependsOnMethods = "homePageTest")
	public void addToCartTest() {
		System.out.println("Add to cart Test");
		
	}

}
