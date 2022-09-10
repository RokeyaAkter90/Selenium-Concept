package com.javascriptexecutormethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;

public class typeText {
	public static void setAttribute(WebElement element, String attributeName, String value)
    {
        WrapsDriver wrappedElement = (WrapsDriver) element;
        JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();
        driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);
    }
//Call the above method in the test script and pass the text field attribute and pass the text you want to enter.

}
