package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Button.html");
		
		//get the xy location
		WebElement getPositionbutton=driver.findElement(By.id("position"));
		Point xypoint=getPositionbutton.getLocation();
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("x value is "+xvalue+"y value is "+yvalue);
		
		//get the button colour
		
		WebElement buttoncolour=driver.findElement(By.id("color"));
		String color=buttoncolour.getCssValue("background-color");
		System.out.println(color);
		
		//get the size of button
		WebElement buttonsize=driver.findElement(By.id("size"));
		int height=buttonsize.getSize().getHeight();
		int width=buttonsize.getSize().getWidth();
		System.out.println("height of button is:"+height+"width of button is:"+width);
		
		//go to home
		driver.findElement(By.id("home")).click();
		driver.quit();
		
	
	}

}
