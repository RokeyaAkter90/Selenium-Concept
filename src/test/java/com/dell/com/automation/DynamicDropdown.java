//https://www.udemy.com/selenium-real-time-examplesinterview-questions/learn/v4/t/lecture/1979294
package com.dell.com.automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
/* these dropdown options are selected after you select specific dropdown
	eg. arrival city option will displayed only when you select departure city first*/
	
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // path of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(1000);	
		  
		//driver.findElement(By.xpath("(//a[@value='HBX'])[2]")).click(); // using indexing concept to handle dynamic object

		 driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HBX'] ")).click();
		
		 // using parent child xpath (put parent xpath and space enter child xpath)
		
		driver.quit();

	}

}
