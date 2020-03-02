package advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 

		//move back to home page after link is clicked
		driver.navigate().to("http://leafground.com/pages/Link.html");
		WebElement homelink=driver.findElement(By.partialLinkText("Home Page"));
		homelink.click();
		driver.navigate().back();

		//secondlink where it is going

		WebElement secondlink=driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String where=secondlink.getAttribute("href");
		System.out.println("this link is going to"+where);
		Thread.sleep(3000);

		//find is a broken link
		WebElement broken=driver.findElement(By.partialLinkText("Verify am"));
		broken.click();
		String title=driver.getTitle();
		if(title.contains("404")){
			System.out.println("it is broken link");
		}
		else {
			System.out.println("it is not an broken image");
		}
		driver.navigate().back();

		//to click the home button link
		WebElement homelink2=driver.findElement(By.partialLinkText("Home Page"));
		homelink2.click();
		driver.navigate().back();

		//to find the no of links
		List<WebElement>nooflinks=driver.findElements(By.tagName("a"));
		int countlinks=nooflinks.size();
		System.out.println(countlinks);





	}

}
