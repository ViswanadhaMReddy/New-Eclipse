package fbprg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class getoptions {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://spicejet.com/");
		driver.manage().window().maximize();
		
		/*Select CurObj = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		List<WebElement> Options=  CurObj.getOptions();
		
		System.out.println("Number of Values are:"+Options.size());
		
		for(WebElement options:Options)
			
		{
			System.out.println(options.getText());
		}
	}
}*/
	
		driver.get("https://www.facebook.com/");
		Select monObj = new Select(driver.findElement(By.name("birthday_month")));
		String Month = monObj.getFirstSelectedOption().getText();
		
		if (Month.equals("Mar"))
		{
			System.out.println("Mar-March month already selected");
		}
		else
		{
			monObj.selectByVisibleText("Mar");
			System.out.println("March-March month already selected by WD");
		}
		}
		
}
		
		

	


