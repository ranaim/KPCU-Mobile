package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.KPCUConstants;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopUp_Income extends BasePage {
        @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Remind me later\"`]") private MobileElement RemindMeLaterBtn;

    public boolean isPopUpLoaded(){
        return find(RemindMeLaterBtn, KPCUConstants.LONG_WAIT);
    }

    public void pressRemindMeLaterBtn(){
        wait.until(ExpectedConditions.visibilityOf(RemindMeLaterBtn)).click();
    }
}
