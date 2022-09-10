package com.dell.com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Calender {

//ublic static void main(String[] args) throws Exception {
	public static void calender() throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://usbair.com/"); // URL in the browser
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("scroll(0, 400)"); // will scroll down to 400 mm
	WebElement datebar = driver.findElement(By.id("dpd1"));
	datebar.click();
	List <WebElement> dates = driver.findElements(By.cssSelector("a[class*='ui-state-default']")); // select all dates using common attribute value
    int count = driver.findElements(By.cssSelector("a[class*='ui-state-default']")).size();
 
   for (int i=0; i< count; i++) {
   String text= driver.findElements(By.cssSelector("a[class*='ui-state-default']")).get(i).getText();
  if (text.equalsIgnoreCase("15"))
{
driver.findElement(By.cssSelector("a[class*='ui-state-default']")).click();
break;
}
	
}
		//   span[class*='flatpickr-day'] // to select day		
	}

}
