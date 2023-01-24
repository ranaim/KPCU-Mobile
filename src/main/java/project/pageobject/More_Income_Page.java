package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_Income_Page extends SeleniumUtils {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Income')]")
    @iOSXCUITFindBy(accessibility = "Income")
    private MobileElement incomeLnk;

}
