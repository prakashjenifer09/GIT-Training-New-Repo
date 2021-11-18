package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInvoke {

	public static void main(String[] args) {
		// below line will start the driver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.thiyagarajan\\OneDrive - SENSIPLE\\Java - Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // This line will invoke the Chrome driver
		driver.manage().deleteAllCookies(); // This line will delete all the cookies in the browser
		driver.manage().window().maximize(); // This will maximize the browser window
		//driver.get("https://tryviumteamsqa1.botomateducx.com/webconnect/chat/landing");//To navigate to a URL
		driver.get("https://teams.microsoft.com");//To navigate to a URL
		//driver.navigate().to("https://teams.microsoft.com/_?culture=en-in&country=IN&lm=deeplink&lmsrc=homePageWeb&cmpid=WebSignIn#/sensiple.tryvium.teams.acd.context/28:9c0760ec-9b89-4c80-bdc4-0bb746ae9b40?ctx=chat");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		System.out.println("Title is:" +driver.getTitle());
		System.out.println("URL is:" +driver.getCurrentUrl());
		//driver.close(); // To Close the browser
		//driver.quit();//To Close the driver
		
		

	}

}
