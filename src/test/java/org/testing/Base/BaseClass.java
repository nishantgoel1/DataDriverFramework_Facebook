package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Pages.LogOutClass;
import org.testing.Pages.LoginFaceBook;
import org.testing.utilities.Assertions;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	
public LoginFaceBook lf;	
public Properties pr;

public ChromeDriver driver;
public LogOutClass logOut;

	
	@BeforeMethod
	public void creatingConnection() throws IOException
	{
		File f=new File("D:\\Java and Selenium\\DataDrivenFrameWork\\src\\test\\java\\org\\testing\\resources\\Locator_Repo.properties");
		FileReader fr=new FileReader(f);
		 pr=new Properties();
		pr.load(fr);
		
		if(pr.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", pr.getProperty("set_property"));
		driver =new ChromeDriver();
		
	}
	
}}
