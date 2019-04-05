package fbprg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jscriptExecutor {
	 
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	First Method
	 JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("document.getElementById('username').value='InsightQ';");
	js.executeScript("document.getElementById('rememberUn').click()");
	
//	Second Method
	WebElement ele = driver.findElement(By.id("username"));
	js.executeScript("arguments[0].value='InsightQ';",ele);
	
//	js.executeScript("scroll(0,2000)");
//	WebElement username =driver.findElement(By.id("username"));
//	js.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'')", username);

	
//	second Method to to send text with out using sendkeys method
	
	
	}

}
