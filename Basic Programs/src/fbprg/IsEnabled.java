package fbprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement SObj= driver.findElement(By.name("websubmit"));
		
//		Attribute value of SignIn
		
		System.out.println("Name of Attribute Value:"+SObj.getAttribute("name"));
		
//		Visible Text of SingIn 
		
		System.out.println("Name of Visible Text:"+SObj.getText());
		
//		Click Button
		if (SObj.isEnabled())
		{
			System.out.println("Object is Enabled");
			SObj.click();
		}
		else
			System.out.println("Object is not Enabled");
	}
		
		
		
	}
	
	


