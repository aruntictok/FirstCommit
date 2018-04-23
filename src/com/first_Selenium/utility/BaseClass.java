package com.first_Selenium.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static void main(String[] args) {
		
		//Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//Load the given URL
		driver.get("http:demo.actiTime.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Maximize the window		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("user");
		
		driver.findElement(By.xpath("//input[@name = 'pwd']")).sendKeys("user");
		
		driver.findElement(By.xpath("//a[@id = 'loginButton']")).click();
		
		driver.findElement(By.xpath("//a[@href = '/administration/userlist.do']")).click();
		
		//Wait for 20 seconds on the current page
		
		//close the browser
		driver.close();

	}

}
