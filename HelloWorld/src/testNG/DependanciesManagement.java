package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	//admit a student in engineering
	//dependson methods
	
	
	@Test(enabled=true)
	public void secondaryschool() {
		System.out.println("secondary scholl passed");
	}
	
	
	
	
	@Test(dependsOnMethods = "secondaryschool")
	public void highschool() {
		System.out.println("high scholl passed");
	}
	
	
	@Test(dependsOnMethods = "highschool")
	public void engineering() {
		System.out.println("Engineer");
	}



}
