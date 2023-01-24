package project.pageobject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;



public class AccountsPage extends SeleniumUtils {
    
	@AndroidFindBy(id = "greeting_name")
    @iOSXCUITFindBy(accessibility = "Marisol")
    public MobileElement userLbl;
	
    @AndroidFindBy(id = "header_title")
    @iOSXCUITFindBy(accessibility = "ACCOUNTS")
    public MobileElement titleTxt;
    
    @AndroidFindBy(id = "avatar_button")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"accountsPage\"`]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
    public MobileElement avatarImg;
    
    @AndroidFindBy(id = "account_logout_button")
    @iOSXCUITFindBy(accessibility = "logout")
    public MobileElement logoutBtn;
    
    @AndroidFindBy(id = "header_account_button")    
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == '+ Open a New Account'`]")
    public MobileElement OpenaNewAccountLink;
    
    @AndroidFindBy(id = "title")
    public MobileElement acctTitleTxt;
    
    @AndroidFindBy(id = "dollars")
    public MobileElement dollarsTxt;
    
    @AndroidFindBy(id = "cents")
    public MobileElement centsTxt;
    
    @AndroidFindBy(id = "account_info_value")
    public MobileElement availBalanceLnk;
    
    @AndroidFindBy(id = "btnShortcut")
    public MobileElement btnShortcutImg;
    
    @AndroidFindBy(id = "body")
    @iOSXCUITFindBy(accessibility = "checkingAccount")
    public MobileElement checkingAcctBox;
    
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell[@name='checkingAccount'])[2]")
    public MobileElement unlimitedAcctBox;
    
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]")
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeCell[`name == 'savingsAccount'`]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public MobileElement SmartAcctBox;
    
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'title')])[5]")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == 'liabilityAccount'`]")
    public MobileElement LocUnsecuredAcctBox;
    
    @AndroidFindBy(id = "body")
    @iOSXCUITFindBy(accessibility = "savingsAccount")
    public MobileElement savingsAcctBox;
    
    @AndroidFindBy(id = "accounts_list_view")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView[`name == \"accounts\"`]")
    private MobileElement accountsListViewImg;
    
    @AndroidFindBy(accessibility = "Accounts")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Accounts\"`]")
    public MobileElement accountsIcon;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Accounts\"]/android.widget.ImageView")
    public MobileElement accountsIconImg;
    @AndroidFindBy(id = "largeLabel")
    public MobileElement accountsIconTxt;
    
    @AndroidFindBy(accessibility = "Deposit")
    @iOSXCUITFindBy(accessibility = "rdc")
    public MobileElement DepositIconImg;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Deposit\"]/android.widget.ImageView")
    public MobileElement depositIconImg;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Deposit\"]/android.view.ViewGroup")
    public MobileElement depositIconTxt;
    
    @AndroidFindBy(accessibility = "Move Money")    
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'Move Money'`]")
    public MobileElement moveMoneyIcon;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Move Money\"]/android.widget.ImageView")
    public MobileElement moveMoneyImg;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Move Money\"]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement moveMoneyTxt;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='More']")    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='more']")
    public MobileElement moreIcon;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")
    public MobileElement moreImg;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"More\"]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement moreTxt;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Open Account/Loan']")
    @AndroidFindBy(accessibility = "com.kpcu.mobile.uat:id/header_account_button")
    public MobileElement openaccountheader;
    
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'Open Account/Loan'`]/XCUIElementTypeButton")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    public MobileElement closeOpenAccountPopup;
    
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'Ok'`]")
    public MobileElement okbtn;   
   
    
    public String getUserLbl() {
        return wait.until(ExpectedConditions.visibilityOf(userLbl)).getText();
    }

    public String getTitleTxt() { return wait.until(ExpectedConditions.visibilityOf(titleTxt)).getText(); }

    public OpenAccountPage clickOpenAccountIcon() throws Exception{
    	 click(OpenaNewAccountLink,"Open New Account Link");
         return new OpenAccountPage();
    	
    }

    public MoveMoneyPage clickMoveMoneyIcon() throws Exception{
        click(moveMoneyIcon,"Move Money");
        return new MoveMoneyPage();
    }
    
    public DepositPage clickDepositIcon() throws Exception{
        click(DepositIconImg,"Deposit Icon");
        return new DepositPage();
    }
  
    
    public MorePage clickMoreIcon()  throws Exception{
    	isDisplayed(moreIcon,"More Icon");
        click(moreIcon,"More Icon");
        return new MorePage();
    }  
    
    
    public CheckingAccountPage clickCheckingAcctBox()  throws Exception{
    	defaultWait(10);
    	click(checkingAcctBox,"Checking Account");
    	return new CheckingAccountPage();
    }

    public SavingsAccountPage clickSavingsAcctBox() throws Exception{
    	defaultWait(10);
    	click(savingsAcctBox,"Savings Account");
    	return new SavingsAccountPage();
    }
    
    
    public UnlimitedAccountPage clickUnlimitedAcctBox() throws Exception{
    	defaultWait(10);
    	click(unlimitedAcctBox,"Unlimited Account");
    	return new UnlimitedAccountPage();
    }
    
    public SmartAccountPage clickSmartAcctBox() throws Exception{
    	defaultWait(10);
    	click(SmartAcctBox,"Smart Account");
    	return new SmartAccountPage();
    }
    
    public LocUnsecuredVariableAccountPage clickLocUnsecuredAcctBox() throws Exception{
    	defaultWait(10);
    	click(LocUnsecuredAcctBox,"Loc Unsecured Account");
    	return new LocUnsecuredVariableAccountPage();
    }
    public void validate_Account()  throws Exception{ 
    	logTitleMessage("Validate Account Page");
    	defaultWait(10);
    	validate_Element_Enabled(moveMoneyIcon,"Move Money");
    	validate_Element_Enabled(DepositIconImg,"Account Link");
    	validate_Element_Enabled(moreIcon,"More Icon");
    	validate_Element_Enabled(logoutBtn,"Logout Icon");
    	validate_Element_Enabled(OpenaNewAccountLink,"Open New Account Link");
    	//click(OpenaNewAccountLink,"Open New Account clicked");
    	//validate_Element_Displayed(openaccountheader,"Open Account/Loan header");
    	//click(closeOpenAccountPopup," Close open Account popup");   	
    		
    }
    
    
    
    /*public void logOut() throws InterruptedException{
    	//Thread.sleep(10000);
    	System.out.println("Logut method");
    	wait.until(ExpectedConditions.visibilityOf(logoutBtn)).click();
    }
    
    public DepositPage GotoDipostePage(){
    	wait.until(ExpectedConditions.visibilityOf(accountsLink)).click();
    	return new DepositPage();
    }
    
    public MoveMoneyPage GotoMoveMoneyPage(){
    	wait.until(ExpectedConditions.visibilityOf(moveMoneyIcon)).click();
    	return new MoveMoneyPage();
    }
   
    public MorePage GotoMorePage(){
    	wait.until(ExpectedConditions.visibilityOf(moreIcon)).click();
    	return new MorePage();
    }*/
    
}
