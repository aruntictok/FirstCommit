package com.first_Selenium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unknown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		
		
	}

}
