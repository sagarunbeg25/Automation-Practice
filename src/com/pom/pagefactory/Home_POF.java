package com.pom.pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_POF{
	
	WebDriver driver;
	
	@FindBy(className="login")
	public static WebElement signIn;
	
	
	@FindBy(xpath="//a[@title='Contact Us']")
	public static WebElement contactUS;
	
	public Home_POF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickOnSignIn(){
		signIn.click();
	}
}
