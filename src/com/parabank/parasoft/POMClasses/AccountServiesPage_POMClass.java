package com.parabank.parasoft.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountServiesPage_POMClass
{
	private WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(), 'Open New Account')]")
	private WebElement OpenNewAccount;
	
	public void clickOnOpenNewAccount()
	{
		OpenNewAccount.click();
	}
	
	
	@FindBy(xpath="//a[contains(text(), 'Accounts Overview')]")
	private WebElement AccountsOverview;
	
	public void clickOnAccountOverview()
	{
		AccountsOverview.click();
		
	}
	
	@FindBy(xpath="(//a[contains(text(), 'Transfer Funds')])[1]")
	private WebElement TransferFunds;
	
	public void clickOnTransferFunds()
	{
		TransferFunds.click();
	}
	
	@FindBy(xpath="(//a[contains(text(), 'Bill Pay')])[1]")
	private WebElement BillPay;
	
	public void clickOnBillPay()
	{
		BillPay.click();
	}
	
	@FindBy(xpath="(//a[contains(text(), 'Find Transactions')])[1]")
	private WebElement FindTransactions;
	
	public void clickOnFindTransactions()
	{
		FindTransactions.click();
	}
	
	
	@FindBy(xpath="(//a[contains(text(), 'Update Contact Info')])[1]")
	private WebElement UpdateContactInfo;
	
	public void clickOnUpdateContactInfo()
	{
		UpdateContactInfo.click();
	}
	
	
	
	
}
