package fbprg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
//	Find number of radio buttons
	
	List<WebElement>Radios=driver.findElements(By.className("_58mt"));
	System.out.println("Number of RadioButtons are:"+Radios.size());
	
	for(WebElement radio:Radios)
	{
		System.out.println(radio.getText());
		radio.click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
	
	}
	}
}

	
	


