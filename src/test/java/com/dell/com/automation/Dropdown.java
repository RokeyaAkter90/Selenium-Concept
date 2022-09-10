package com.dell.com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	WebDriver driver;
	@Test
	public void dd() throws Exception {
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement allcat =	 driver.findElement(By.id("gh-cat"));	 
	Select dropdown = new Select( allcat);
	dropdown.selectByIndex(2);
	Thread.sleep(1000);
	dropdown.selectByVisibleText("Books");
	Thread.sleep(1000);
	dropdown.selectByVisibleText("10542");
	driver.quit();
	}
	
}
