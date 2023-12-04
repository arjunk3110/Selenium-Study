package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownAutoSuggest

{
	public static WebDriver driver;
	public static String Browser="Chrome";
	


	public static void main(String[] args){
		if (Browser.equals("Chrome"))
		{
			//ChromeOptions options= new ChromeOptions();
			//options.addArguments("--disable-cookies");
			driver=new ChromeDriver();
			
		}
		
		else if(Browser.equals("Chrome"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='From']"));
		ele.sendKeys("India");
		
	
		//ele.sendKeys(Keys.ARROW_LEFT);
		
	}

}
