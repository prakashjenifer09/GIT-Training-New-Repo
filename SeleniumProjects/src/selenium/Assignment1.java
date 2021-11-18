package selenium;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
		public static WebDriver driver;
		public static String sURL = "http://demo.guru99.com/test/newtours/";
		public static int iBrowserType = 1; //1 - Chrome,2 - FF,3 - Edge

		public static void main(String[] args) {
			invokeBrowser();
			browserSettings();
			navigateURL();
			getPageInfo();
			enterValues();
			getpassenger();
			getmonth();
			getday();
			trymethods();
			//Rectangle();
			//getrect();
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
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case 3:
				System.out.println("User Option is "+iBrowserType+", So invoking Edge Browser");
				System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("User Option is wrong "+iBrowserType+", So invoking the default Chrome Browser");
				System.setProperty("webdriver.chrome.driver",  "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
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
		
		public static void enterValues()
		{
			driver.findElement(By.xpath("//a[text() =\"SIGN-ON\"]")).click();
			driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Test@123");
			driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		}
		
		public static void getpassenger() 
		{
			WebElement oDrop;
			boolean oSele=driver.findElement(By.name("passCount")).isSelected();
			{
				System.out.println("Passanger Selected:" +oSele);
			}
			oDrop=driver.findElement(By.name("passCount"));
			Select oSelect = new Select(oDrop);
			oSelect.selectByIndex(2);			
		}
		
		public static void getmonth() 
		{
			WebElement oMonth;
			boolean oMon=driver.findElement(By.name("fromMonth")).isSelected();
			{
				System.out.println("Month Selected:" +oMon);
			}
			//driver.findElement(By.name("fromMonth")).clear();
			oMonth=driver.findElement(By.name("fromMonth"));
			Select oSelect = new Select(oMonth);
			oSelect.selectByIndex(4);			
		}
		
		public static void getday() 
		{
			WebElement oDay;
			boolean oD=driver.findElement(By.name("fromDay")).isSelected();
			{
				System.out.println("Date Selected:" +oD);
			}
			//driver.findElement(By.name("fromDay")).clear();
			oDay=driver.findElement(By.name("fromDay"));
			Select oSelect = new Select(oDay);
			oSelect.selectByIndex(7);			
		}
				
		public static void trymethods() 
		{
			//WebElement oDay;
			String oCSS=driver.findElement(By.name("findFlights")).getCssValue("findFlights");
			{
				System.out.println("CSS Value:" +oCSS);
			}
			String oDOM=driver.findElement(By.name("findFlights")).getDomAttribute("findFlights");
			{
				System.out.println("DOM Attribute:" +oDOM);
			}
			Point oLoc=driver.findElement(By.name("findFlights")).getLocation();
			{
				System.out.println("Location:" +oLoc);
			}
			String oAtt=driver.findElement(By.name("findFlights")).getAttribute("findFlights");
			{
				System.out.println("Attribute:" +oAtt);
			}
			Dimension oSize=driver.findElement(By.name("findFlights")).getSize();
			{
				System.out.println("Size:" +oSize);
			}
			
		}
		
		public static void Rectangle()
		{
			Rectangle oReact;
			System.out.println("Get Rectangle");
		}
		
		public static void getrect() 
		{
		
			WebElement oReact=driver.findElement(By.name("findFlights"));
			Rectangle oRect1 = new oReact;
			oRect1.getHeight();
			
			{
				System.out.println("Height Value:" +oRect1);
			}
					
		}
						
		public static void closeBrowser() {
			driver.quit();
		}
		

}



