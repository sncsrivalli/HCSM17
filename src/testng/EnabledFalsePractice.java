package testng;

import org.testng.annotations.Test;

public class EnabledFalsePractice {

	@Test
	public void test0() {
		System.out.println("test0");
	}
	
	@Test(enabled = false)
	public void test1() {
		System.out.println("test1");
	}
}
