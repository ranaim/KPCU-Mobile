package project.tests;

import org.testng.annotations.Test;

import project.pageobject.AccountsPage;
import project.pageobject.ContactUsPage;
import project.pageobject.LoginPage;
import project.pageobject.MorePage;
import project.utils.ExtentReport;


public class ContactUs_Tests extends BaseTest
{
	
	/*@Test
	public void validate_ContactUs_Page() throws Exception
	{
		ExtentReport.LogInfo("Contact Us Page Validation");
		AccountsPage accountsPage = new LoginPage()
                .login();
		
		accountsPage.clickMoreIcon();
		
		MorePage mymore= new MorePage();
		mymore.clickContactUsIcon();
		
		ContactUsPage mycontact= new ContactUsPage();
		mycontact.ValidateContactUs_Page();
			
	}*/
	
	@Test(groups={"regression"})
	public void validate_feedback_ContactUs_Page() throws Exception
	{
		//ExtentReport.LogInfo("Contact Us with Feedback Page Validation");
		AccountsPage accountsPage = new LoginPage()
                .login();
		
		MorePage mymore= accountsPage.clickMoreIcon();
		ContactUsPage contact=  mymore.clickContactUsIcon();
		contact.ValidateContactUs_Page();
		
		//Feedback Page
		contact.gotoFeedBackPage();		
		contact.validateFeedback();
		contact.valiteMessage();
		
	}
}
