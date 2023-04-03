package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {

	@Test
	public void demo1() {
		SoftAssert soft = new SoftAssert();
		String s1 = "Hello";
		String s2 = "World";
		
		soft.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Assertion failed");
		soft.assertAll();
	}
	
	@Test
	public void demo2() {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1);
		System.out.println(s2);
	}
}
