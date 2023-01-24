package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class Popup_AccountDetailsPage extends SeleniumUtils {
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Account Details']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Account Details'`]")
    private MobileElement accountDetailsTitle;
    
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'Account Details'`]/XCUIElementTypeButton")
    private MobileElement popupClose;
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Name']")
    @iOSXCUITFindBy(accessibility = "Account Name")
    private MobileElement accountNameLabel;
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Available Balance']")
    @iOSXCUITFindBy(accessibility = "Available Balance")
    private MobileElement availableBalanceLabel;
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Current Balance']")
    @iOSXCUITFindBy(accessibility = "Current Balance")
    private MobileElement currentBalanceLable;
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Number']")
    @iOSXCUITFindBy(accessibility = "Account Number")
    private MobileElement accountNumberLabel;
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Routing Number']")
    @iOSXCUITFindBy(accessibility = "Routing Number")
    private MobileElement routingNumberLabel;
    
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Opened']")
    @iOSXCUITFindBy(accessibility = "Date Opened")
    private MobileElement dateOpenedLabel;
    
    public void validateAccountDetailsPage(){
    	logTitleMessage("Validate Account Details Popup Page :");
    	validate_Element_Displayed(accountDetailsTitle,"Account Details Label");
    	validate_Element_Displayed(popupClose," Close Button");
    	validate_Element_Displayed(accountNameLabel,"Account Name Label");
    	//validate_Element_Displayed(availableBalanceLabel,"Available Balance Lable");
    	validate_Element_Displayed(currentBalanceLable,"Current Balance Lable");
    	validate_Element_Displayed(accountNumberLabel,"AccountNumber Lable");
    	validate_Element_Displayed(routingNumberLabel,"Routing Number Lable");
    	validate_Element_Displayed(dateOpenedLabel,"Date Opened Label");
    	
    }

}
