package frontApplication;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
// Basic drop-down handling (Select -> Options) single select drop-down
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement dropdown = driver.findElement(By.name("awareness_source_c"));
		
		Select select = new Select(dropdown);
		
		select.selectByIndex(1); //Selects Event or Podcast
		Thread.sleep(3000);
		
		select.selectByValue("Previously Used");
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Word of Mouth/Referral");
		Thread.sleep(3000);
		
		//System.out.println(select.getAllSelectedOptions());
	}

}
