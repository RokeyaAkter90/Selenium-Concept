package com.dell.com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {
	
		WebDriver driver;
		@Test
		public void butonselected () throws Exception {
		
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get("https://www.southwest.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				Thread.sleep(2000);
			
	WebElement	oneway = driver.findElement(By.cssSelector("input[value='oneway']"));
	oneway.click();
	Thread.sleep(2000);
	boolean	button =oneway.isSelected();
	Assert.assertTrue(button, "Button selected");
		driver.quit();
				
			}
	}
	

