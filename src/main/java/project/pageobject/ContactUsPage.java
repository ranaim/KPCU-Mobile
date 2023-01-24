package project.pageobject;

import java.util.ArrayList;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class ContactUsPage extends SeleniumUtils
{
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Contact Us'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact Us']")
    private MobileElement ContactUsTitle;

	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name,'kpcu-login-logo')]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,':id/keypoint_logo')]")
    private MobileElement KeypointLogo;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Contact Center'`]")
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Contact Center']")
    private MobileElement ContactCenter_Label;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == '(888) 255-3637'`][2]")
	@AndroidFindBy(id ="com.kpcu.mobile:id/phone1")
    private MobileElement Phone_Number;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == '(877) 393-1400 TTY'`][1]")
	@AndroidFindBy(id ="com.kpcu.mobile:id/phone2")
    private MobileElement TTY_Number;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'info@kpcu.com'`][2]")
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='info@kpcu.com']")
    private MobileElement Email_label;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Send Message']")
	@iOSXCUITFindBy(accessibility = "Send Message")
    private MobileElement SendMessage_Title;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Send Feedback']/..")
	@iOSXCUITFindBy(accessibility = "Send Feedback")
    private MobileElement SendFeedback;
	
	@iOSXCUITFindBy(accessibility = "KeyPoint Credit Union, 2805 Bowers Avenue, Santa Clara, CA 95051")
	@AndroidFindBy(id ="com.kpcu.mobile:id/map")
    private MobileElement Keypoint_Address;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`label == 'Feedback'`]")
	@AndroidBy(xpath="//android.widget.TextView[@text='Feedback']")
	private MobileElement feedbackTitle;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`label == 'Feedback'`]")
	@AndroidBy(xpath="//android.widget.TextView[@text='Feedback']")
	private MobileElement feedbackTitle_1;
	
	@iOSXCUITFindBy(accessibility = "Your feedback is very important to us. This way we can keep improving our app.")
	@AndroidBy(id="com.kpcu.mobile:id/textView18")
	private MobileElement feedbackDescription;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeNavigationBar[`name == 'Feedback'`]/XCUIElementTypeButton")
	@AndroidBy(xpath="//android.view.ViewGroup/android.widget.ImageButton")
	private MobileElement edbackTitle;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`value == 'Category'`]")
	@AndroidBy(xpath="//android.widget.TextView[@text='Categories']/..")
	private MobileElement categories;
	
	
	@AndroidBy(xpath="//android.widget.CheckedTextView[contains(@resource-id,'android:id/text')]")
	private ArrayList<MobileElement> categories_options;
	


    public void ValidateContactUs_Page() throws Exception
   {	
	defaultWait(10);
	logTitleMessage("Validate Contact Us Page");	
	validate_Element_Displayed(ContactUsTitle,"Contact us Title");    	
	//validate_Element_Displayed(KeypointLogo,"KeyPoint Logo");
	validate_Element_Displayed(ContactCenter_Label,"Contact Center Label");
	validate_Element_Enabled(Phone_Number,"Phone Number label");
	validate_Element_Enabled(TTY_Number,"TTY Number label");
	validate_Element_Enabled(Email_label,"Email label");
	validate_Element_Enabled(SendMessage_Title,"Send message label");
	validate_Element_Enabled(SendFeedback,"Send Feedback link");
	validate_Element_Enabled(Keypoint_Address,"Keypoint Address label");
   }
    
    public void gotoFeedBackPage() throws Exception{
    	 click(SendFeedback,"Send Feedback");
    }

   public void validateFeedback() throws Exception{	
	   defaultWait(15);
	   logTitleMessage("Feed Back Page Validation "+feedbackTitle_1);
	   validate_Element_Enabled(feedbackTitle_1,"feedback Title"); 
	   String msg = getText(feedbackDescription);	   
	   assertCondition(msg.contains("Your feedback is very important to us. This way we can keep improving our app."),"feedback message is "+msg);
	   click(categories,"categories");
	   //ArrayList<String> list = getAllText(categories_options);
	   //logMessage(list.toString());
	   
   }
   
   public void valiteMessage(){
	   
	   
	   
   }
   
    
   
   

}
