package advanceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/autoComplete.html");
        //sendkey for search
		WebElement Autocomplete=driver.findElement(By.id("tags"));
		Autocomplete.sendKeys("s");
		Thread.sleep(4000);

		//to get the no of elements listed
		List<WebElement>completeoptions=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		int options=completeoptions.size();
		System.out.println(options);	

		
		//to select the element SOAP
		for (WebElement webElement : completeoptions) {
			if(webElement.getText().equals("SOAP")) {
				webElement.click();
				break;
			}

		}



	}

}
