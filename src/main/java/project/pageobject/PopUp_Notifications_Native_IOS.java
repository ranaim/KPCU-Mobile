package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class PopUp_Notifications_Native_IOS extends SeleniumUtils {

    //@iOSXCUITFindBy(accessibility = "Allow")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == 'Not now'`]")
    private MobileElement allowNotifBtn;

    public void allowNotifBtn() throws Exception {
    	defaultWait(3);
        click(allowNotifBtn,"Allow Button");
    }
}
