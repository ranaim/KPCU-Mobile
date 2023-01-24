package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_Alerts_Page extends SeleniumUtils {

	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Yes' AND name == 'Yes' AND type == 'XCUIElementTypeButton'")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Alerts']")
    private MobileElement yes_btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Add Subscription']")
	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Add Subscription'")
    private MobileElement AddSubscrption_btn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text= 'VIEW ALERT HISTORY']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='View Alert History']")
    private MobileElement ViewAlertHistory_btn;
	
	
	
	@iOSXCUITFindBy(iOSNsPredicate = "label == 'click here' AND name == 'click here' AND value == ' to sign up.'")
    private MobileElement signUplink;
	
	
	public void validate_AlertsPage() {
		defaultWait(3);
		logTitleMessage("Validation: Alert Page");
		if(isDisplayed(yes_btn, "Yes Button")){
			validate_Element_Displayed(yes_btn, "Alert Yes Button");
			validate_Element_Displayed(AddSubscrption_btn, "Add Subscription Button");
		}
		else{
			validate_Element_Displayed(signUplink,"Sign Up Link");
		}
		
		//validate_Element_Displayed(ViewAlertHistory_btn, "View Alert History Button");
		
		
	}

}
