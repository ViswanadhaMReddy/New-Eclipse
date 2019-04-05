package fbprg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsescrollBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.rediff.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("window.scrollBy(0,8000)");
	    
	
	}
         
}
