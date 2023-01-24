package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_FastBalances_Page extends SeleniumUtils {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Fast Balances']")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Fast Balances')]")
    private MobileElement FastBalance;
	
	

}
