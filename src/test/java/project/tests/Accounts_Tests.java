package project.tests;

import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.CheckingAccountPage;
import project.pageobject.LoginPage;


public class Accounts_Tests extends BaseTest{	
	
	
	@Test(groups={"regression"})
	public void Validate_Checking_Account() throws Exception
	{					
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		CheckingAccountPage checkingPage = accountsPage.clickCheckingAcctBox();
		checkingPage.validate_CheckingAccount_Details();		
		
		//Validate Estatement
		//checkingPage.verify_eStatements();
		checkingPage.clickFeedBack(1);
		
		//checkingPage.clickPopupCancel();
		
		//Validate Account Details
		/*Popup_AccountDetailsPage popUp = checkingPage.gotToAccountDetailsPage();
		popUp.validateAccountDetailsPage();
		checkingPage.clickBackButton();
		
		
		
		// Validate Tranfer
		checkingPage.verify_Transfer_Page();
		checkingPage.clickPopupCancel();*/
		//checkingPage.clickBackButton();
		
		// Validate OrderChecks
		 //checkingPage.verifyOrderChecks();
		 //checkingPage.clickBackButton();
	}
	
	
	/*
	@Test
	public void Validate_Unlimited_Account() throws Exception
	{					
		AccountsPage accountsPage = new LoginPage()
                .login();	
		Thread.sleep(1000);
		UnlimitedAccountPage unlimtedPage = accountsPage.clickUnlimitedAcctBox();
		unlimtedPage.validate_UnlimitedAccount_Details();
		
		//Validate Estatement
		unlimtedPage.verify_eStatements();
		unlimtedPage.clickBackButton();
		
		
		
		Popup_AccountDetailsPage popUp = unlimtedPage.gotToAccountDetailsPage();
		popUp.validateAccountDetailsPage();
	}
	
	
	@Test
	public void Validate_Smart_Account() throws Exception
	{					
		AccountsPage accountsPage = new LoginPage()
                .login();
		SmartAccountPage smartPage = accountsPage.clickSmartAcctBox();
		smartPage.validate_SmartAccount_Details();
		
		Popup_AccountDetailsPage popUp = smartPage.gotToAccountDetailsPage();
		popUp.validateAccountDetailsPage();
	}
	
	@Test
	public void Validate_LocUnsecuredVariable_Account() throws Exception
	{					
		AccountsPage accountsPage = new LoginPage()
                .login();
		LocUnsecuredVariableAccountPage LocPage = accountsPage.clickLocUnsecuredAcctBox();
		LocPage.validate_LocUnsecuredVariableAccount_Details();
		Popup_AccountDetailsPage popUp = LocPage.gotToAccountDetailsPage();
		popUp.validateAccountDetailsPage();
	}*/
}
