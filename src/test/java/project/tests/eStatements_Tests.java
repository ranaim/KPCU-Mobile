package project.tests;

import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.MorePage;
import project.pageobject.eStatementsPage;




public class eStatements_Tests extends BaseTest
{
	
	@Test(groups={"regression"})
	public void validate_eStatementsPage() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		
		accountsPage.clickMoreIcon();
		
		MorePage mymore= new MorePage();
		mymore.clickeStatementsIcon();		
		eStatementsPage myestatements= new eStatementsPage();
		myestatements.ValidateEStatementPage();
	
	}

}
