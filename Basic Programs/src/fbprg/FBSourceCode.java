package fbprg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBSourceCode {

	public static void main(String[] args) {
		
//		To launch the browser 
		
		WebDriver driver = new FirefoxDriver();
		
//		To open the Web file 
		
		driver.get("https://www.facebook.com/");
		
//		To maximize the window
		
		driver.manage().window().maximize();
		
//		To read page source code 
		
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		
		

	}

}
