package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Test
	@Parameters("names")
	public void printName(String name) {
		System.out.println("name is"+ name);
	}

}
