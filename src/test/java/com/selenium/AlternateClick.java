package com.selenium;

import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class AlternateClick {
	WebDriver driver;
	@Test
	public void alerthandle() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement login =	driver.findElement(By.id("login2"));
	//	driver.findElement(By.id("login2")).click();
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", login);
//js.executeScript("arguments[0].click();", login);// alternate click by Javascript Executor
}
}
