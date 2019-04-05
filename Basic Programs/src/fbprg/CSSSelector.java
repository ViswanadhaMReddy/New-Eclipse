package fbprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CSSSelector {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Chrome Driver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\Users\\lenovo\\Downloads\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		
		  

	}

}
