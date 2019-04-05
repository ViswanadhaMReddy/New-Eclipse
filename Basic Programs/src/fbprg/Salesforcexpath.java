package fbprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Salesforcexpath {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("InsightQ");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        }

}
