package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetallURL {
	WebDriver driver;
	@Test
	public void linklist() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.get("https://www.dell.com/en-us");
		 driver.manage().window().maximize();
		 Thread.sleep(2000); 
		 
	List<WebElement> links =driver.findElements(By.tagName("a"));
int	linkcount = links.size();

for (int i=0; i <linkcount; i++ ) {
String link = links.get(i).getAttribute("href"); // to get the link what is assigned to href
String linktext = links.get(i).getText(); // to get the text of link if present
System.out.println("The link is "+ link);
System.out.println("The text of link is "+linktext);
}
System.out.println("Total number of link present in this page is "+linkcount);
System.out.println("Page Title is "+ driver.getTitle()); // to get the title of the page
driver.quit();
}




}

