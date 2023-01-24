package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_FICO_Score_Page extends SeleniumUtils{
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	@iOSXCUITFindBy(accessibility = "navbarBackIconDark")	
	public MobileElement back_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My FICO Score']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='My FICO Score']")
	public MobileElement myFicoScore_Title;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='M_M_contentAreaContainer']")	
	public MobileElement content;
	
	
	public void verify_FICO_Score(){
		validate_Element_Enabled(back_Btn,"back_Btn");
		validate_Element_Enabled(myFicoScore_Title,"myFicoScore_Title");
		//validate_Element_Enabled(content,"content");
	}

}
