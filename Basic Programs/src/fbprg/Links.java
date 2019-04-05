package fbprg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println("Number of Links:"+links.size());
		
//		To read Link text
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		
		
	}
	

}
