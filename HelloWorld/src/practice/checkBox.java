package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//chech the java box
		WebElement check1=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		check1.click();
		//check the selenium is selected or not
		WebElement check2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		Boolean status=check2.isSelected();
		System.out.println(status);
		
		WebElement check3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		WebElement check4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(check3.isSelected()) {
			check3.click();
		}
		if(check4.isSelected()){
			check4.click();
		}
		}
					
					
					}

