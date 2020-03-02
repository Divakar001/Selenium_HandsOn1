package advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/selectable.html");
		
		//to find no of selectable elements
		
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int count=selectable.size();
		System.out.println(count);
		
		//to select the first 3 elements
		
		/*Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();*/
		
		
		//method2
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(4));
		actions.build().perform();
		
		
		
	

	}

}
