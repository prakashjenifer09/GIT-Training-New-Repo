package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerusingxpath {
	
	public static WebDriver driver;
 

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Title is:" +driver.getTitle());
		System.out.println("URL is:" +driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text() =\"SIGN-ON\"]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		
	}
	
	public static void selectdrop(String dropName)
	{
		WebElement oDrop;
		oDrop=driver.findElement(By.name("passCount"));
		Select oSelect = new Select(oDrop);
		oSelect.selectByIndex(2);			
		
	}
}
