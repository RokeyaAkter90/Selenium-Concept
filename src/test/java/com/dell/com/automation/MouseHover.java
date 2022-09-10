package com.dell.com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
WebDriver driver;
@Test
public void MHAction() throws Exception {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://www.dell.com/en-us");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
Actions mh = new Actions(driver);
WebElement support = driver.findElement(By.xpath("//span[text()='Support']"));
mh.moveToElement(support).build().perform();
driver.findElement(By.linkText("Support Services & Warranty")).click();
Thread.sleep(1000);
	
	
}
		
}
