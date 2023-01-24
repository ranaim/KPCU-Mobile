package project.tests;
import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.OpenAccountPage;

@Test(groups={"regression"})
public class OpenIRAsHSAsAccountTests extends BaseTest
{

	@Test
	public void OpenIRAS_HSAs_Account() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		OpenAccountPage accountPage = accountsPage.clickOpenAccountIcon();		
		accountPage.ValidateIRAs_HSAsAccount();
		accountPage.validateRetirementCentralLink();
	}

}
