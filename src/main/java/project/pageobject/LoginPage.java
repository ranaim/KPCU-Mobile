package project.pageobject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.managers.GlobalParams;
import com.managers.PropertiesManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class LoginPage extends SeleniumUtils {
    
	@AndroidFindBy(id = "login")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == 'User ID'`]")
    private MobileElement loginFld;
    
    @AndroidFindBy(id = "password")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == 'Password'`]")
    //@iOSXCUITFindBy(xpath= "//XCUIElementTypeSecureTextField[@name='password']")
    private MobileElement passwordFld;
    
    @AndroidFindBy(id = "doLogin")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'LOG IN'`]")
    private MobileElement loginBtn;
    
    @AndroidFindBy(id = "forgotPassword")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Forgot Password?\"`]")
    private MobileElement forgotPasswordLnk;
    
    @AndroidFindBy(id = "imgShowPassword")
    @iOSXCUITFindBy(accessibility = "showPassword")
    private MobileElement showPasswordImg;
    @AndroidFindBy(id = "rememberUserId")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSwitch[`value == \"0\"`]")
    private MobileElement rememberUserIdSliderIcon;
    @AndroidFindBy(id = "rememberUserId")
    @iOSXCUITFindBy(accessibility = "Remember my User ID")
    private MobileElement rememberUserIdSliderTxt;
    @AndroidFindBy(id = "logo")
    @iOSXCUITFindBy(accessibility = "kpcu-login-logo")
    private MobileElement logoImg;
    @AndroidFindBy(id = "card")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"loginPage\"`]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private MobileElement centerCardBoxArea;
    @AndroidFindBy(id = "middleArea")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"loginPage\"`]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]")
    private MobileElement middleAreaImg;
    @AndroidFindBy(id = "atm_locator")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"ATM/Branches\"`]")
    private MobileElement atmLocatorArea;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/atm_locator\"]/child::android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "loginAtmBranchesIcon")
    private MobileElement atmLocatorImg;
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/atm_locator\"]/child::android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"ATM/Branches\"`]")
    private MobileElement atmLocatorTxt;
    
    @AndroidFindBy(id = "fastBalance")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Fast Balances\"`]")
    private MobileElement fastBalanceArea;
    
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/fast_balance\"]/child::android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Fast Balances\"`]")
    private MobileElement fastBalancesTxt;
    
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.kpcu.mobile.uat:id/fast_balance\"]/child::android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "loginFastBalanceIcon")
    private MobileElement fastBalancesImg;
    
    @AndroidFindBy(id = "contactUs")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Contact Us\"`]")
    private MobileElement contactUsArea;
    
    @AndroidFindBy(className = "//*[@classchain=\"com.kpcu.mobile.uat:id/contact_us\"]/child::android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "loginContactusIcon")
    private MobileElement contactUsImg;
    
    @AndroidFindBy(className = "//*[@resource-id=\"com.kpcu.mobile.uat:id/contact_us\"]/child::android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Contact Us\"`]")
    private MobileElement contactUsTxt;
    
    @AndroidFindBy(id = "register")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Register\"`]")
    private MobileElement registerLnk;
    
    @AndroidFindBy(id = "disclaimer")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Disclaimer\"`]")
    private MobileElement disclaimerLnk;
   
    @AndroidFindBy(id = "privacy")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Privacy/Legal\"`]")
    private MobileElement privacyLnk;
    
    
   // @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`xpath == //*[@name='Don’t Allow']"`]")
   // private MobileElement dontallowbutton;
    
    
    @iOSXCUITFindBy(iOSClassChain = "**/*[`label == 'Ok'`]")
    private MobileElement okBtn;


    public void enterUserName(String username)  throws Exception{
    	click(loginFld,"User Name");        
        sendkeys(loginFld,username,"User Name");        
    }

    public void enterPassword(String password) throws Exception { 
    	defaultWait(3);
        click(passwordFld,"Password");        
    	sendkeys(passwordFld,password,"Password");
    }

    
    public void clickOK(){
    	try{
        	okBtn.click();
        	logMessage("POP Up Ok Click Success");
        }
        catch(Exception e){
        	logMessage("POP UP' : "+e.getMessage());
        }
    }
    public AccountsPage pressLoginBtn()  throws Exception{
    	defaultWait(2);
        click(loginBtn,"LoginButton");
        defaultWait(1);        
        if (GlobalParams.getPlatformName().equalsIgnoreCase("iOS")) {			
			PopUp_Notifications popUp_notifications = new PopUp_Notifications();
			if (popUp_notifications.isPopUpLoaded()) {
				popUp_notifications.trnOnNotifBtn();
				PopUp_Notifications_Native_IOS popUp_notifications_native_ios = new PopUp_Notifications_Native_IOS();
				popUp_notifications_native_ios.allowNotifBtn();
			}
			PopUp_Location popUp_location = new PopUp_Location();
			if (popUp_location.isPopUpLoaded()) {
				popUp_location.pressLocationBtn();
				PopUp_Location_Native_IOS popUp_location_native_iOS = new PopUp_Location_Native_IOS();
				popUp_location_native_iOS.pressAllowWhileUsingAppBtn();
			}
		}
        return new AccountsPage();
    }

    public AccountsPage login() throws Exception {
    	String username = PropertiesManager.getUserName();
    	String password = PropertiesManager.getPassword();
        enterUserName(username);
        enterPassword(password);
        if (GlobalParams.getPlatformName().equalsIgnoreCase("Android"))
            hideKeyboard();        
        return pressLoginBtn();
    }

    public String getForgotMyPasswordTxt() {
        return wait.until(ExpectedConditions.visibilityOf(forgotPasswordLnk)).getText();
    }
    //******************************************************************************************//
   // public AccountsPage pressDontAllowbutton() {
   //     wait.until(ExpectedConditions.visibilityOf("//*[@name='Don’t Allow']").click();
    //    System.out.println("Dont Allow Button Entered");
    //    return new AccountsPage();
    //}
}
