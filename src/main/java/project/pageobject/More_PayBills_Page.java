package project.pageobject;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import project.utils.SeleniumUtils;

public class More_PayBills_Page extends SeleniumUtils{
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bill Pay']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Bill Pay']")
    public MobileElement billPay_Title;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
    @iOSXCUITFindBy(accessibility = "//XCUIElementTypeButton[@name='navbarBackIconDark']")
    public MobileElement back_Btn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='menu']")
    //@iOSXCUITFindBy(accessibility = "Marisol")
    public MobileElement billPay_Dashboard_Menu;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Quick Pay']")
    //@iOSXCUITFindBy(accessibility = "Marisol")
    public MobileElement quickPay_Title;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Group ')]")
    //@iOSXCUITFindBy(accessibility = "Marisol")
    public MobileElement group_Dropdwown;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Payee Select Payee']")
    //@iOSXCUITFindBy(accessibility = "Marisol")
    public MobileElement payee_Dropdwown;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Calendar List View']")
    //@iOSXCUITFindBy(accessibility = "Marisol")
    public MobileElement datePicker_Icon;
	
	
	public void verifyPabills(){
		validate_Element_Enabled(billPay_Title, "Bill Pay Title");
		defaultWait(1);
		validate_Element_Enabled(billPay_Dashboard_Menu, "BillPay Dashboard Title");
		validate_Element_Enabled(quickPay_Title, "Quick Pay Title");
		validate_Element_Enabled(group_Dropdwown,"Groupd Dropdown");
		validate_Element_Enabled(payee_Dropdwown, "Payee DropDown");
		validate_Element_Enabled(datePicker_Icon, "Date Picker");
	}
}
