package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Title is:" +driver.getTitle());
		System.out.println("URL is:" +driver.getCurrentUrl());
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Nisha Jenifer");
		driver.findElement(By.name("lastName")).sendKeys("Lawrence");
		driver.findElement(By.name("phone")).sendKeys("9765436453");
		driver.findElement(By.id("userName")).sendKeys("test@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Shantiniketan Apartments, Kelambakkam");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.name("postalCode")).sendKeys("603103");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Test@123");
		driver.findElement(By.name("submit")).click();
		//driver.close(); 
		//driver.quit();
	}

}
