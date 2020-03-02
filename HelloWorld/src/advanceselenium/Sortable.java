package advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		
		
		List<WebElement> sort1=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		WebElement firstelement=sort1.get(6);
		WebElement firstelement2=sort1.get(0);
		
		
		Actions Act=new Actions(driver);
		Act.clickAndHold(firstelement);
		Act.moveToElement(firstelement2);
		Act.release(firstelement2);
		Act.build().perform();
		
		
	
	
	}

}
