package fbprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditorTextbox {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password= driver.findElement(By.id("password"));
		
		username.clear();
		username.sendKeys("InsightQ");
		password.clear();
		password.sendKeys("mercury");
		
		WebElement signIn = driver.findElement(By.name("Login"));
		WebElement Radio = driver.findElement(By.id("rememberUn"));
		
		Radio.click();
		signIn.click();
		
		

	}

}
