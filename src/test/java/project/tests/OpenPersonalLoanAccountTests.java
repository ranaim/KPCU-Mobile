package project.tests;
import org.testng.annotations.Test;


import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.OpenAccountPage;

@Test(groups={"regression"})
public class OpenPersonalLoanAccountTests extends BaseTest
{
	
	@Test
	public void OpenPersonalAccount() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		OpenAccountPage accountPage = accountsPage.clickOpenAccountIcon();		
		accountPage.ValidateOpenPersonalLoanAccount();
		accountPage.validatePersonalLoanPage();	
	

    }
	
}
