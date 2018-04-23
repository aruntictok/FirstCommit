package com.first_Selenium.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome {

	public static void main(String[] args) {
		
				//Set the path to driver executable
				System.setProperty("webdriver.chrome.driver", "G:\\testing_sw\\chromedriver.exe");
								
				ChromeOptions options = new ChromeOptions();
				
				options.addArguments("--disable-extensions");
				
				//Launch Chrome browser
				WebDriver driver = new ChromeDriver(options);

				//Load the given URL
				driver.get("http:demo.actiTime.com/");
				
				//Maximize the window		
				driver.manage().window().maximize();
				
				//Wait for 20 seconds on the current page
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//close the browser
				driver.close();


	}

}
