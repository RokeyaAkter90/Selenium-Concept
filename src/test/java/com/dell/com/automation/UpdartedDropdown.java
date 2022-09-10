package com.dell.com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdartedDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser
		driver.manage().deleteAllCookies();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
       // int i=1; 
        /*while (i<5) {
        driver.findElement(By.id("hrefIncAdt")).click(); // will add 5 adults using while loop
        i++;	
        }*/
        for (int i=1;i<5;i++) {
        driver.findElement(By.id("hrefIncAdt")).click(); // will add 5 adults using for loop	
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.quit();
	}

}
