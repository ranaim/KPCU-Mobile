package project.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.managers.DriverManager;
import com.managers.GlobalParams;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class CheckingAccountPage extends SeleniumUtils {
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'title')])[1]")
    @iOSXCUITFindBy(accessibility = "BankingOn.AFAccountPageView")
    public MobileElement accountNameTitle;
    
    @AndroidFindBy(id = "primaryBalanceTitle")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Available Balance'`]")
    public MobileElement availBalanceTitle;
    
    @AndroidFindBy(id = "right_title")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Current Balance'`]")
    public MobileElement currentBalanceTitle;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='eStatements']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == 'transactionsPage'`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public MobileElement eStatementsIcon;
    
    @AndroidFindBy(xpath="//*[contains(@text,'eStatements')]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"eStatements Settings\"]")
    public MobileElement eStatementHeader;
    
    @AndroidFindBy(id = "accounts_details_btn")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == 'transactionsPage'`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
    public MobileElement detailsIcon;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Order Checks']")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == 'transactionsPage'`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
    public MobileElement orderChecksIcon;
    
    @AndroidFindBy(id = "accounts_transfer_out_btn")
    @iOSXCUITFindBy(accessibility = "transferOut")
    public MobileElement transferOutIcon;
    
    @AndroidFindBy(xpath= "(//android.widget.Image[contains(@text,'OrderMyChecks.com')])[1]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Quick Order'`]")
    public MobileElement quickOrder;
    
    
    //@AndroidFindBy(xpath="")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Select Accounts on which you AGREE to receive paperless statements. Deselect Accounts on which you AGREE to receive paper statements.'`]")
    public MobileElement Estatemet_Agreement;
    
    //@AndroidFindBy( )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'Account Details'`]/XCUIElementTypeButton")
    public MobileElement Close_Account_Details_Button;

    //@AndroidFindBy( )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Account Details'`]")
    public MobileElement Account_Details_Header;
    
    //@AndroidFindBy( )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'eStatements Settings'`]/XCUIElementTypeButton")
    public MobileElement Close_Estatement_Page_Button;
    
    //@AndroidFindBy( )
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == 'eStatements Settings'`]/XCUIElementTypeButton")
    public MobileElement Close_Transfer_Page_Button;
    
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Transfer')]")
    public MobileElement tranferPopup;
    
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Transfer Money'`]")
    public MobileElement Transfer_Money_Header;
    
    @AndroidFindBy(className="android.widget.ImageButton" )
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeNavigationBar[`name == 'Account Details'`]/XCUIElementTypeButton")
    public MobileElement backButton;
    
    @AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'button')]" )
    public List<MobileElement> transferInPopupButton; 
    
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`label == 'closeScreenIconDark' OR label =='CANCEL'`]")
   // @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`label == 'closeScreenIconDark'`]") 
    @AndroidFindBy(xpath="//android.widget.Button[contains(@text,'CANCEL')]" )
    public MobileElement transferInPopupCancelButton; 
    
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'account_title')]")
    @iOSXCUITFindBy(iOSNsPredicate ="label == 'Select Accounts on which you AGREE to receive paperless statements. Deselect Accounts on which you AGREE to receive paper statements.'")
    public MobileElement estatmentSubTitle; 
    
    
    
    public PopUp_Transfer clickTransferOutIcon() throws Exception {
        click(transferOutIcon,"Transfer Icon");
        return new PopUp_Transfer();
    }
    
    public void validate_CheckingAccount_Details()
    {
    	defaultWait(15);
    	logTitleMessage("Validate Checking Account Page"); 
    	//validate_Element_Enabled(accountNameTitle,"Name Title");
    	validate_Element_Enabled(availBalanceTitle,"Balance Title");
    	validate_Element_Enabled(currentBalanceTitle,"Current Balance Title");
    	validate_Element_Enabled(eStatementsIcon,"E Statement Icon");
    	validate_Element_Enabled(detailsIcon,"Details Icon");
    	validate_Element_Enabled(orderChecksIcon,"OrderCheck Icon");
    	validate_Element_Enabled(transferOutIcon,"Transfer Out Icon");
    }
    
    public Popup_AccountDetailsPage gotToAccountDetailsPage() throws Exception{
    	click(detailsIcon,"Account Details Button");
    	return new Popup_AccountDetailsPage();
    }
    
    public void verifyOrderChecks() throws Exception{
    	logTitleMessage("Order Checks");
    	click(orderChecksIcon,"OrderCheck Icon"); 
    	switchToBrowser();
    	defaultWait(5); 
    	//DriverManager.getDriver().manage().
    	logWithScreenShot("Quick Order In Browser","Quick Order");
    	validate_Element_Displayed(quickOrder,"Quick Order");   
    }
    
    public void verify_AccountbackButton_Details_Page() throws Exception{
    	click(detailsIcon,"Account Details Icon");
    	defaultWait(5);  
    	validate_Element_Enabled(Account_Details_Header,"Account Details header")  ;  	
    }    
    
    public void verify_eStatements() throws Exception{
    	logTitleMessage("E Stament Validation");
    	click(eStatementsIcon,"E Statement Icon");
    	/*if(isDisplayed(chromeLink, "Chrome Browser"))
    		switchToBrowser();    	
    	defaultWait(2); 
    	validate_Element_Enabled(eStatementHeader,"E Statement Header");
    	validate_Element_Enabled(estatmentSubTitle,"E Statement SubTitle");*/
    	
    }
    
    public void clickFeedBack(int rating) throws Exception{
    	click(eStatementsIcon,"E Statement Icon");
    	defaultWait(3);
    	if(GlobalParams.getPlatformName().equals("Android")){
    		List<MobileElement> elements = DriverManager.getDriver().findElements(By.xpath("(//android.widget.ImageView)"));
        	click(elements.get(rating-1),rating+": Rated");    		
    	}
    	else
    		logMessage("Feed Back is not working for IOS");
    	
    }
    
    public void verify_Transfer_Page() throws Exception{
    	logTitleMessage("Transfer");
    	click(transferOutIcon,"Transfer Icon");
    	defaultWait(5); 
    	if(isDisplayed(tranferPopup, "popup")){
    		for(int i=0;i< transferInPopupButton.size();i++){
        		validate_Element_Enabled(transferInPopupButton.get(i),transferInPopupButton.get(i).getText());
        		
        	}
    	}
    	//validate_Element_Enabled(Transfer_Money_Header,"Transfer Money Header");    	
    	
    }
    
    public void clickCancel() throws Exception{
    	click(transferInPopupButton.get(0),"PopUp cancel button");
    }
    
    public void clickPopupCancel() throws Exception{
    	click(transferInPopupCancelButton,"PopUp cancel button");
    }
    
    public void clickBackButton()  throws Exception{
    	click(backButton,"Back Button");
    	defaultWait(3);  
    }
  
    
}
