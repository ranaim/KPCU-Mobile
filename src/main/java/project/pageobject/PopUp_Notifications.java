package project.pageobject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class PopUp_Notifications extends BasePage {

      @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'Not now'`]") 
      private MobileElement popupNotNowBtn;
      
      @iOSXCUITFindBy(iOSNsPredicate = "label == \"Turn on notifications\" AND name == \"Turn on notifications\" AND type == \"XCUIElementTypeButton\"") 
      private MobileElement trnOnNotifBtn;

    public boolean isPopUpLoaded(){
        return find(trnOnNotifBtn, 30);
    }

    public void pressNotNowBtn(){
        wait.until(ExpectedConditions.visibilityOf(popupNotNowBtn)).click();
    }
    public void trnOnNotifBtn(){
        wait.until(ExpectedConditions.visibilityOf(trnOnNotifBtn)).click();
    }
}
