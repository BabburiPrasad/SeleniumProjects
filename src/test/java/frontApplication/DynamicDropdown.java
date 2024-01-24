package frontApplication;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		
		/*
		 * driver.manage().window().maximize(); Thread.sleep(10000);
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * WebElement element =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//select[@id='CompanyCountry-Jc61']")));
		 * 
		 * WebElement dropdownElement =
		 * driver.findElement(By.xpath("//select[@id='CompanyCountry-Jc61']"));
		 * 
		 * Select select = new Select(dropdownElement);
		 * 
		 * List<WebElement> options = select.getOptions();
		 * 
		 * int randomIndex = new Random().nextInt(options.size());
		 * select.selectByIndex(randomIndex);
		 * 
		 * Thread.sleep(3000);
		 */

	}

}
