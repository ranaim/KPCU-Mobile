package project.tests;


import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.OpenAccountPage;

@Test(groups={"regression"})
public class OpenVehicleAccountTests  extends BaseTest{
	
	
	
	@Test
	public void OpenVehicleAccount() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		OpenAccountPage accountPage = accountsPage.clickOpenAccountIcon();		
		accountPage.OpenVehicleAccount();
		accountPage.validateVehicleLoanPage();
	}

}
