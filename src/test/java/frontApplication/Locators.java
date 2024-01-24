package frontApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input#login-button")).click();
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		System.out.println("Back navigation");
		
		driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();
		/*
	 		1) Selecting by Class:

			Syntax: .classname
			Example: Select all elements with the class "highlight". => .highlight
			
		  	2) Selecting by ID:

			Syntax: #id
			Example: Select the element with the ID "main-header". => #main-header
			
		   	3) Selecting by Tag Name:

			Syntax: tagname
			Example: Select all <p> elements.
			
			4) Combining Conditions:

			Syntax: tagname.classname or tagname#id or tagname[attribute='value']

			Example: Select all <a> elements with the class "external-link". => a.external-link
			Example: Select the <input> element with the ID "username". => input#username
			Example: Select all <button> elements with the attribute disabled set to "true". => button[disabled='true']
			
			
		 
		 */
		
		// Relative locators
		
		System.out.println("Relative Locators");
		
		driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
		WebElement about = driver.findElement(By.cssSelector("a#about_sidebar_link"));
		WebElement logout = driver.findElement(RelativeLocator.with(By.tagName("a")).below(about));
		logout.click();
		
		driver.findElement(RelativeLocator.with(By.id("user-name")).above(password)).sendKeys("secret_sauce");
		driver.findElement(RelativeLocator.with(By.id("password")).below(password)).sendKeys("standard_user");
		
		driver.findElement(RelativeLocator.with(By.id("login-button")).below(password)).click();
	}

}
