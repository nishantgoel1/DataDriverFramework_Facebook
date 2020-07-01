package org.testing.utilities;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Assertions 
{
	
	

	public static boolean checkingUrl(String expected_Url, String actual_Url)
	{
		
		if(expected_Url.equalsIgnoreCase(actual_Url))
		{
			System.out.println("Assertion Passed");
			return true;
		}
		else
		{
			
			System.out.println("Assertion failed");
			return false;
		}
		
	}
	
	public static boolean checkingPageTitle(String expected_Title, String actual_Title)
	{
		if(expected_Title.equalsIgnoreCase(actual_Title))
		{
			System.out.println("Assertion of email matching passed");
			return true;
			
		}
		else
		{
			System.out.println("Assertion of email matching failed");
			return false;
		}
	}

	
}
