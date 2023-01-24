package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DepositSelectAccountPage extends BasePage {
    @AndroidFindBy(id = "toolbar_title_left")
    @iOSXCUITFindBy(accessibility = "BankingOn.AFAccountPageView")
    public MobileElement selectAccountTitle;
    @AndroidFindBy(id = "account_title")
    @iOSXCUITFindBy(accessibility = "Available Balance")
    public MobileElement checkingAccountTitle;
    @AndroidFindBy(id = "select_account_input")
    @iOSXCUITFindBy(id = "select_account_input")
    public MobileElement selectAccountBtn;
    @AndroidFindBy(id = "amount")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public MobileElement amountField;
    @AndroidFindBy(id = "clear")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"transactionsPage\"`]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
    public MobileElement clearBtn;


/*    public PopUp_Transfer clickTransferOutIcon() {
        wait.until(ExpectedConditions.visibilityOf(transferOutIcon)).click();
        return new PopUp_Transfer();
    }*/
    
    }
