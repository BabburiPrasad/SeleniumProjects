package frontApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {
	//public static void main(String[] args) 
	//{
	
	@Test
	
	public void login()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tms.test.cascadetraining.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("trellissofttestadmin@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Trelli@H13");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "TMS [TEST SERVER] by Cascade Healthcare Services");
		
		driver.close();
		
	}

}
