package project.tests;


import org.testng.annotations.Test;


import project.pageobject.AccountsPage;
import project.pageobject.CheckingAccountPage;
import project.pageobject.LoginPage;
import project.pageobject.PopUp_Transfer;
import project.pageobject.Transfers;


public class MoveMoneyTests extends BaseTest
{
		
	
	@Test(groups={"regression"})
	public void validate_MoveMoneyPage() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		CheckingAccountPage checkingPage = accountsPage.clickCheckingAcctBox();
		PopUp_Transfer transfer = checkingPage.clickTransferOutIcon();
		Transfers transfers =  transfer.gotoTransfersPage("transferin");
		transfers.enterAmount("0.1");
	}
	
	

}
