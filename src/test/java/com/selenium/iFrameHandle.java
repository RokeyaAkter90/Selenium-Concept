package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameHandle {
	WebDriver driver;
	@Test
	public void framehandle() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.get("https://docs.oracle.com/javase/7/docs/api/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElements(By.tagName("frame")).size();
		 driver.switchTo().frame(driver.findElement(By.xpath("(//frame)[3]"))); // frame using locator WebElement
		//driver.switchTo().frame("classFrame"); // frame using  frame name
		 // driver.switchTo().frame(2); // frame usign index 
		/*(search by tag name (//frame or //iframe) to get the frame count in the page then get index value*/
		
	
	 System.out.println(driver.findElement(By.xpath("//h1[text()='Java™ Platform, Standard Edition 7']")).getText());
	 // to print frame title
	 driver.findElement(By.linkText("Help")).click();
	 
	// driver.findElement(By.partialLinkText("Hel")).click();
	 
	 driver.switchTo().defaultContent(); // to exit from frame
	driver.quit();
	
	/* watch frame to handle parent and child frame
	 * https://www.toolsqa.com/selenium-webdriver/handling-iframes-using-selenium-webdriver/
	 * https://demoqa.com/frames
	 */

}
}
