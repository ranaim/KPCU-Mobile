package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PopUp_Location_Native_IOS extends BasePage{
        @iOSXCUITFindBy (accessibility = "Not now")
        private MobileElement popupNotNowBtn;
        
        @iOSXCUITFindBy (accessibility = "Allow While Using App") 
        private MobileElement allowWhileUsingAppBtn;

    public void pressAllowWhileUsingAppBtn(){
        wait.until(ExpectedConditions.visibilityOf(allowWhileUsingAppBtn)).click();
    }

}
