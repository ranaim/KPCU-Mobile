package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_About_Page extends SeleniumUtils {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'About')]")
    @iOSXCUITFindBy(accessibility = "About")
    private MobileElement aboutLnk;
	
	

}
