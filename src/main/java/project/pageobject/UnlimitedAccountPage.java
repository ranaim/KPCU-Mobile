package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;



public class UnlimitedAccountPage extends SeleniumUtils {
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'title')])[1]")
    @iOSXCUITFindBy(accessibility = "BankingOn.AFAccountPageView")
    public MobileElement accountNameTitle;
    
    @AndroidFindBy(id = "primaryBalanceTitle")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Available Balance'`]")
    public MobileElement availBalanceTitle;
    
    @AndroidFindBy(id = "right_title")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Current Balance'`]")
    public MobileElement currentBalanceTitle;
    
    @AndroidFindBy(id = "accounts_estatements_btn")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public MobileElement eStatementsIcon;
    
    @AndroidFindBy(id = "accounts_details_btn")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
    public MobileElement detailsIcon;
    
    @AndroidFindBy(id = "accounts_transfer_in_btn")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
    public MobileElement orderChecksIcon;
    
    @AndroidFindBy(id = "accounts_transfer_out_btn")
    @iOSXCUITFindBy(accessibility = "transferOut")
    public MobileElement transferOutIcon;
    
    

    
    public void validate_UnlimitedAccount_Details()
    {
    	defaultWait(15);
    	logMessage("Validate Unlimited Account Page:");
    	logMessage("================================");    	
    	validate_Element_Enabled(accountNameTitle,"Name Title");
    	//validate_Element_Enabled(availBalanceTitle,"Balance Title");
    	validate_Element_Enabled(currentBalanceTitle,"Current Balance Title");
    	validate_Element_Enabled(eStatementsIcon,"E Statement Icon");
    	validate_Element_Enabled(detailsIcon,"Details Icon");
    	validate_Element_Enabled(orderChecksIcon,"OrderCheck Icon");
    	//validate_Element_Enabled(transferOutIcon,"Transfer Out Icon");
    }

	 public Popup_AccountDetailsPage gotToAccountDetailsPage() throws Exception{
    	click(detailsIcon,"Account Details Button");
    	return new Popup_AccountDetailsPage();
    }
    
    
    
    
    
}
