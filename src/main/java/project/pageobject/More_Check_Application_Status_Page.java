package project.pageobject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_Check_Application_Status_Page extends SeleniumUtils {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Check Application Status')]")
    @iOSXCUITFindBy(accessibility = "Check Application Status")
    private MobileElement checkAppStatusLnk;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`label == 'Check Application Status'`]")
	private MobileElement title;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`label == 'navbarBackIconDark'`]")
	private MobileElement backBtn;
	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeLink[`label == 'First Mortgage and Home Equity'`]")
	private MobileElement homeEquityLink;
	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeLink[`label == 'All other products including Home Equity Line of Credit'`]")
	private MobileElement othersLink;
	
	
	
	public void Validate_Check_Application_Status_page()
	{	
		logTitleMessage("Validation: Check Applicaton Status Page");
		validate_Element_Displayed(checkAppStatusLnk,"Check APplication Status Title");
		validate_Element_Displayed(backBtn,"Back Button");
		validate_Element_Displayed(homeEquityLink,"Home Equity Link");
		validate_Element_Displayed(othersLink,"Others Link");
		
		//validate_Element_Displayed(checkAppStatusLnk, "Check Applicatoin Status Link");
		
	}
	
	

}
