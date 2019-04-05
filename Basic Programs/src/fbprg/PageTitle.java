package fbprg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class PageTitle {

	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
        driver.get("http://newtours.demoaut.com/") ;    
        driver.manage().window().maximize();
        
//       step1= use getTitle()and store the value in string 
          String actualTitle = driver.getTitle();
          
//        step2 = declare expectedtitle is string 
          String expectedTitle = "Welcome: Mercury Tours";
        
//        Method 2 with assert command
//        Assert.assertEquals("Condition true", actualTitle, expectedTitle);
        
//         Method1 = If condition comapring expected and actual 
        if (actualTitle.equalsIgnoreCase(expectedTitle))
        System.out.println("pgTitle is matched");
        else
        System.out.println("pgTitle didnt matched");
        
        
        /*String pgurl= driver.getCurrentUrl();
        System.out.println(pgurl);
 */       
//        Close the window
        
        driver.close();
        
        
	}

}
