package fbprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement gSearch=driver.findElement(By.xpath("//input[@title='Search']"));
		
		act.moveToElement(gSearch).contextClick().build().perform();
			}

	

}
