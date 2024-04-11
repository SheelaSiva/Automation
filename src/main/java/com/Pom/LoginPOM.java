package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	public static WebDriver driver;
	
	@FindBy(id = "CompanyName")
	public WebElement companyname;

	@FindBy(id = "UserName")
	public WebElement username;

	@FindBy(id = "Password")
	public WebElement password;

	@FindBy(id = "login")
	public WebElement login;
	
	public LoginPOM(WebDriver driver) {
		LoginPOM.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
