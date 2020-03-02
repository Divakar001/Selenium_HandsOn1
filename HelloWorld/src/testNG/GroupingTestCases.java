package testNG;

import org.testng.annotations.Test;

public class GroupingTestCases {


	/*
	 * Scenario: a big basket is having a different kind of mobiles.
	 * let us say there are oneplus, apple, redmi, samsung.
	 * I want to run test only for oneplus, redmi. write program for that.
	 */
	@Test(groups = {"oneplus"})
	public void oneplus1() {
		System.out.println("oneplus testing");
	}
	@Test(groups= {"oneplus"})
	public void onuplus2() {
		System.out.println("oneplus testing");

	}
	@Test(groups= {"redmi"})
	public void redmi1() {
		System.out.println("redmi testing");
	}
	@Test(groups= {"redmi"})
	public void redmi2() {
		System.out.println("redmi testing");
	}
	@Test(groups= {"apple"})
	public void apple1() {
		System.out.println("apple testing");
	}
	@Test(groups= {"apple"})
	public void apple2() {
		System.out.println("apple testing");
	}
	@Test(groups= {"samsung"})
	public void samsung1() {
		System.out.println("samsung testing");
	}
	@Test(groups= {"samsung"})
	public void samsung2() {
		System.out.println("samsung testing");
	}


}