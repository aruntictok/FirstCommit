package com.first_Selenium.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LaunchIe {

	
		
		/*System.setProperty("webdriver.ie.driver","G:\\testing_sw\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();*/
		@Test
		public void launchurl()
		{
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//a[contains(text(),'Login & Signup')]")).click();
			WebElement ele = driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.sendKeys("arun.tictok@gmail.com");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("flipkart.com");
			driver.findElement(By.xpath("//div[@class='_1avdGP']")).click();
			driver.quit();

	}

}
