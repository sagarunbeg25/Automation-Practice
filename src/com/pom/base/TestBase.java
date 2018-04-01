package com.pom.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	private static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
			//Initialization Code
			driver= new FirefoxDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		}
	

	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
	

	public static WebDriver getDriver() {
		return driver;
	}
	
}
	

