package com.dell.com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recipient-email")).sendKeys("rok.39");
		driver.findElement(By.id("recipient-name")).sendKeys("rok");
		driver.findElement(By.id("message-text")).sendKeys("Thank you!");
		driver.findElement(By.xpath("//button[contains(text(),'nd message')]")).click();
		Thread.sleep(1000);
	Alert alt =	driver.switchTo().alert();
	alt.accept();
	Thread.sleep(1000);
		driver.quit();
	}

}
