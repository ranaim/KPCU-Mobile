package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginErrorPopUp extends BasePage {
    @AndroidFindBy(id = "alertTitle") private MobileElement and_title;
    @AndroidFindBy (id = "android:id/message") @iOSXCUITFindBy (accessibility = "Invalid User ID or Password") private MobileElement msg;
    @AndroidFindBy(id = "android:id/button1") @iOSXCUITFindBy (iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Ok\"`]") private MobileElement okBtn;

    public String andGetTitle(){
        return wait.until(ExpectedConditions.visibilityOf(and_title)).getText();
    }

    public String getMsg(){
    	String popMsg = wait.until(ExpectedConditions.visibilityOf(msg)).getText();
    	System.out.println(popMsg+" is displayed");
        return popMsg;
    }

    public void pressOkBtn(){
        wait.until(ExpectedConditions.visibilityOf(okBtn)).click();
    }
}
