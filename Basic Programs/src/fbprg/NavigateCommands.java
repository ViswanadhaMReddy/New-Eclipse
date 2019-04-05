package fbprg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.get("http://www.tupaki.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.quit();
		

	}

}
