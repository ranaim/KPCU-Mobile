package project.tests;

import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.CheckingAccountPage;
import project.pageobject.DepositPage;
import project.pageobject.LoginPage;
import project.pageobject.MorePage;
import project.pageobject.More_OpenAccount_OR_Loans_Page;
import project.pageobject.MoveMoneyPage;


public class Smoke_Tests extends BaseTest
{		
	
/*	@Test(groups={"smoke"})
	public void validate_DashboardPage() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		accountsPage.validate_Account();
		DepositPage depositpage = accountsPage.clickDepositIcon();
		depositpage.validateDepositPage();
		MoveMoneyPage movemoney =  accountsPage.clickMoveMoneyIcon();
		movemoney.validateMoveMoneyPage();
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.validateMorePage();				
	  }*/
	
	@Test(groups={"smoke"})
	public void validate_Accounts() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		accountsPage.validate_Account();
	}


	@Test(groups={"smoke"})
	public void validate_Deposits() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
               .login();
		DepositPage depositpage = accountsPage.clickDepositIcon();
		depositpage.validateDepositPage();
		
	}
	

	@Test(groups={"smoke"})
	public void validate_MoveMoney() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		MoveMoneyPage movemoney =  accountsPage.clickMoveMoneyIcon();
		movemoney.validateMoveMoneyPage();
	}
	

	@Test(groups={"smoke"})
	public void validate_More() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.validateMorePage();
	}
	
	@Test(groups={"smoke"})
	public void validate_AccountEstatements() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		CheckingAccountPage checkingAccount = accountsPage.clickCheckingAcctBox();		
		checkingAccount.verify_eStatements();		
	}
	
	@Test(groups={"smoke"})
	public void validate_Account_Details() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		CheckingAccountPage checkingAccount = accountsPage.clickCheckingAcctBox();		
		checkingAccount.validate_CheckingAccount_Details();
	}
	
	@Test(groups={"smoke"})
	public void validate_Account_OrderChecks() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		CheckingAccountPage checkingAccount = accountsPage.clickCheckingAcctBox();		
		checkingAccount.verifyOrderChecks();
	}


	@Test(groups={"smoke"})
	public void validate_Account_Transfers() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		CheckingAccountPage checkingAccount = accountsPage.clickCheckingAcctBox();		
		checkingAccount.verify_Transfer_Page();
	}
	
	/*@Test(groups={"smoke"})
	public void validate_More_Forms() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		MorePage more = accountsPage.clickMoreIcon();		
		more.validateForms();
	}*/
	
	@Test(groups={"smoke"})
	public void validate_More_OpenAccount() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		MorePage more = accountsPage.clickMoreIcon();		
		More_OpenAccount_OR_Loans_Page  openaccount = more.goto_openAccountsORMore_Page();
		openaccount.Validate_More_OpenAccount_or_loans_page();
	}
	
	@Test(groups={"smoke"})
	public void validate_KPCUCards() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.clickAndVerifyKPCUCards();
	}
	
	@Test(groups={"smoke"})
	public void validate_CardActions() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.clickAndVerifyKPCUCardsActions();
	}
	
	
	@Test(groups={"smoke"})
	public void validate_Wire_Forms_Request() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.clickAndVerifyWireFormsAndRequest();
	}
}
