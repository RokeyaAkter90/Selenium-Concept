package com.dell.com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser
		driver.manage().deleteAllCookies();
		System.out.println (driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // return false
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Thread.sleep(1000);
	System.out.println (driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // return true as checkbox is selected
	
	boolean checkbox =	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
	Assert.assertTrue(checkbox);
	
	// find how many checkboxes present in the page [check box count]
	
List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

System.out.println(checkboxes.size()); // to get the number of check boxes using size command

driver.quit();	}

}
