package com.first_Selenium.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		//Launch Browser
		WebDriver driver = new FirefoxDriver();
		
		//launch URL
		driver.get("http://www.google.co.in");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Set time to wait for perform the next webElement
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//select search box and type Facebook
		driver.findElement(By.className("gsfi")).sendKeys("facebook");
		
		//select the first search suggestion and click on that
		driver.findElement(By.className("sbqs_c")).click();
		
		//find the search button
		WebElement searchBox = driver.findElement(By.name("btnK"));
		
		//Click on the search button
		searchBox.submit();
		
		//close the browser
		driver.close();
		
	}

}
