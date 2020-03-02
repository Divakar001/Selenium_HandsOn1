package advanceselenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divakar\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/table.html");

		//to find the no of columns
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columncount=columns.size();
		System.out.println("No. of columns:"+columncount);

		//finding the no of rows count
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowscount=rows.size();
		System.out.println("No. of rows:"+rowscount);

		//get the progress value of learn to interact with elements

		WebElement getpercent=driver.findElement
				(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent=getpercent.getText();
		System.out.println("Percentage is :"+percent);

		
		
		//to select the least percentage 
		List<WebElement> values=driver.findElements(By.xpath("//td[2]"));

		List<Integer> numberlist= new ArrayList<Integer>();

		for (WebElement webElement : values) {
			String percentagevalues1=webElement.getText().replaceAll("%", "");
			   //adding string to interger list
			numberlist.add(Integer.parseInt(percentagevalues1));
		
		}
		System.out.println("list of percentage values:"+numberlist);
		
		int smallvalue=Collections.min(numberlist);
		System.out.println("small value is:"+smallvalue);
		
		//click the least percentage value:

		String smallvaluestring=Integer.toString(smallvalue)+"%";
		
		//String finalxpath="//td[normalize-space()="+"\'"+smallvaluestring +"\'"+"]"+"//following::td[1]";
		//System.out.println(finalxpath);
		WebElement finalclick=driver.findElement(By.xpath("//*[@id=\'table_id\']/tbody/tr[4]/td[3]/input"));
		Actions act= new Actions(driver);
		act.moveToElement(finalclick).click().build().perform();
		

	}




}
