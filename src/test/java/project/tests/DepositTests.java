package project.tests;

import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.DepositPage;
import project.pageobject.LoginPage;

public class DepositTests extends BaseTest{

	
	
	@Test(groups={"regression"})
	public void validate_CheckDiposit() throws Exception
	{			
		AccountsPage accountsPage = new LoginPage()
                .login();
		DepositPage depositpage = accountsPage.clickDepositIcon();
		depositpage.checkDepositDemoLink();				
	}
}
