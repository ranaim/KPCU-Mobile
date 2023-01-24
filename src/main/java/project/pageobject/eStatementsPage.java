package project.pageobject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class eStatementsPage extends SeleniumUtils 
{
	@iOSXCUITFindBy(iOSClassChain = "//XCUIElementTypeNavigationBar[@name='eStatements Settings']/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text= 'eStatements']")
    private MobileElement EStatements_Title;



     public void ValidateEStatementPage() throws Exception
     {	
	   defaultWait(10);
	   logMessage("====  Validate eStatements Page  =====");
	   //validate_Element_Enabled(EStatements_Title,"eStatements Title");
	
     }

}


