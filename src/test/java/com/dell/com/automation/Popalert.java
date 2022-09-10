package com.dell.com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Popalert {
	WebDriver driver;
	@Test
	public void AlertHandle() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
WebElement submitbutton = driver.findElement(By.name("proceed"));
submitbutton.click();
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].click();", submitbutton); // alternate method to click
 Alert alt = driver.switchTo().alert();
 System.out.println(alt.getText());
alt.accept();
	//alt.dismiss(); // to click on cancel button
	
	//alt.sendKeys("rokeya");  //to write anything in alert box
		
	}
			
}
