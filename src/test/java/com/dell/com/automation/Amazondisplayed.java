package com.dell.com.automation;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazondisplayed {
WebDriver driver;
@Test
	public void amazonlogin() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	boolean address = driver.findElement(By.id("glow-ingress-line2")).isDisplayed();
	Assert.assertTrue(address);
	Thread.sleep(3000);
	//Actions mh = new Actions(driver);
//WebElement	mo= driver.findElement(By.xpath("(//span[text()='English'])[1]"));
	//mh.moveToElement(mo).build().perform();
	//driver.findElement(By.xpath("(//span[text()='español'])[1]")).click();
//boolean espanol = driver.findElement(By.xpath("(//span[text()='español'])[1]")).isSelected();
//Assert.assertTrue(espanol, "Condition fails");
driver.quit();
		
		
	}
}
