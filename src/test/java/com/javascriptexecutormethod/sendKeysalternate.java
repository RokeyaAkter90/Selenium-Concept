package com.javascriptexecutormethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendKeysalternate {
	WebDriver driver;
	@Test
public void search() throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com.au/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.id("twotabsearchtextbox")); 
	typeText.setAttribute(search, "car", "BMW");
	Thread.sleep(3000);
	System.out.println(search.getText());
}
}
