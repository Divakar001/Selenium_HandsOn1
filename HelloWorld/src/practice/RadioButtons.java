package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/radio.html");
		WebElement radio1=driver.findElement(By.id("no"));
		radio1.click();
		//is selected or not
		WebElement radio2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement radio3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		Boolean status1=radio2.isSelected();
		Boolean status2=radio3.isSelected();
		System.out.println(status1);
		System.out.println(status2);
	}

}
