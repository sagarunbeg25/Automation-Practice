package com.pom.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.pom.base.TestBase;
import com.pom.pagefactory.Home_POF;
import com.pom.pagefactory.Login_POF;

public class LoginPageTestCases extends TestBase{
	
	WebDriver driver;
	
	@Test
	public void loginToApplication() {
	driver= TestBase.getDriver();
	Home_POF homePage = new Home_POF(driver);
	homePage.clickOnSignIn();
	Login_POF loginPage= new Login_POF(driver);
	loginPage.signIn();
	}
}
