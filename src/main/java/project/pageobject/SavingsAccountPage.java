package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SavingsAccountPage extends BasePage {
    @AndroidFindBy(id = "title")
    @iOSXCUITFindBy(accessibility = "BankingOn.AFAccountPageView")
    public MobileElement savingsAccountNameTitle;
    @AndroidFindBy(id = "primaryBalanceTitle")
    @iOSXCUITFindBy(accessibility = "Available Balance")
    public MobileElement savingsAvailBalanceTitle;
    @AndroidFindBy(id = "right_title")
    @iOSXCUITFindBy(accessibility = "Current Balance")
    public MobileElement savingsCurrentBalanceTitle;
    @AndroidFindBy(id = "accounts_estatements_btn")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public MobileElement eStatementsSavingsIcon;
    @AndroidFindBy(id = "accounts_details_btn")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
    public MobileElement savingsDetailsIcon;
    @AndroidFindBy(id = "accounts_transfer_out_btn")
    @iOSXCUITFindBy(accessibility = "transferOut")
    public MobileElement savingsTransferOutIcon;
    @AndroidFindBy(id = "header_title")
    @iOSXCUITFindBy(accessibility = "TODAY")
    public MobileElement todayTitle;

    public PopUp_Transfer clickTransferOutIcon() {
        wait.until(ExpectedConditions.visibilityOf(savingsTransferOutIcon)).click();
        return new PopUp_Transfer();
    }
    public String getSavingsAcctTitleTxt() { return wait.until(ExpectedConditions.visibilityOf(savingsAccountNameTitle)).getText(); }

    public String getSavingsAcctAvailableBalanceTxt() { return wait.until(ExpectedConditions.visibilityOf(savingsAvailBalanceTitle)).getText(); }

    public String getSavingsAcctCurrentBalanceTxt() { return wait.until(ExpectedConditions.visibilityOf(savingsCurrentBalanceTitle)).getText(); }

}
