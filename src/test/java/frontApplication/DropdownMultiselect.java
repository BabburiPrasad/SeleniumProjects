package frontApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiselect {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/selectable");
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElement(By.id("verticalListContainer"));
		
		Select select = new Select(dropdown);
		
		select.selectByIndex(1);
		
		
		

	}

}
