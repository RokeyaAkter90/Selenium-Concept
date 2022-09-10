package com.dell.com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {
	WebDriver driver;
	@Test
	public void alerthandle() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
driver.switchTo().alert().accept();
String text2 = driver.findElement(By.id("result")).getText();
Assert.assertFalse(text2.contains("You did not click an alert"));
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
driver.switchTo().alert().dismiss();
String text1 = driver.findElement(By.id("result")).getText();
Assert.assertTrue(text1.contains("You clicked: Cancel"));
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
driver.switchTo().alert().sendKeys("Rokeya");
driver.switchTo().alert().accept();
System.out.println(driver.findElement(By.id("result")).getText());
String text = driver.findElement(By.id("result")).getText();
Assert.assertEquals(text, "You entered: Rokeya"); // text=actual, expected="You entered: Rokeya"
driver.quit();
}
}
