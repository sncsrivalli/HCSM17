package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void demo1() {
		String s1 = "Hello";
		String s2 = "World";
		
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Assertion failed");
	}
	
	@Test
	public void demo2() {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1);
		System.out.println(s2);
	}
}
