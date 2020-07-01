package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFaceBook 
{

	ChromeDriver driver;
	Properties pr;
	public LoginFaceBook(ChromeDriver driver, Properties pr) 
	{

	this.driver=driver;
	this.pr=pr;
	
	}
	
public void loginPage(String userName, String password) throws InterruptedException
{
	
	WebElement username=driver.findElementById(pr.getProperty("userNameLocate"));
	username.clear();
	username.sendKeys(userName);
	Thread.sleep(1000);
	WebElement password1=driver.findElementById(pr.getProperty("passwordLocate"));
	password1.clear();
    password1.sendKeys(password);
    Thread.sleep(3000);
	WebElement login =driver.findElementById(pr.getProperty("LoginClick"));
	login.click();
	Thread.sleep(25000);
	
	
	

}
	
	
}
