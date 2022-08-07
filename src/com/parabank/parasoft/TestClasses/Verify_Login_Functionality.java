package com.parabank.parasoft.TestClasses;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.parabank.parasoft.POMClasses.LOGINPage_POMClass;

public class Verify_Login_Functionality 
{
	private WebDriver driver;
	
	@BeforeMethod
	public void setUpMethod()
	{
		System.setProperty("webdriver.chrome.driver","D:\\GAURAV\\SOFTWARE TESTING_VELOCITY\\AUTOMATION TESTING\\Software\\Automation Drivers Or Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		System.out.println("Browser is opened.");
		
		driver.manage().window().maximize();
		
		System.out.println("Browser is maximized.");
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
			
		System.out.println("URL is opened.");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LOGINPage_POMClass Lp = new LOGINPage_POMClass(driver);
		
//		Lp.SendUserName();
//		
//		System.out.println("UserName is entered.");
//		
//		Lp.SendPassWord();
//		
//		System.out.println("PassWord is entered.");
//		
//		Lp.ClickOnLogInButton();
//		
//		System.out.println("Clicked on LogIn Button.");
		
		}
	
	@Test
	public void LogInFunctionality()
	{
		String ExpctedWebTitle = driver.getTitle();
		System.out.println(ExpctedWebTitle);
		
		String ActualWebTitle = "ParaBank | Welcome | Online Banking";
		
		if(ExpctedWebTitle.equals(ActualWebTitle))
		{
			System.out.println("Test Case is passed.");
		}
		else
		{
			System.out.println("Test Case is failed.");
		}
	}
	
	@AfterMethod
	public void tearDownMethod()
	{
		driver.close();
		
		System.out.println("Browser is closed.");
		
		
	}
	
	
	
	
	
	
	
	
}
