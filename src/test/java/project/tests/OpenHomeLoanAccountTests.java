package project.tests;
import org.testng.annotations.Test;

import com.managers.PropertiesManager;

import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.OpenAccountPage;

@Test(groups={"regression"})
public class OpenHomeLoanAccountTests extends BaseTest
{
	
	@Test
	public void OpenHomeLoanAccount() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		OpenAccountPage accountPage = accountsPage.clickOpenAccountIcon();		
		accountPage.ValidateHomeLoanAccount();
		accountPage.validateFirstMortgageLink();
		
	}

}
