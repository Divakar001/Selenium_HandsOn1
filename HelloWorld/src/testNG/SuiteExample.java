package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	//	aim to
	//	1.open google
	//	2.open bing
	//	3.open yahoo
	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeSuite
	public void launchbrowser(){
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver(); 

	}
	@Test
	public void opengoogle() {
		driver.get("http://google.com");
	}
	@Test
	public void openbing() {
		driver.get("http://bing.com");
	}
	@Test
	public void openyahoo() {
		driver.get("http://yahoo.com");
	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime=System.currentTimeMillis();
		totaltime=endtime-starttime;
		System.out.println(totaltime);

	}


}
