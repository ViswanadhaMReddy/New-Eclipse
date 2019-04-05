package fbprg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class windowhandle {

	WebDriver driver;
	
	@BeforeMethod
	
	public void openBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/Downloads/Selenium Chrome Driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();
	}
	
	
	
	
}


