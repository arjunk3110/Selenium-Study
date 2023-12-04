package UI;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicMethods
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
		
		driver.get("https://www.saucedemo.com/");
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement>elements =driver.findElements(By.xpath(  "//div[@class='inventory_list'] /div  "  ));
		System.out.println(elements);
		
		driver.navigate().to("https://facebook.com/");
		
		
		
		
		

	}
}





