package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import listnerDemo.ActivityCapture;

public class listnerDemo {

	public static void main(String[] args) {

		System.out.println("Started");
		
		System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		EventFiringWebDriver e1 = new EventFiringWebDriver(driver);
		ActivityCapture handle = new ActivityCapture();
		e1.register(handle);
		e1.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		e1.findElement(By.id("identifierId")).sendKeys("asdf");
		e1.findElement(By.xpath("//span[text()='Next']")).click();
		e1.quit();
		e1.unregister(handle);
		System.out.println("End");
		
	

	}

}
