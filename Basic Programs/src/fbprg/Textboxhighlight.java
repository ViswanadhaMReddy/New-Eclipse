package fbprg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxhighlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
    driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	First Method
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebElement email =driver.findElement(By.id("username"));
	js.executeScript("arguments[0].setAttribute('style','background:Yellow;border:2pxdashred;');",email);
	}

}
