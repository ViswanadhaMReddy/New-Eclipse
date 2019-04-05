package fbprg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.lift.find.PageTitleFinder;

public class JSE2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,8000)");
		
		 driver.findElement(By.xpath("//a[contains(text(),'Terms of use')]")).click();
		 
		
	} 

}
