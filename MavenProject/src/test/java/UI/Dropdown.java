package UI;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{
	public static WebDriver driver;
	public static String Browser="Chrome";
	
	

	public static void main(String[] args)
	{
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
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[@title= 'Allow all cookies']" )).click();
	
	
		
		//WebElement web= driver.findElement(By.xpath(" //input[@id='u_a_b_sR']"));
		System.out.println("Cookies accepted");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("    //*[text()='Create new account']")).click();
		
		//HANDLE DROPDOWN
		
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select sel=new Select(date);
		sel.selectByIndex(30);
		

		Select sel2=new Select(driver.findElement(By.name("birthday_month")));
		sel2.selectByValue("10");
		
	
		Select sel3=new Select(driver.findElement(By.name("birthday_year")));
		sel3.selectByVisibleText("1991");
		
		
		
		
	
	}

}
