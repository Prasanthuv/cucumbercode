package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseClass1 {
protected WebDriver driver;
	
	protected WebDriver browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("incognito");
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();
		}
		return driver;
		
	}
protected void launchURL(WebDriver driver,String URL) {
	try {
		
		driver.get(URL);
	}catch(Exception e) {
	e.printStackTrace();
		
	}
}
protected void clickOneElement(WebElement element,WebDriver driver) {
	try {
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
protected void inputValues(WebDriver driver,WebElement element, String value) {
	try {
		new WebDriverWait(driver,Duration.ofSeconds(10))
		.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}catch(Exception e) {
		e.printStackTrace();
		
	}
}
protected void staticWait(long sec) {
try {
		
		Thread.sleep(sec);
	}catch(InterruptedException e) {
	e.printStackTrace();
		
	}
}
protected void screenShot(WebDriver driver,String name) {
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\GowriKannu\\eclipse-workspace\\bigbasketpractice\\screenshot\\"+name+".png");
	try {
		FileHandler.copy(source, destination);
	}catch(IOException e) {
		e.printStackTrace();
	}
}
protected void jSClick(WebDriver driver,WebElement element) {
	try {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].click();", element);
}catch(Exception e) {
	e.printStackTrace();
}
}
protected void jsinputValues(WebDriver driver, WebElement element, String otp) {
	try {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='otp';", element);
		
	}catch(Exception e) {
		//e.printStackTrace();
	}
	}
protected void closeTab(WebDriver driver) {
	driver.close();
}
}


