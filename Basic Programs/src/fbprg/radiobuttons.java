package fbprg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	    List<WebElement>radio=driver.findElements(By.xpath("//font[contains(text(),'Preferences')]"));
	    System.out.println("Number of radioButton:"+radio.size());
	    
	    for (WebElement radios:radio)
	    {
	    
		System.out.println(radios.getText());
	}

}
}
