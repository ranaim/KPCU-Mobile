package project.pageobject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.KPCUConstants;

public class PopUp_Location extends BasePage{
        @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == 'Not now'`]") 
        private MobileElement popupNotNowBtn;
        
        @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeButton[`label == 'Yes, enable location'`]")
        private MobileElement enableLocationBtn;

    public boolean isPopUpLoaded(){
        return find(enableLocationBtn, KPCUConstants.SHORT_WAIT);
    }

    public void pressNotNowBtn(){
        wait.until(ExpectedConditions.visibilityOf(popupNotNowBtn)).click();
    }
    public void pressLocationBtn(){
        wait.until(ExpectedConditions.visibilityOf(enableLocationBtn)).click();
    }
}
