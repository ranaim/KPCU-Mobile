package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessfulTransfer extends BasePage {
    @AndroidFindBy(id = "main_title")
    @iOSXCUITFindBy(accessibility = "Transfer Successful")
    private MobileElement mainTitle;
    @AndroidFindBy(id = "second_title")
    @iOSXCUITFindBy(iOSNsPredicate = "label CONTAINS \"Amount\"")
    private MobileElement secondTitle;
    @AndroidFindBy(id = "main_button")
    @iOSXCUITFindBy(accessibility = "DONE")
    private MobileElement sendButton;


    public String getMainTitleText(){
        return wait.until(ExpectedConditions.visibilityOf(mainTitle)).getText();
    }

    public String getSecondTitleText(){
        return wait.until(ExpectedConditions.visibilityOf(secondTitle)).getText();
    }

}
