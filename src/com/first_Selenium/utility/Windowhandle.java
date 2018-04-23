package com.first_Selenium.utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		//System.setProperty("WebDriver.gecko", value)
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();//
		System.out.println(parent);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		int count = allwindows.size();
		System.out.println(count);
		for(String ch:allwindows){
			if(!parent.equalsIgnoreCase(ch))
			{
				driver.switchTo().window(ch);
				System.out.println("popup tile is- "+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		System.out.println("parent title is- "+driver.getTitle());
	}

}
