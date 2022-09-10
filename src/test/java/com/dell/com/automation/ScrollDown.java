//  https://www.southwest.com/

package com.dell.com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	WebDriver driver;
	@Test
	public void scroll() throws Exception {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com.au/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
JavascriptExecutor js = (JavascriptExecutor) driver; //Creating the JavascriptExecutor interface object by Type casting		
js.executeScript("window.scrollBy(1000,4000)"); // (Scroll to specific location,scroll x axis 1000, y axis 4000)
Thread.sleep(2000);
js.executeScript("window.scrollTo(0,1500)"); //
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.xpath("//div[@class='a-cardui-header'] //h2[text()='Shop books by category']"));
js.executeScript("arguments[0].scrollIntoView()",ele); // scroll upto an element
Thread.sleep(2000);
WebElement search = driver.findElement(By.id("twotabsearchtextbox"));  
js.executeAsyncScript("document.search.value='car';");
Thread.sleep(4000);
driver.quit();

//type casting
		
	}
}
