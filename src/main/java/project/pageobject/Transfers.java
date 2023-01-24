package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import project.utils.SeleniumUtils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.managers.DriverManager;
import com.managers.GlobalParams;

public class Transfers extends SeleniumUtils {
    @AndroidFindBy(id = "amount")
    @iOSXCUITFindBy(accessibility = "amount")
    private MobileElement enterAmountFld;
    
    @iOSXCUITFindBy(accessibility = "1")
    private MobileElement keyboardKey1;
    
    @iOSXCUITFindBy(accessibility = "0")
    private MobileElement keyboardKey0;
    @iOSXCUITFindBy(accessibility = "DONE")
    private MobileElement iosDoneBtn;
    
    @iOSXCUITFindBy(accessibility = "NEXT")
    private MobileElement iosNextBtn;
    @AndroidFindBy(id = "description_input")
    private MobileElement andEnterDescriptionFld;
    
    @AndroidFindBy(id = "send_button")
    private MobileElement andSendButton;
    
    @iOSXCUITBy(iOSClassChain="**/XCUIElementTypeButton[`label == 'DONE'`]")
    private MobileElement submitBtn;
    
    public void clickTransferAmountFld() {
        wait.until(ExpectedConditions.visibilityOf(enterAmountFld)).click();
    }
    
    public void enterAmount(String amount) throws Exception{
    	click(enterAmountFld,"Amount Input");
    	defaultWait(2);
    	//click(enterAmountFld,"Amount Input");
    	enterAmountFld.sendKeys(amount);
    	logMessage("["+amount+"] : Amount Entered");
    	defaultWait(7);
    	submitBtn.click();
    }

    @SuppressWarnings("rawtypes")
	public void enterTransferAmount() throws InterruptedException {
        Thread.sleep(2000);
        switch (GlobalParams.getPlatformName()) {
            case "Android":
                ((AndroidDriver) DriverManager.getDriver()).pressKey(new KeyEvent().withKey(AndroidKey.NUMPAD_1));
                ((AndroidDriver) DriverManager.getDriver()).pressKey(new KeyEvent().withKey(AndroidKey.NUMPAD_0));
                hideKeyboard();
                break;
            case "iOS":
                wait.until(ExpectedConditions.visibilityOf(keyboardKey1)).click();
                wait.until(ExpectedConditions.visibilityOf(keyboardKey0)).click();
                Thread.sleep(2000);
                break;
        }


        //wait.until(ExpectedConditions.visibilityOf(enterAmountFld)).sendKeys("10");
        //if (GlobalParams.getPlatformName().equalsIgnoreCase("Android"))

    }

    public void androidEnterDescriptionTxt() {
        wait.until(ExpectedConditions.visibilityOf(andEnterDescriptionFld)).sendKeys("Test");
        if (GlobalParams.getPlatformName().equalsIgnoreCase("Android"))
            hideKeyboard();
    }

    public SuccessfulTransfer androidClickSendButton() {
        wait.until(ExpectedConditions.visibilityOf(andSendButton)).click();
        return new SuccessfulTransfer();
    }

    @SuppressWarnings("rawtypes")
	public Transfers iosClickDoneButton() {
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int x = (int) (0.5* size.getWidth()/2);
        int y = (int) (0.6* size.getHeight()/2);
        TouchAction t = new TouchAction(DriverManager.getDriver());
        t.tap(PointOption.point(x, y)).perform();
   //     iosDoneBtn.click();
        return this;
    }

    public Review_Transfers_IOS iosClickNextButton() {
        wait.until(ExpectedConditions.visibilityOf(iosNextBtn)).click();
        return new Review_Transfers_IOS();
    }
}
