package com.Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pom.LoginPOM;

public class Login extends BaseClass {
	public static WebDriver driver = BaseClass.Browser_launch();
	LoginPOM log=new LoginPOM(driver);
	String successURL="https://dev1.adaptivebizapp.com/pcm/";
	
	String[][] credentials = {
            {"Ishwaryar", "Adaptive*123"},
            {"Prajan", "Adaptive*123"},
            {"Maha", "Adaptive*123"}
            // Add more credentials as needed
    };
	
	@Test(priority = 1)
	public void logincheck() throws InterruptedException {

		
	for (int i = 0; i < credentials.length; i++) {
        for (int j = 0; j < credentials[i].length; j++) {
        	Url("https://dev1.adaptivebizapp.com/pcm/Account/Login");
        	Sendkeys(log.companyname, "SMM");
        	Sendkeys(log.username, credentials[i].toString());
        	Sendkeys(log.password, credentials[j].toString());
        	Thread.sleep(200);
        	click(log.login);
        	if(driver.getCurrentUrl()==successURL) {
        		break;
        		}
        }
         // Move to the next row in the output
    }
	
}
}


		
	
	



