package fbprg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
//		 boolean myStatus =false;
		 
		 List<WebElement>links=driver.findElements(By.tagName("a"));
		 System.out.println("Number of Links:"+links.size());
		 
//		 To read the each Link set
		 for (WebElement link:links)
		 {
			 String mylink=link.getText();
			 if (mylink.equals("CONTACT"))
			 {
				 link.click();
//				 myStatus = true;
				 System.out.println("Required link is exit in page");
			 }
			 break;
		 }
	
//	if (myStatus==false)
			{
		System.out.println("Specified link doesnt exit");
			}
				
				 
				 
			 }
				 
		 
		 

	}


