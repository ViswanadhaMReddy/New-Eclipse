package fbprg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
//		To read Particular cell data 
		
		/*String cellData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
		System.out.println(cellData);*/
		
//     To read Cell data from the Webtable 
		
		/*WebElement WTable = driver.findElement(By.id("customers"));
		List<WebElement>tds=WTable.findElements(By.tagName("td"));
		System.out.println("Number of celldata:"+tds.size());
		
		for (WebElement td:tds)
		{
			System.out.println(td.getText());
		}*/
		
//	To read No of rows and No of celldata and read all celldata from table 	
		
		WebElement Wtable = driver.findElement(By.id("customers"));
		List<WebElement>trs=Wtable.findElements(By.tagName("tr"));
		System.out.println("Number of rows:"+trs.size());
		for (WebElement tr:trs)
		{
		System.out.println("*******************");
		List<WebElement>tds=tr.findElements(By.tagName("td"));
	    System.out.println("Number of celldata columns:"+tds.size());
		for(WebElement td:tds)
		System.out.println(td.getText());
		}
		
	}

}
