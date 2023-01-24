package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Review_Transfers_IOS extends BasePage {

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value == \"Note (optional)\"`]")
    private MobileElement enterNoteFld;
    @iOSXCUITFindBy(accessibility = "SEND")
    private MobileElement SendBtn;
    @iOSXCUITFindBy(accessibility = "Done")
    private MobileElement keyboardDoneBtn;


    public void enterNotes() throws InterruptedException {
        WebElement e = wait.until(ExpectedConditions.visibilityOf(enterNoteFld));
        e.click();
        e.sendKeys("Test");
    }

    public void clickKeyboardDoneBtn() {
        wait.until(ExpectedConditions.visibilityOf(keyboardDoneBtn)).click();
    }

    public SuccessfulTransfer clickSendBtn() {
        wait.until(ExpectedConditions.visibilityOf(SendBtn)).click();
        return new SuccessfulTransfer();
    }

}