package project.pageobject;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.pageobject.Popup_AccountDetailsPage;
import project.utils.SeleniumUtils;


public class LocUnsecuredVariableAccountPage extends SeleniumUtils
{
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'title')])[1]")
    @iOSXCUITFindBy(accessibility = "BankingOn.AFAccountPageView")
    public MobileElement accountNameTitle;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'primaryBalanceTitle')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Available Balance'`]")
    public MobileElement availBalanceTitle;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'right_title')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Current Balance'`]")
    public MobileElement currentBalanceTitle;
    
    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'accounts_estatements_btn')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public MobileElement eStatementsIcon;
    
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'accounts_details_btn')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
    public MobileElement detailsIcon;
	
	public void validate_LocUnsecuredVariableAccount_Details()
    {
		defaultWait(15);
    	logMessage("Validate LOC Unsecured Variable Account Page : ");
    	logMessage("=============================================="); 
    	validate_Element_Enabled(accountNameTitle,"Name Title");
    	//validate_Element_Enabled(availBalanceTitle,"Balance Title");
    	validate_Element_Enabled(currentBalanceTitle,"Current Balance Title");
    	validate_Element_Enabled(eStatementsIcon,"E Statement Icon");
    	validate_Element_Enabled(detailsIcon,"Details Icon");
    }
	
	 public Popup_AccountDetailsPage gotToAccountDetailsPage() throws Exception
	 {
	    	click(detailsIcon,"Account Details Button");
	    	return new Popup_AccountDetailsPage();
	    }
	
	
}
