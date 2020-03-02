package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Alert.html");
		//alert ok
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
        alertbox.click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        
        //alert ok or dismiss(confirm button) 
        WebElement alertbox2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
        alertbox2.click();
        Thread.sleep(3000);
        Alert alert2=driver.switchTo().alert();
        alert2.dismiss();
		
		
		//send key and accept(Prompt box)
		WebElement alertbox3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		alertbox3.click();
		Thread.sleep(3000);
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("hai");
		alert3.accept();
		
		
		
        
	}

}
