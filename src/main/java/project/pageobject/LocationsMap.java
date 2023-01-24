package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LocationsMap {
    @AndroidFindBy(id = "toolbar_title_left")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`]")
    private MobileElement atmBranchesTitle;
    @AndroidFindBy(id = "MAP")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`]")
    private MobileElement mapBtn;
    @AndroidFindBy(id = "LIST")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`]")
    private MobileElement listBtn;
    @AndroidFindBy(id = "greeting_name")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`]")
    private MobileElement moreTitle;
    @AndroidFindBy(id = "greeting_name")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"More\"`]")
    private MobileElement moreScreenTitle;
}
