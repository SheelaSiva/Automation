package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BankReconciliationPOM {
	public static WebDriver driver;
	
	
	
	
	
	
	public BankReconciliationPOM(WebDriver driver) {
		BankReconciliationPOM.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
