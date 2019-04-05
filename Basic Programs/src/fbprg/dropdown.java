package fbprg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdown {

	public static void main(String[] args) {
	
//		Auto suggested  dropdown 
		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();  
		
		/*driver.findElement(By.id("fromPlaceName")).sendKeys("Hyd");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HYDERABAD MGBS")).click();*/

		driver.get("https://spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Goa (GOI)")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	}

}
