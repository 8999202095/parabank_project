package com.parabank.parasoft.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Class 
{
	public static void ScreenshotMethod(WebDriver driver) throws IOException
	{
		//For date and time
		Date d = new Date();
		
		DateFormat d1 = new SimpleDateFormat("dd-MM-YY & HH-mm-ss");
		
		String date = d1.format(d);
		
		//For Screenshot
		
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		
		File SourceFile  = scrnshot.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("D:\\GAURAV\\SOFTWARE TESTING_VELOCITY\\AUTOMATION TESTING\\EXTRAPRACTICE\\ScreenShot\\SauceDemo_Scenarios\\SauceDemo" + date + ".jpg");
		
		FileHandler.copy(SourceFile, destfile);
		
		
	}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

