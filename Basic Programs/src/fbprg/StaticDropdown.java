package fbprg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Select monthObj= new Select(driver.findElement(By.id("month")));
		
		monthObj.selectByIndex(4);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		monthObj.selectByVisibleText("Mar");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		monthObj.selectByValue("11");
		
		
		

	}

}
