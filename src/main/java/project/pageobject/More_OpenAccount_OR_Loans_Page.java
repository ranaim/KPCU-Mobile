package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;


public class More_OpenAccount_OR_Loans_Page extends SeleniumUtils {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Open Account/Loan')]")
    @iOSXCUITFindBy(accessibility = "Open Account/Loan")
    private MobileElement openAcctLoanLnk;
	
	
	 @iOSXCUITFindBy(accessibility = "Credit Card")
	 @AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit Card']/..")
	 private MobileElement creditCard;
	
	 @AndroidFindBy(xpath="(//android.view.View[@text='Credit Cards']) | (//android.widget.TextView[@text='Credit Cards'])")
	 @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == 'Credit Card Information'`][1]/XCUIElementTypeOther[3]")	                                    
     private MobileElement creditCardTitle;
	
	public void Validate_More_OpenAccount_or_loans_page() throws Exception
	{
		logTitleMessage("Validation: More openAccount or loans Page");
		validate_Element_Displayed(openAcctLoanLnk, "Open Account Link");
		defaultWait(2);
		click(creditCard,"creditCard");
		defaultWait(2);
		switchToBrowser();
		defaultWait(5);
		validate_Element_Enabled(creditCardTitle,"Credit Card Title");
		
	}

}
