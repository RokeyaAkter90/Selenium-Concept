package com.dell.com.automation;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* rahul shetty 56. lecture
https://www.udemy.com/selenium-real-time-examplesinterview-questions/learn/v4/t/lecture/2761068  */

public class AutoSuggestivedropdown { // dd comes based on your input not present there before

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
	List<WebElement> options =	driver.findElements(By.cssSelector("ul[id='ui-id-1'] a"));// use list to find all of webelements autosuggested
	for (WebElement option :options) { //logic to get one element (option) from elements (option)
	if (option.getText().equalsIgnoreCase("India")) // if logic to select our desired option if desired text appears it will go into the option click
	{
	option.click();
	break;
	}
	}
/* Your first goal is to provide input and then figure out the genetic locator, which extracts all these items and stored it in a list.
And then I go out of the list. And then you get fixed to see if it matches with your real value and just blindly click on that and
break you up.*/	
	}

}
