
package project.tests;

import org.testng.annotations.Test;

import project.pageobject.ATMBranchPage;
import project.pageobject.AccountsPage;
import project.pageobject.LoginPage;
import project.pageobject.MorePage;
import project.pageobject.More_About_Page;
import project.pageobject.More_Alerts_Page;
import project.pageobject.More_Check_Application_Status_Page;
import project.pageobject.More_FICO_Score_Page;
import project.pageobject.More_FastBalances_Page;
import project.pageobject.More_Income_Page;
import project.pageobject.More_OpenAccount_OR_Loans_Page;
import project.pageobject.More_PayBills_Page;
import project.pageobject.More_ProfileDetails_Page;
import project.pageobject.More_SecuritySetting_Page;
import project.pageobject.More_SessionActivity_Page;
import project.pageobject.More_Stop_Check_Payments_Page;
import project.pageobject.More_Text_banking_Page;


@Test(groups={"regression2"})
public class MoreTests extends BaseTest {

	@Test
	public void validate_ATMBranchPage() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();		
		MorePage mymore = accountsPage.clickMoreIcon();
		ATMBranchPage myATM = mymore.clickATMBranchIcon();
		myATM.ValidateATMBranchPage();
		
	}

	@Test
	public void validate_MorePage_Paybills() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();	
		More_PayBills_Page paybills = morepage.gotoPaybills();
		paybills.verifyPabills();
	}
	
	@Test
	public void validate_MorePage_FICOScores() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_FICO_Score_Page ficoScore = morepage.gotoficoScore();
		ficoScore.verify_FICO_Score();
	}
	
	@Test
	public void validate_MorePage_ProfileDetails() throws Exception
	{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_ProfileDetails_Page profileDetails =  morepage.gotoProfileDetails();
		profileDetails.verify_ProfileDetails();
	}
	
	@Test
	public void validate_Alerts() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_Alerts_Page alerts = morepage.goto_alerts_page();
		alerts.validate_AlertsPage();
	}
	
	@Test
	public void validate_OpenAccount_OR_Loans() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_OpenAccount_OR_Loans_Page accounts = morepage.goto_openAccountsORMore_Page();
		accounts.Validate_More_OpenAccount_or_loans_page();
		
		
	}
	
	
	@Test
	public void validate_Check_Application_Status() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_Check_Application_Status_Page checkAppStatus = morepage.goto_CheckApplication_status();	
		checkAppStatus.Validate_Check_Application_Status_page();
		
	}
	
	@Test
	public void validate_FastBalances() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_FastBalances_Page fast = morepage.goto_FastBalances();
	}
	
	@Test
	public void validate_Income() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_Income_Page income = morepage.got_Income();
	}
	
	@Test
	public void validate_Stop_Check_Payments() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_Stop_Check_Payments_Page stop = morepage.got_StopCheck_Payments_Page();
	}
	
	@Test
	public void validate_Text_banking() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_Text_banking_Page text = morepage.goto_Text_Bankinng();
	}
	
	@Test
	public void validate_SessionActivity() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_SessionActivity_Page session = morepage.got_SessionActivity();
	}
	
	@Test
	public void validate_SecuritySetting() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_SecuritySetting_Page security = morepage.goto_SecuritySetting();
	}
	
	@Test
	public void validate_About() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		More_About_Page about = morepage.goto_About();
	}
	
	@Test
	public void validate_KPCUCards() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.clickAndVerifyKPCUCards();
	}
	
	@Test
	public void validate_CardActions() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.clickAndVerifyKPCUCardsActions();
	}
	
	@Test
	public void validate_Wire_Forms_Request() throws Exception{
		AccountsPage accountsPage = new LoginPage()
                .login();
		Thread.sleep(1000);
		MorePage morepage =  accountsPage.clickMoreIcon();
		morepage.clickAndVerifyWireFormsAndRequest();
	}
	 
}