package testng;

import org.testng.annotations.Test;

public class PriorityInvocationCountPractice {

	@Test(invocationCount = 2, priority = -1)
	public void test0() {
		System.out.println("test0");
	}
	
	@Test(priority = 2)
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(invocationCount = 3 , priority = 1)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(invocationCount = 0, priority = 1)
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(invocationCount = 4, priority = 3)
	public void test4() {
		System.out.println("test4");
	}
}
