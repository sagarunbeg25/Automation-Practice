package com.pom.pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POF{
	
     WebDriver driver;
	
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="passwd")
	public static WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	public static WebElement submitLogin;
	
	public Login_POF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void signIn(){
		email.sendKeys("sagarunbeg25@gmail.com");
		passwd.sendKeys("virus@250191");
		submitLogin.click();
	}

}
