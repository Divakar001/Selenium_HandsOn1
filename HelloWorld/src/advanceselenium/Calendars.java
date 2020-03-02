package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		WebElement calendar=driver.findElement(By.id("datepicker"));
		//1st method by sendkeys
		//calendar.sendKeys("02/10/2020"+Keys.ENTER);

		//2nd method by cliking date and month
		calendar.click();
		WebElement month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
		month.click();
		WebElement date=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[3]/a"));
		date.click();



	}

}