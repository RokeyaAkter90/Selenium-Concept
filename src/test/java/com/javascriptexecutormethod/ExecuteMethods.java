package com.javascriptexecutormethod;

public class ExecuteMethods {
	/*Scenarios To Use JavaScriptExecutor in Selenium
	Let’s examine some scenarios we could handle using JavaScriptExecutor Interface for Selenium test automation.

	1. To Click on a Button
    // js.executeScript("document.getElementById('enter element id').click();");
	or
	// js.executeScript("arguments[0].click();", okButton);
	
	2. To Type Text in a Text Box without using sendKeys() method

	//js.executeScript("document.getElementById(id').value='someValue';");
	//js.executeScript("document.getElementById('Email').value='SeleniumTesting.com';");
	
	3. To Handle Checkbox by passing the value as true or false
	js.executeScript("document.getElementById('enter element id').checked=false;");
	js.executeScript("document.getElementById('enter element id').checked=false;");
	
	4. To generate Alert Pop window in Selenium Webdriver
	js.executeScript("alert('Welcome To Selenium Testing');");
	
	5. To refresh browser window using Javascript
	js.executeScript("history.go(0)");
	
	6. To get the innertext of the entire webpage in Selenium
	String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
	System.out.println(innerText);
	
	7. To get the Title of our webpage
    String titleText =  js.executeScript("return document.title;").toString();
	System.out.println(titleText);
	
	8. To get the domain name
    String domainName=  js.executeScript("return document.domain;").toString();
	System.out.println(domainName);
	
	9. To get the URL of a webpage
	String url=  js.executeScript("return document.URL;").toString();
	System.out.println(url);
	
	10. To get the Height and Width of a web page
	js.executeScript(“return window.innerHeight;”).toString();
	js.executeScript(“return window.innerWidth;”).toString();
	
	11. To find a hidden element in selenium using JavaScriptExecutor
js.executeScript("arguments[0].click();", element);
	
	12. To navigate to a different page using Javascript
js.executeScript("window.location = 'https://www.lambdatest.com");
	
	13. To perform Scroll on an application using Selenium
	a) To scroll the page vertically for 500px
    js.executeScript(“window.scrollBy(0,500)”);
    
	b) To scroll the page vertically till the end
	js.executeScript(“window.scrollBy(0,document.body.scrollHeight)”);
	14. Adding an element in DOM

	We can also add an element in DOM if required. However, as are only concerned with mimicking user interactions in the browser, this option may not be used.

	js.executeScript("var btn=document.createElement('newButton');"
	 
	                     + "document.body.appendChild(btn);");

	On similar lines, we can practically execute any JavaScript command using Selenium.*/
}
