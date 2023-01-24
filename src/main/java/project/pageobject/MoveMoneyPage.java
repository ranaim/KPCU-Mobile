package project.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.managers.DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class MoveMoneyPage extends SeleniumUtils {
	
    @iOSXCUITFindBy(accessibility = "transfersPlaceholder")
    @AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'id/no_trans_img')]")
    private MobileElement transferplaceholdericon;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Move Money' AND name == 'Move Money'")   
    private MobileElement moveMoneyTitle;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Internal Scheduled Transfers'`]")
    private MobileElement internalScheduledTransfersLnk;    
    
    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`label == 'Move Money'`][2]")
    private MobileElement backbuttonScheduleTransfer;
    
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Transfers')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transfer Money\"]")
    private MobileElement TransferMoneyHeader;
    
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.ImageButton")
    @iOSXCUITFindBy(accessibility = "closeScreenIconDark")
    private MobileElement CloseTransferMoneyIcon;
    
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'External Transfer')]")
    @iOSXCUITFindBy(iOSNsPredicate= "label == 'External Transfer'")
    private MobileElement ExternalTransferHeader;
    
    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.ImageButton")
    @iOSXCUITFindBy(accessibility = "navbarBackIconDark")
    private MobileElement CloseExternalTransferIcon;
    
    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[2]/android.view.ViewGroup)[1]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell[`label == 'Transfer Between KeyPoint Accounts'`]")
    private MobileElement transferBetwKPAcctsLnk;
    
    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[3]/android.view.ViewGroup)[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Pay a Person and External Transfers' AND name == 'Pay a Person and External Transfers' AND type == 'XCUIElementTypeCell'")
    private MobileElement p2PExtTransfersLnk;
    
    @AndroidFindBy(xpath= "(//android.view.ViewGroup[contains(@resource-id,':id/view_trans')])[4]")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Add/Activate External Account' AND name == 'Add/Activate External Account' AND value == 'Add/Activate External Account'")
    private MobileElement addActivateExtAcctLnk;
    
    @AndroidFindBy(xpath= "//android.widget.TextView[contains(@text,'Manage Accounts and Personal Payees')]")
    @iOSXCUITFindBy(iOSNsPredicate="name == 'Manage External Accounts and Person (Mobile)' AND type == 'XCUIElementTypeNavigationBar'")
    private MobileElement  ManageExertanlAccountsHeader;
    
    @AndroidFindBy(xpath= "//android.view.ViewGroup/android.widget.ImageButton")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`label == 'navbarBackIconDark'`]")
    private MobileElement BackbuttonManageExternalAccounts;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[5]/android.view.ViewGroup")
    @iOSXCUITFindBy(iOSNsPredicate = "label == 'Bill Pay' AND name == 'Bill Pay' AND type == 'XCUIElementTypeCell'")
    private MobileElement billPayLnk;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay Bills']")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Bill Pay\"]")
    private MobileElement Paybills_header;
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ImageButton")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"navbarBackIconDark\"]")
    private MobileElement BackbuttonPayBills;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wires']")    
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Wires\"]") 
    private MobileElement Wires_Link;
    

public Transfers pressOnTransferBtnKPAcctsLnk() {
    wait.until(ExpectedConditions.visibilityOf(transferBetwKPAcctsLnk)).click();
    return new Transfers();
        }


   public void validateMoveMoneyPage() throws Exception
   {
	   defaultWait(10);
	   logTitleMessage("Validate moveMoney Page");
	   validate_Element_Displayed(moveMoneyTitle,"Move Money Title");
	   validate_Element_Displayed(internalScheduledTransfersLnk,"Internal Scheduled Transfer Link");
	
	click(internalScheduledTransfersLnk,"Internal Scheduled Transfer Link");
	
	/*if(transferplaceholdericon.isDisplayed())
		validate_Element_Enabled(transferplaceholdericon,"Transfer place holder icon");	*/	
	 defaultWait(2);
	// Click back button
	click(backbuttonScheduleTransfer,"back button on schedule Transfer page");
	
	// validate Transfer between Keypoint Accounts Link
	validate_Element_Enabled(transferBetwKPAcctsLnk,"Transfer Between Keypoint Accounts Link");
	
	// Click transferBetwKPAcctsLnk
	click(transferBetwKPAcctsLnk,"Transfer Between Keypoint Accounts Link");
	
	int rating = 1;
	for(int i=0;i<9;i++){
		List<MobileElement> elements = DriverManager.getDriver().findElements(By.xpath("(//android.widget.ImageView)"));
		if(elements.size()!=0)break;
	}
	List<MobileElement> elements = DriverManager.getDriver().findElements(By.xpath("(//android.widget.ImageView)"));
	click(elements.get(rating-1),rating+": Rated");
	defaultWait(30);
	validate_Element_Enabled(TransferMoneyHeader,"Transfer Money Header");
	
	try{
		defaultWait(3);
		DriverManager.getDriver().findElement(By.xpath("(//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout)[2]")).click();
	}catch(Exception e){}
	
	click(CloseTransferMoneyIcon,"Click close Transfer Money button");
	// pending
	
	// validate Pay a person and External Transfers Link
    validate_Element_Enabled(p2PExtTransfersLnk,"Pay a person and External Transfers Link");
    
	// Click Pay a person and External Transfer Link
	click(p2PExtTransfersLnk,"Pay a person and External Transfer Link");	
	defaultWait(3);
	
	//Validate Exteranl Transfer Header
	validate_Element_Enabled(ExternalTransferHeader," External Transfer Header");
	
	// Close Exteranal Transfer
	click(CloseExternalTransferIcon,"Close External Transfer Icon");
	
	// Validate Add Activate External Account Link
	validate_Element_Enabled(addActivateExtAcctLnk,"Add Activate External Account Link");
	
	//Click Add Activate External Account Link
	click(addActivateExtAcctLnk,"Add Activate External Account Link");
	
	//Validate Manage External  Accounts Header
	validate_Element_Enabled(ManageExertanlAccountsHeader,"Manage External Accounts Header");
	
	//Click Back button on External Accunts 
	click(BackbuttonManageExternalAccounts,"Back Button on External Accounts");
	
	// Validate Bill Pay Link
	validate_Element_Enabled(billPayLnk,"Bill Pay Link");
	
	// Click Bill pay link
	click(billPayLnk,"Bill Pay Link");
	
	//Validate Pay Bills header
	validate_Element_Enabled(Paybills_header,"Pay Bills Header");
	
	// Click Back button on Pay bills page
	click(BackbuttonPayBills,"Back Button on Pay Bills page");
	
	if(!isDisplayed(Wires_Link,"Wires Link")){
		scrollDown("Page", "Wires");
	}
	//Validate Wires Link
	validate_Element_Enabled(Wires_Link,"Wires Link");
	
	//Click Wires Link	
	click(Wires_Link," Wires Link");
	switchToBrowser();
	/*defaultWait(5);
	@SuppressWarnings("unchecked")
	List<MobileElement> elements = DriverManager.getDriver().findElements(By.xpath("(//XCUIElementTypeOther[@name=\"Keypoint Online Banking Forms\"]//XCUIElementTypeButton[@name])|(//android.view.View[@resource-id='pnlFormsList']//android.widget.Button)"));
	boolean bln = elements.size()>=6 ? true:false;		
	assertCondition(bln,"Buttons were not diplayed on browser");
	for(MobileElement e : elements){
		logMessage(e.getText()+" : Button Displayed ");
	}*/
   }


}