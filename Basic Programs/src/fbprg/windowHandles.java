package fbprg;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		
	   System.setProperty("webdriver.chrome.driver","C:/Selenium Chrome Driver/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		
        driver.get("http://www.inviul.com/getwindowhandle-window-switching/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("window.scrollBy(0,1000)");
        
        String defaultWindow = driver.getWindowHandle();
        System.out.println("default window name is:"+defaultWindow);
        
        WebElement wHan = driver.findElement(By.xpath("//a[@class='buttons btn_blue center']"));
        js.executeScript("arguments[0].click();",wHan);
        
               
        Set<String> childWindows= driver.getWindowHandles();
        Iterator<String>iterator=childWindows.iterator();
        
            while(iterator.hasNext())     {
         	String child= iterator.next();
         	
         	if(!child.equalsIgnoreCase(defaultWindow))
         	{
         		driver.switchTo().window(child);
         		System.out.println("childwindows name is:"+child);
         	}
         	else
         	{
         		System.out.println("There is no childWindows");
         	}
        driver.findElement(By.xpath("//div[@id='search-2']//input[@id='s']")).click();
        Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[@id='search-2']//input[@id='s']")).sendKeys("abc");
    	Thread.sleep(5000);
    	   	   	
        			
        }
            
            driver.switchTo().window(defaultWindow);
	}    
          

	}


