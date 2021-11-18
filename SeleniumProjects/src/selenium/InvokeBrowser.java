package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {
	
	public static WebDriver driver;
	public static String sURL = "https://teams.microsoft.com";
	public static int iBrowserType = 1; //1 - Chrome,2 - FF,3 - Edge

	public static void main(String[] args) {
		invokeBrowser();
		browserSettings();
		navigateURL();
		getPageInfo();
		//closeBrowser();
	}
	
	public static void invokeBrowser() {
		switch (iBrowserType) {
		case 1:
			System.out.println("User Option is "+iBrowserType+", So invoking Chrome Browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		
		case 2:
			System.out.println("User Option is "+iBrowserType+", So invoking FireFox Browser");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case 3:
			System.out.println("User Option is "+iBrowserType+", So invoking Edge Browser");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("User Option is wrong "+iBrowserType+", So invoking the default Chrome Browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
	}
	
	public static void browserSettings() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public static void navigateURL() {
		driver.get(sURL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	public static void getPageInfo() {
		System.out.println("Title is : "+driver.getTitle());
		System.out.println("URL is : "+driver.getCurrentUrl());
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	

}
