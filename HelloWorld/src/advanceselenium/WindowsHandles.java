package advanceselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Window.html");
		//for old window
		
		String oldwindow=driver.getWindowHandle();
		WebElement firstbutton=driver.findElement(By.id("home"));
		firstbutton.click();
		
		//access of new opened window
		
		Set<String> handles=driver.getWindowHandles();
		
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
			}
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editbox.click();
		
		driver.close();
		
		//move to default window
		driver.switchTo().window(oldwindow);
		
		//to find the no of newly opened windows
		WebElement secondbutton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		secondbutton.click();
		int noofwindows=driver.getWindowHandles().size();
		System.out.println(noofwindows);
		
		//to close opened window
		WebElement thirdbutton=driver.findElement(By.id("color"));	
		thirdbutton.click();
		Set<String> newwindowhandles=driver.getWindowHandles();
		for (String allwindow : newwindowhandles) {
			if(!allwindow.equals(oldwindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
				
			}
			
		}


	}

}
