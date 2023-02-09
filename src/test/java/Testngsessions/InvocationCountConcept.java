package Testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10)
	public void createuserTest() {
		System.out.println("create user test");


	}
	
}
