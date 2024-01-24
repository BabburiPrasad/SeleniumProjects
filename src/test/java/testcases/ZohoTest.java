package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class ZohoTest extends BaseTest{
	
	@Test
	public void Login() throws InterruptedException {
		
		System.out.println("Linked Successfully");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Sign in")).click(); // locators --properties
//		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login_id")).sendKeys("bprasad@trellissoft.ai");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		Thread.sleep(5000);
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("password")).sendKeys("tRELLIS@1995");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		Thread.sleep(5000);
		
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		
	}

}
