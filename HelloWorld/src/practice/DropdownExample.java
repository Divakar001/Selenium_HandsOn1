package practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropindex=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropindex);
		//select by index
		select.selectByIndex(4);
		Thread.sleep(3000);
		//select by value
		select.selectByValue("3");
		Thread.sleep(3000);
		//select by visible text
		select.selectByVisibleText("Appium");
		//get options
       List<WebElement> listofoptions= select.getOptions();
       int options=listofoptions.size();
       System.out.println(options);
       //select by sendkeys
       dropindex.sendKeys("Loadrunner");
       
       //multiselect the options
       WebElement multiselect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
       Select multisel=new Select(multiselect);
       multisel.selectByIndex(1);
       multisel.selectByIndex(2);
       multisel.selectByIndex(3);

	}

}
