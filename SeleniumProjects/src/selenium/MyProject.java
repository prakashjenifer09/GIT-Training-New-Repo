package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProject {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies(); 
	driver.manage().window().maximize(); 
	driver.get("http://teams.microsoft.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	System.out.println("Title is:" +driver.getTitle());
	System.out.println("URL is:" +driver.getCurrentUrl());
	//driver.findElement(By.name("loginfmt")).sendKeys("nisha.thiyagarajan@lab.ontryvium.com");
	driver.findElement(By.id("idSIButton9")).click();
	//driver.close(); 
	//driver.quit();
}

}




