package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameHandle {

	WebDriver driver;
	@Test
	public void nestedframehandle() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.get("https://demoqa.com/frames");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
List <WebElement>	frames=	 driver.findElements(By.tagName("iframe"));
for (int i=0; i<frames.size(); i++) {
	System.out.println(frames.get(i).getText());
}
		System.out.println(frames.size());
		 //driver.switchTo().frame(driver.findElement(By.xpath("(//frame)[3]"))); // finding frame using locator WebElement
		//driver.switchTo().frame("classFrame"); // frame using  frame name
		 // driver.switchTo().frame(2); // frame usign index 
		/*(search by tag name (//frame or //iframe) to get the frame count in the page then get index value*/
	 //System.out.println(driver.findElement(By.xpath("//h1[text()='Java™ Platform, Standard Edition 7']")).getText());
	 // to print frame title
	// driver.findElement(By.linkText("Help")).click(); //  to click on Help present in Frame[3]
	 //driver.switchTo().defaultContent(); // to exit from frame
	driver.quit();
	}
}
