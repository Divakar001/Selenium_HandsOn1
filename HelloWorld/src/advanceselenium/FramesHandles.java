package advanceselenium;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/frame.html");
		
		
		//click the button and get text which is inside the frames
		driver.switchTo().frame(0);
        WebElement button1=driver.findElement(By.id("click"));
        button1.click();
        String buttontext=button1.getText();
        System.out.println(buttontext);
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        
        
        //click button in the second frame
       
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement button2=driver.findElement(By.id("click1"));
        button2.click();
        
        //find the number of frames
        driver.switchTo().defaultContent();
        java.util.List<WebElement> noofframes= driver.findElements(By.tagName("iframe"));
        int framesnumber=noofframes.size();
        System.out.println(framesnumber);
       
}
	}




