package project.pageobject;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class DepositPage extends SeleniumUtils {
	@AndroidFindBy(xpath = "//*[@text=\"Check Deposit\"]")
	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Check Deposit'")
	public MobileElement checkDepositTitle;

	@AndroidFindBy(xpath ="//android.widget.TextView[contains(@text,'History')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'History'`]")
	public MobileElement historyBtn;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Select account']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Deposit to'`]")
	public MobileElement selectAccountField;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'listArrowIcon'`]")
	public MobileElement DepositToButton;

	@AndroidFindBy(id = "amount")
	@iOSXCUITFindBy(accessibility = "amount")    
	public MobileElement amountField;

	@AndroidFindBy(id = "clear")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	public MobileElement clearBtn;

	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Deposit History'")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Deposit History')]")
	public MobileElement DepsitHistory;
	
	
	@AndroidFindBy(className="android.widget.ImageButton")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'crossIcon'`]")
	public MobileElement CloseDepositHistorybutton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Select account']")
	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Select Account'")
	public MobileElement SelectAccountHeader;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Deposit')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"crossIcon\"]")
	public MobileElement BackbuttonSelectAccount;
	

	@iOSXCUITFindBy(accessibility = "targetAccount")
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Select account']")
	public MobileElement DepostiToField;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == 'rdcPage'`]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'id/txtRdcMessage')]")
	public MobileElement VerbiageonCheckDepositpage;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'DEPOSIT HISTORY'`]")
	@AndroidFindBy(xpath="//*[@text='DEPOSIT HISTORY']")	
	public MobileElement historyPage;
	
	@iOSXCUITFindBy(xpath="//*[@name='Check deposit Demo']")
	@AndroidFindBy(id="com.kpcu.mobile.uat:id/imgYoutube")
	public MobileElement checkDepositDemoLink;


	@iOSXCUITFindBy(xpath="(//*[@name='Mobile Check Deposit'])[3]")
	@AndroidFindBy(xpath="(//android.view.View[@text='Mobile Check Deposit'])")
	public MobileElement mobileCheckDepositHeader;
	
	public void validateDepositPage() throws Exception
	{   
		logTitleMessage("Validate Deposit Page"); 
		defaultWait(2);
		validate_Element_Displayed(checkDepositTitle,"Check Depostit Title");
		validate_Element_Displayed(historyBtn,"History Button");
		validate_Element_Displayed(DepostiToField,"Depostit To Field");
		/*click(DepostiToField,"Depostit To Field");
		defaultWait(5);
		validate_Element_Enabled(SelectAccountHeader,"Select Account Header");
		click(BackbuttonSelectAccount,"Back Button on Select Account page");*/
		validate_Element_Displayed(amountField,"Amount Field");
		//validate_Element_Displayed(VerbiageonCheckDepositpage,"Please make sure you include...");
		defaultWait(3);
		validate_Element_Displayed(historyBtn,"History Button");
		click(historyBtn,"History Button");
		defaultWait(6);
		validate_Element_Displayed(DepsitHistory,"Deposit History header");
		//validate_Element_Displayed(historyPage, "History Page");
		defaultWait(3);
		//click(CloseDepositHistorybutton," Close Deposit History Button");
		click(BackbuttonSelectAccount,"Back Button on Select Account page");

	}

	public void checkDepositDemoLink() throws Exception{
		click(checkDepositDemoLink,"Deposit Demo Link");
		switchToBrowser();
		validate_Element_Displayed(mobileCheckDepositHeader, "Mobile Check Deposit Header ");
	}

}


