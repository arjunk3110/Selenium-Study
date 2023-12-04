


package UI;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandles
{
	public static String browser="Firefox";
	public static WebDriver driver;

	public static void main(String[] args) 
	
	{
		if (browser.equals("Chrome"))
		{
		driver=new ChromeDriver();
			
		}
		
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("Current URL = "   +CurrentURL);
		
		String Title= driver.getTitle();
		System.out.println("Current Title = "  +Title);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		
	//WINDOW HANDLES
		Set<String> SET=driver.getWindowHandles();
		
		System.out.println("Current window open = " +SET.size());
		
		
		
		//CAPTURE WINDOW FROM SET
			Iterator<String> IT =SET.iterator();
			String ParentID= IT.next();
			String ChildID=IT.next();
			
		//PASS DRVER TO CHILD WNDOW
			driver.switchTo().window(ChildID);
			
				
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			WebElement b1=driver.findElement(By.xpath("//input[@id='stationFrom']"));
			b1.click();
			WebElement b2=driver.findElement(By.xpath("//input[@id='stationFrom']"));
			b2.click();
			System.out.println("clicked");
			driver.close();
			
			driver.switchTo().window(ParentID);
			
			String STR1=driver.getWindowHandle();
			System.out.println("Current window open is" +STR1);
			
		
			driver.findElement(By.xpath(" //a[contains(text(),'LOGIN')] ")).click();
				

	}
}






