package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotationhierachy1 {
	  @Test
	  public void test() {
		  System.out.println("im a test");
		  
	  }
	  
	  @Test
	  public void test2() {
		  System.out.println("im a test2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("im a before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("im a after method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("im a before class");
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("im a after class");
		  
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("im a before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("im a after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("im a before suite");
	  
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("im a after suite");
	  }
	  
	
	
	
}
