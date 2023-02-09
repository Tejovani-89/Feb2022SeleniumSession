package Testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name = "Naveen";
	@Test(priority=1,expectedExceptions= {NullPointerException.class , ArithmeticException.class})
	public void searchProductTest() {
		System.out.println("mackbook");
		int i = 9/0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name);

	}

//	@Test(expectedExceptions = Exception.class)    here all tests will be passed its a hack during demo we can write like this
//	public void testingtest() {
//		
//	}
}
