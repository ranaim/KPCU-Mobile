package project.pageobject;


import java.util.List;

import org.openqa.selenium.By;

import com.managers.DriverManager;
import com.managers.GlobalParams;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;


public class MorePage extends SeleniumUtils {
    
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='More'])[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'More' AND name == 'More'")
    private MobileElement moreTitle;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Log out')]")
    @iOSXCUITFindBy(accessibility = "logout")
    private MobileElement logoutBtn;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'HIGHLIGHTED FEATURES')]")
    @iOSXCUITFindBy(accessibility = "HIGHLIGHTED FEATURES")
    private MobileElement highlightedFeaturesTitle;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'eStatements')]")
    @iOSXCUITFindBy(accessibility = "eStatements")
    private MobileElement eStatementsLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    @iOSXCUITFindBy(accessibility = "ATM/Branches")
    private MobileElement atmBranchesLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Contact Us')]")
    @iOSXCUITFindBy(accessibility = "Contact Us")
    private MobileElement contactUsLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Manage Money')]")
    @iOSXCUITFindBy(accessibility = "Manage Money")
    private MobileElement manageMoneyLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Pay Bills')]")
    @iOSXCUITFindBy(accessibility = "Pay Bills")
    private MobileElement payBillsLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'FICO® Score')]")
    @iOSXCUITFindBy(accessibility = "FICO® Score")
    private MobileElement ficoScoreLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SETTINGS')]")
    @iOSXCUITFindBy(accessibility = "SETTINGS")
    private MobileElement settingsTitleLnk;
    
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Profile Details')])|(//android.widget.TextView[contains(@text,'Profile')])")
    @iOSXCUITFindBy(accessibility = "Profile Details")
    private MobileElement profileDetailsLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Alerts')]")
    @iOSXCUITFindBy(accessibility = "Alerts")
    private MobileElement alertsLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Open Account/Loan')]")
    @iOSXCUITFindBy(accessibility = "Open Account/Loan")
    private MobileElement openAcctLoanLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Check Application Status')]")
    @iOSXCUITFindBy(accessibility = "Check Application Status")
    private MobileElement checkAppStatusLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Fast Balances')]")
    @iOSXCUITFindBy(accessibility = "Fast Balances")
    private MobileElement fastBalancesLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Income')]")
    @iOSXCUITFindBy(accessibility = "Income")
    private MobileElement incomeLnk;
    
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text,'Stop Payment on a Check')])|(//android.widget.TextView[contains(@text,'Stop Payment')])")
    @iOSXCUITFindBy(accessibility = "Stop a Check Payment")
    private MobileElement stopCheckPmtLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Text Banking')]")
    @iOSXCUITFindBy(accessibility = "Text Banking")
    private MobileElement textBankingLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Session Activity')]")
    @iOSXCUITFindBy(accessibility = "Session Activity")
    private MobileElement sessionActivityLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SECURITY')]")
    @iOSXCUITFindBy(accessibility = "SECURITY")
    private MobileElement securityTitle;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'SECURITY')]")
    @iOSXCUITFindBy(accessibility = "Security Settings")
    private MobileElement securitySettingsLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'LEGAL')]")
    @iOSXCUITFindBy(accessibility = "LEGAL")
    private MobileElement legalTitle;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'About')]")
    @iOSXCUITFindBy(accessibility = "About")
    private MobileElement aboutLnk;
    
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay Bills']/../..")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Pay Bills']")
     public MobileElement payBills;
     
     @AndroidFindBy(xpath="//android.widget.TextView[@text='FICO® Score']/../..")
     @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='FICO® Score']")
     public MobileElement ficoScore;
     
     @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile Details']/../..")     
     public MobileElement profileDetails;
     
     
     @AndroidFindBy(xpath="//*[@content-desc='First Mortgage and Home Equity']")
     public MobileElement firstMortagageLink;
     
     @AndroidFindBy(xpath="//*[@content-desc='All other products including Home Equity Line of Credit']")
     public MobileElement allOtherProducts;
        
    
     @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Forms']") 
     @iOSXCUITFindBy(accessibility = "Forms")
     private MobileElement forms;
     
     @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Update Username and Password\"]")
     private MobileElement updateUserNamePwd;
     
     // Forms Controls
     @AndroidFindBy(xpath="//android.webkit.WebView")
     @iOSXCUITFindBy(iOSNsPredicate = "label == 'ATM Rebate'")
     private MobileElement forms_ATMRebatesBtn;
     
     @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'ATM Rebate Form'`]")    
     private MobileElement forms_ATMRebatesFormControl;
     
     @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'KPCU Cards')]")
     @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='KPCU Cards']/..")
     private MobileElement kpcuCardsButton; 
     
     @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Card Activation')]")
     @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Card Activation']/..")
     private MobileElement cardActiationBtn; 
     
     @iOSXCUITFindBy(accessibility = "KeyPoint Card Manager")
     @AndroidFindBy(xpath="//android.widget.Button[@text='Sign in']")
     private MobileElement keyPointIn_Header_AppStore;     
     
     @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Wires, Forms, & Requests\"]/..)|(//android.widget.TextView[@text=\"Wires and Other Requests\"]/..)")
     @AndroidFindBy(xpath= "(//android.widget.TextView[@text='Wires and Other Requests'])|(//android.widget.TextView[@text='Wires, Forms, & Requests'])")
     private MobileElement wiresFromsAndRequestBtn;      
     
     @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let's activate your card\"]")
     @AndroidFindBy(xpath="(//android.view.View[@text=\"Let's activate your card\"])| (//android.widget.TextView[@text=\"Let's activate your card\"])")
     private MobileElement activateCard_Header;
     
     
     public More_PayBills_Page gotoPaybills() throws Exception{
     	click(payBills,"Pay Bills Button");
     	return new More_PayBills_Page();     	
     }
     
     public More_FICO_Score_Page gotoficoScore() throws Exception{
     	click(ficoScore,"FICO Score Button");
     	return new More_FICO_Score_Page();
     }

     public More_ProfileDetails_Page gotoProfileDetails() throws Exception{
     	click(profileDetails,"Profile Details Button");
     	return new More_ProfileDetails_Page();
     }
    
    public ATMBranchPage clickATMBranchIcon()  throws Exception{
        click(atmBranchesLnk,"ATM Branch Icon");
        return new ATMBranchPage();
    }
    
    public eStatementsPage clickeStatementsIcon()  throws Exception{
        click(eStatementsLnk,"eStatements Icon");
        return new eStatementsPage();
    }
    
    public ContactUsPage clickContactUsIcon()  throws Exception{
        click(contactUsLnk,"Contact Us Icon");
        return new ContactUsPage();
    }
    
    
    public void validateMorePage() throws Exception
    {
    	defaultWait(10);
    	logTitleMessage("Validate More Page");
    	validate_Element_Displayed(moreTitle,"More Title");
    	validate_Element_Displayed(highlightedFeaturesTitle,"Highlighted Features Title");
    	
    	validate_Element_Displayed(eStatementsLnk,"estatement Link");    	
    	validate_Element_Displayed(kpcuCardsButton,"KPCU Cards");
    	validate_Element_Displayed(cardActiationBtn,"Card Activation");
    	validate_Element_Displayed(atmBranchesLnk,"ATM Branches Link");
    	validate_Element_Displayed(contactUsLnk,"Contact Us Link");
    	validate_Element_Displayed(ficoScoreLnk,"Fico Score Link");
    	
    	//Products
    	validate_Element_Displayed(openAcctLoanLnk,"Open Account Loan Link");
    	//check application status has browser validation
    	
    	//Services    	
    	validate_Element_Displayed(alertsLnk,"Alerts Link");
    	// ADDING SCROLL UP
    	scrollUp("Page","Manage Money"); 
    	validate_Element_Displayed(manageMoneyLnk,"Manage Money Link");    	
    	scrollDown("Page","Profile");
    	//validate_Element_Displayed(stopCheckPmtLnk,"Stop a Check Payment Link"); 
    	validate_Element_Displayed(wiresFromsAndRequestBtn,"Wires Form and Request");
    	
    	//Setting
    	//scrollDown("Page","SETTINGS"); 
    	validate_Element_Displayed(settingsTitleLnk,"SETTINGS Link"); 
    	validate_Element_Displayed(profileDetailsLnk,"Profiles Detail Link");     	
    	validate_Element_Displayed(fastBalancesLnk,"Fast Ballances Link"); 
    	//validate_Element_Displayed(payBillsLnk,"Bill Pay Link");
    	    	
    	scrollUp("Page","Alerts"); 	
    	checkApplicationStatus();    	
    	
    	if(GlobalParams.getPlatformName().toLowerCase().equals("ios"))
    	{
    		//Setting Section
    		defaultWait(10);
    		scrollDown("Page","Income");    
    		/*if(!isDisplayed(stopCheckPmtLnk))
    		scrollDown("Page","Income"); */
    		validate_Element_Displayed(incomeLnk,"Income Link "); 
    		validate_Element_Displayed(textBankingLnk,"Text Banking Link");
    		
    		//Security
    		scrollDown("Page","SECURITY");
    		validate_Element_Displayed(securityTitle,"Security Link");
    		validate_Element_Displayed(updateUserNamePwd," Update UserName and Password");
    		validate_Element_Displayed(sessionActivityLnk,"Session Activity Link");
    		
    		//Legal
    		scrollDown("Page","LEGAL");
    		validate_Element_Displayed(legalTitle,"Legal Title");
    		//validate_Element_Displayed(securitySettingsLnk,"Security Settings Link");
    		validate_Element_Displayed(aboutLnk,"About Link");
    	}
    	else
    	{
    		// Specific funcationality
    		logMessage("More funcionality is Not avalialable in Android Platform");
    	}
    	  	 	 	
    }
    
    public void checkApplicationStatus() throws Exception{
    	if(!GlobalParams.getPlatformName().toLowerCase().equals("ios")){
    		validate_Element_Displayed(checkAppStatusLnk,"Check Application Status Link");
    		defaultWait(5);
    		click(checkAppStatusLnk,"Check Application Status Link");
    		validate_Element_Displayed(firstMortagageLink,"First Mortagage Link");
    		validate_Element_Displayed(allOtherProducts,"All Other Products Link");
    		click(firstMortagageLink,"First Mortgage Link");
        	switchToBrowser();
        	defaultWait(3);
    		/*String url = DriverManager.getDriver().getCurrentUrl();
    		logMessage(url+" is displayed");*/
    	}
    }
    
    public More_Alerts_Page goto_alerts_page() throws Exception{
    	click(alertsLnk,"Alert Link");
    	return new More_Alerts_Page();
    }
    
    public More_OpenAccount_OR_Loans_Page goto_openAccountsORMore_Page()throws Exception{
    	click(openAcctLoanLnk,"OpenAccounts Or Loan Link");
    	return new More_OpenAccount_OR_Loans_Page();
    }

    public More_Check_Application_Status_Page goto_CheckApplication_status() throws Exception{
    	click(checkAppStatusLnk,"Check Application Status Link");    	
		return new More_Check_Application_Status_Page();
    }

public More_FastBalances_Page goto_FastBalances()throws Exception{
	click(fastBalancesLnk,"Fast Ballances Link");
	int rating = 1;
	defaultWait(3);
	List<MobileElement> elements = DriverManager.getDriver().findElements(By.xpath("(//android.widget.ImageView)"));
	click(elements.get(rating-1),rating+": Rated");
	return new More_FastBalances_Page();
}

public More_Income_Page got_Income()throws Exception{
	defaultWait(10);
	scrollDown("Page","Income");
	click(incomeLnk,"Income Link ");
	return new More_Income_Page();
}

public More_Stop_Check_Payments_Page got_StopCheck_Payments_Page()throws Exception{
	defaultWait(10);
	scrollDown("Page","Income");
	click(stopCheckPmtLnk,"Stop a Check Payment Link");
	return new More_Stop_Check_Payments_Page();
}

public More_Text_banking_Page goto_Text_Bankinng()throws Exception{
	defaultWait(10);
	scrollDown("Page","Income");
	click(textBankingLnk,"Text Banking Link");	
	return new More_Text_banking_Page();
}

public More_SessionActivity_Page got_SessionActivity()throws Exception{
	defaultWait(10);
	scrollDown("Page","Income");
	click(sessionActivityLnk,"Session Activity Link");	
	return new More_SessionActivity_Page();
}

public More_SecuritySetting_Page goto_SecuritySetting()throws Exception{
	defaultWait(10);
	scrollDown("Page","Income");
	click(securitySettingsLnk,"Security Link");
	return new More_SecuritySetting_Page();
}

public More_About_Page goto_About()throws Exception{
	defaultWait(10);
	scrollDown("Page","Income");
	click(aboutLnk,"About Link");
	return new More_About_Page();
}
 

public void validateForms() throws Exception{
	defaultWait(5);
	scrollDown("Page","Income");
	defaultWait(3);
	click(forms,"Forms");
	switchToBrowser();
	defaultWait(2);
	validate_Element_Enabled(forms_ATMRebatesBtn,"ATM Rebate Button");
	click(forms_ATMRebatesBtn,"ATM Rebate Button");
	defaultWait(2);
	validate_Element_Enabled(forms_ATMRebatesFormControl,"ATM rebate form control");	
}

public void clickAndVerifyKPCUCardsActions()  throws Exception{
    click(cardActiationBtn,"Cards Activation Button");     
	switchToBrowser();
	defaultWait(1);
    validate_Element_Displayed(activateCard_Header,"Activate Card Header");
}

	public void clickAndVerifyKPCUCards()  throws Exception{
		click(kpcuCardsButton,"KPCU Cards Icon");		
		switchToBrowser();
		defaultWait(1);
		validate_Element_Enabled(keyPointIn_Header_AppStore, "Kepoint Manager Header");
	}

	
	public void clickAndVerifyWireFormsAndRequest() throws Exception{		
		//scrollDown("Page","Manage Money");		
		//scrollDown("Page","Wires and Other Requests");
		scrollDown("Page","Wires");
		defaultWait(1);
		click(wiresFromsAndRequestBtn,"Wires Form and Request");
		switchToBrowser();
		//defaultWait(3);
		/*@SuppressWarnings("unchecked")
		List<MobileElement> elements = DriverManager.getDriver().findElements(By.xpath("(//XCUIElementTypeOther[@name=\"Keypoint Online Banking Forms\"]//XCUIElementTypeButton[@name])|(//android.view.View[@resource-id='pnlFormsList']//android.widget.Button)"));
		boolean bln = elements.size()>=6 ? true:false;		
		assertCondition(bln,"Buttons were not diplayed on browser");
		for(MobileElement e : elements){
			logMessage(e.getText()+" : Button Displayed ");
		}*/
			
	}
}


