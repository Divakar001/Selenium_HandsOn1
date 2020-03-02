package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement Emailbox=driver.findElement(By.id("email"));
		Emailbox.sendKeys("Test@gmail.com");
		
		WebElement Appendbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Appendbox.sendKeys("test");
		
		WebElement gettext=driver.findElement(By.name("username"));
		String value=gettext.getAttribute("value");
		System.out.print(value);
		
		WebElement clear=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clear.clear();
		WebElement disabled=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enable=disabled.isEnabled();
		System.out.println(enable);
	
	}

}
