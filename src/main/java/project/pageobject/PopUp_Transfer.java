package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.KPCUConstants;
import project.utils.SeleniumUtils;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopUp_Transfer extends SeleniumUtils {
    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Transfer\"`]")    
    public MobileElement transferPopupTitle;
    
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(accessibility = "Please select transfer type")
    public MobileElement transferPopupMessage;
    
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Transfer In")
    public MobileElement transferInBtn;
    
    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(accessibility = "Transfer Out")
    public MobileElement transferOutBtn;
    
    @AndroidFindBy(id = "android:id/button3")
    @iOSXCUITFindBy(accessibility = "Cancel")
    public MobileElement cancelBtn;

    public boolean isTransferPopUpLoaded() {
        return find(transferPopupTitle, KPCUConstants.LONG_WAIT);
    }

    public void clickCancelBtn() {
        wait.until(ExpectedConditions.visibilityOf(cancelBtn)).click();
    }
    
    public Transfers gotoTransfersPage(String option) throws Exception{
    	if(isDisplayed(transferInBtn, "Transfer In")){
    		switch(option.trim().toLowerCase()){
        	case "transferin":
        		click(transferInBtn,"Trasfer In Button");
        		break;
        	case "transferout":
        		click(transferOutBtn,"Trasfer Out Button");
        		break;
        	case "cancel":
        		click(cancelBtn,"Cancel Button");
        		break;
        	default :
        		throw new IllegalArgumentException("Please provide correct options, instead of :["+option+"]");
        	}
    	}    	
    	return new Transfers();
    }
}
