package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutClass
{

	
	ChromeDriver driver;
	Properties pr;
	public LogOutClass(ChromeDriver driver, Properties pr) 
	{

	this.driver=driver;
	this.pr=pr;
	
	}
	
	public void logout() throws InterruptedException
	{
		WebElement logOutClick=driver.findElementByXPath(pr.getProperty("LogOut_Click"));
		logOutClick.click();
		Thread.sleep(10000);
		WebElement logout=driver.findElementByXPath(pr.getProperty("LogOut"));
		logout.click();
		
		Thread.sleep(3000);
	}
}
