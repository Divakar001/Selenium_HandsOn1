package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Image.html");
		//WebElement firstimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		//firstimage.click();


		WebElement brokenimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));		

		//naturalWidth=0 is broken image
		if(brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("image is a broken image");
		}
		else{
			System.out.println("image is not broken");
		}

	}


}


