package org.testing.testScripts;

import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutClass;
import org.testing.Pages.LoginFaceBook;
import org.testing.utilities.Assertions;
import org.testing.utilities.DataProviderClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseClass extends BaseClass
{

	
	@Test(dataProvider ="testData",dataProviderClass = DataProviderClass.class)
	public void testCase(String userName, String password) throws InterruptedException
	{
		
		driver.get(pr.getProperty("url_hit"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		lf=new LoginFaceBook(driver, pr);
		lf.loginPage(userName, password);   //Login of the page
		
		try {
		WebElement display=driver.findElementByXPath(pr.getProperty("Profile_title"));
		
		if(display.isDisplayed())
		{
			logOut=new LogOutClass(driver, pr);
			System.out.println("Login was successful now logging Out");
			logOut.logout();
			
			
		}
		}
		catch (Exception e) {
			String titleUncessfulLogin=driver.getTitle();
			System.out.println("Title of the page for unsuccessfull login is "+titleUncessfulLogin);
			System.out.println("Login Failed, Please try again with correct credentials");
			driver.close();
			Thread.sleep(3000);
		}
		
		
	}
		
	}
	
