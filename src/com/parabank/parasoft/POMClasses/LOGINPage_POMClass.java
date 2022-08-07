package com.parabank.parasoft.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPage_POMClass 
{

	private WebDriver driver;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register;
	
	public void clickOnRegisterButton()
	{
		Register.click();
	}
	
	@FindBy(xpath="(//body//div//p//a)[1]")
	private WebElement ForgotLoginInfo;
	
	public void clickOnForgotLogInInfo()
	{
		ForgotLoginInfo.click();
	}
	
	@FindBy(xpath="(//body//div//input[1])[1]")
	private WebElement UserName;
	
	public void sendUserName()
	{
		UserName.sendKeys("GauravBhor");
	}
	
	@FindBy(xpath="(//body//div//input[1])[2]")
	private WebElement PassWord;
	
	public void sendPassWord()
	{
		PassWord.sendKeys("Gaurav@7557");
	}
	
	@FindBy(xpath="(//body//div//input[1])[3]")
	private WebElement LoginButton;
	
	public void clickOnLogInButton()
	{
		LoginButton.click();
	}
	
	@FindBy(xpath="//li[@class='Solutions']")
	private WebElement Solutions;
	
	public void clickOnSolutions()
	{
		Solutions.click();
	}
	
	@FindBy(xpath="(//body//div//ul//li//a)[1]")
	private WebElement AboutUs;
	
	public void clickOnAboutUs()
	{
		AboutUs.click();
	}
	
	
	@FindBy(xpath="(//body//div//ul//li//a)[2]")
	private WebElement Services;
	
	public void clickOnServices()
	{
		Services.click();
	}
	
	@FindBy(xpath="(//body//div//ul//li//a)[3]")
	private WebElement Products;
	
	public void clickOnProducts()
	{
		Products.click();
	}
	
	@FindBy(xpath="(//body//div//ul//li//a)[4]")
	private WebElement Locations;
	
	public void clickOnLocations()
	{
		Locations.click();
	}
	
	
	@FindBy(xpath="(//body//div//ul//li//a)[5]")
	private WebElement AdminPage;
	
	public void clickOnAdminPage()
	{
		AdminPage.click();
	}
	
	@FindBy(xpath="//a[text()='home']")
	private WebElement HomeButton;
	
	public void clickOnHomeButton()
	{
		HomeButton.click();
	}
	@FindBy(xpath="//a[text()='about']")
	private WebElement AboutButton;
	
	public void clickOnAboutButton()
	{
		AboutButton.click();
	}
	
	@FindBy(xpath="//a[text()='contact']")
	private WebElement ContactButton;
	
	public void clickOnContactButton()
	{
		ContactButton.click();
	}
	public LOGINPage_POMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	
	
	
	
	
}
