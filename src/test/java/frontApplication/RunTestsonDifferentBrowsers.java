package frontApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunTestsonDifferentBrowsers {
//	public static ChromeDriver driver;
//	public static FirefoxDriver driver;
	public static WebDriver driver;
	
	public static String browser = "firefox"; // External excel file, CSV file

	public static void main(String[] args) {
		
		
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else {
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
		driver.get("https://www.zoho.com/");

	}

}
