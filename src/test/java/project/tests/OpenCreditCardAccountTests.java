package project.tests;
import org.testng.annotations.Test;

import com.managers.PropertiesManager;

import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.OpenAccountPage;


@Test(groups={"regression"})
public class OpenCreditCardAccountTests extends BaseTest
{
	@Test
	public void OpenCreditCardAccount() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		OpenAccountPage accountPage = accountsPage.clickOpenAccountIcon();		
		accountPage.OpenCreditCardAccount();
		accountPage.validateCreditCardLoanPage();
	}
}
