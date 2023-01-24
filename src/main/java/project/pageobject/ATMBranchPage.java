package project.pageobject;
import com.managers.GlobalParams;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.ExtentReport;
import project.utils.SeleniumUtils;


public class ATMBranchPage extends SeleniumUtils
{
	
	
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Locations Map'`]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement LocationsMapTitle;
    
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == 'Locations Map'`]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement locationMap;
    
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == 'KeyPoint Branches'`]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement keypointBranches;    
    
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == 'Shared Branches'`]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement sharedBranches;
    
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == 'No-Fee ATMs'`]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement noFeeATMS;
    
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeStaticText[`label == 'Deposit-Taking ATMs'`]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement depositeTakingATMs;
    
    @iOSXCUITFindBy(accessibility = "rectangle131")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ATM / Branches')]")
    private MobileElement LocationsMapdropdown;
    
    
    public void ValidateATMBranchPage() throws Exception
    {	
    	defaultWait(10);
    	logMessage("============  Validate ATM Branch Page  ==============");
    	validate_Element_Displayed(LocationsMapTitle,"Location Map Title");
    	boolean b = GlobalParams.getPlatformName().trim()!="Androi";
    	if(GlobalParams.getPlatformName().toLowerCase()=="ios"){
    		click(LocationsMapdropdown,"Locations Map dropdown");
        	validate_Element_Displayed(locationMap,"Location Map");
        	validate_Element_Displayed(keypointBranches,"Keypoint Branches");
        	validate_Element_Displayed(sharedBranches,"Shared Branches");
        	validate_Element_Displayed(noFeeATMS,"No Fee ATMS");
        	validate_Element_Displayed(depositeTakingATMs,"Dipositee Taking ATMS");
    	}
    	else{
    		// Specific funcationality
    		logMessage("LoctionMap is Not avalialable in Android Platform");
    	}
    		
    	
    }

}
