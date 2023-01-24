package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_Forms_Page {
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='More'])[1]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'More'`]")
    private MobileElement FormsLink;
	
	

}
