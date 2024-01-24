package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	@BeforeTest
	public void setup() throws IOException{
		
		if(driver==null) {
			FileReader fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\CascadeFrontapplication\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup(); // base
			driver = new ChromeDriver(); // base
			driver.manage().window().maximize(); // base
			
			driver.get(prop.getProperty("testurl")); // properties
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			WebDriverManager.chromedriver().setup(); // base
			driver = new FirefoxDriver(); // base
			driver.manage().window().maximize(); // base
			
			driver.get(prop.getProperty("testurl")); // properties
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup(); // base
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get(prop.getProperty("testurl")); // properties
		}
		
		else
		{
			throw new IllegalArgumentException("Unsupported browser: " + prop.getProperty("browser"));
		}
		
	}
	
	@AfterTest
	public void teardown(){
		
		driver.close();
		System.out.println("Teardown successful");
		
		
	}
}
