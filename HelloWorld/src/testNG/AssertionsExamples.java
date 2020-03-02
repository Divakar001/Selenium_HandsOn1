package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExamples {
	@Test
	public void checkequal() {
		
	
	String name= "divakar";
	Assert.assertEquals(name, "divakar");
}
}