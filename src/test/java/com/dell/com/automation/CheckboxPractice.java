package com.dell.com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(	driver.findElement(By.id("checkBoxOption1")).isSelected());
	boolean cb1 =	driver.findElement(By.id("checkBoxOption1")).isSelected();
	Assert.assertTrue(cb1);
		driver.findElement(By.id("checkBoxOption2")).click();
	    System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(	driver.findElement(By.id("checkBoxOption3")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(	driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).click();
	    System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(	driver.findElement(By.id("checkBoxOption3")).isSelected());
		boolean cb3 =	driver.findElement(By.id("checkBoxOption3")).isSelected();
		Assert.assertFalse(cb3);
		
		// ti get the count of checkboxes present
List<WebElement>	CB =driver.findElements(By.cssSelector("input[type='checkbox']"));
System.out.println(CB.size());
driver.quit();
	}

}
