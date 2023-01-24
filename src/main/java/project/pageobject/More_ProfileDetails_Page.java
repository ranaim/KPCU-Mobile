package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_ProfileDetails_Page  extends SeleniumUtils{
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeButton[@name='navbarBackIconDark']")
	public MobileElement back_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Profile']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='My Profile']")
	public MobileElement myProfile_Title;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Change Address and Phone Number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Change Address and Phone Number']")
	public MobileElement changeAddressAndPhoneNumber;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Change Email Address']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Change Email Address']")
	public MobileElement changeEmailAddress;
	
	
	public void verify_ProfileDetails(){
		defaultWait(10);
		validate_Element_Enabled(back_Btn,"back_Btn");
		validate_Element_Enabled(myProfile_Title,"myProfile_Title");
		validate_Element_Enabled(changeAddressAndPhoneNumber,"changeAddressAndPhoneNumber");
		validate_Element_Enabled(changeEmailAddress,"changeEmailAddress");
	}

}
