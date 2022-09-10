package com.dell.com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().deleteAllCookies();
	
WebElement staticdd = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")); // object of webelment
Select dropdown= new Select(staticdd);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("INR");
System.out.println (dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("AED");
System.out.println (dropdown.getFirstSelectedOption().getText());
dropdown.selectByValue("USD");
System.out.println(dropdown.getFirstSelectedOption().getText());

driver.quit();
	}

}
