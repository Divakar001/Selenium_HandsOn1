package advanceselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/download.html");

		WebElement download=driver.findElement(By.linkText("Download Excel"));
		download.click();
		

		Thread.sleep(5000);

		File Filelocation=new File("C:\\Users\\Divakar\\Downloads");
		File[] totalfiles=Filelocation.listFiles();
		for (File file : totalfiles) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("file is downloaded1");
				break;
			}

		}

	}
}
