package project.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


import project.utils.SeleniumUtils;

public class OpenAccountPage extends SeleniumUtils {
		 
   
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Vehicle Loan']")
    @AndroidFindBy(xpath="//android.widget.RelativeLayout[android.widget.TextView[@text='Vehicle Loan']]")
    private MobileElement vehicleLoan_Link;
    
    @iOSXCUITFindBy(accessibility = "Credit Card")
    @AndroidFindBy(xpath="//android.widget.RelativeLayout[android.widget.TextView[@text='Credit Card']]")
    private MobileElement creditCard_Link;
    
    
    @iOSXCUITFindBy(accessibility = "Personal Loan")
    @AndroidFindBy(xpath="//android.widget.RelativeLayout[android.widget.TextView[@text='Personal Loan']]")
    private MobileElement personalLoan_Link;
    
    
    @iOSXCUITFindBy(accessibility = "New Additional Account")
    @AndroidFindBy(xpath="//android.widget.RelativeLayout[android.widget.TextView[@text='New Additional Account']]")
    private MobileElement new_Additional_Account_link;
    
    @iOSXCUITFindBy(accessibility = "Home Loans")
    @AndroidFindBy(xpath="//android.widget.RelativeLayout[android.widget.TextView[@text='Home Loans']]")
    private MobileElement homeLoan_Link;
    
    @iOSXCUITFindBy(accessibility = "IRAs & HSAs")
    @AndroidFindBy(xpath="//android.widget.RelativeLayout[android.widget.TextView[@text='IRAs & HSAs']]")
    private MobileElement IRAS_HSAS_Link;
    
    /*=========================== Browser Locators For Loan  ===========================*/
    @AndroidFindBy(xpath="//android.view.View[@text='Vehicle Loan']")
    @iOSXCUITFindBy(accessibility = "Vehicle Loan")
    private MobileElement vehicleLoan_Label_Link;
    
    
    @iOSXCUITFindBy(accessibility = "Credit Cards")
    private MobileElement CreditCard_Label_Link;
    
    
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Personal Loan/Line of Credit'`]")
    private MobileElement PersonalLoan_Label_Link;
    
    @iOSXCUITFindBy(accessibility = "Open An Additional Account")
    @AndroidFindBy(xpath="//android.view.View[@text='Open An Additional Account']")
    private MobileElement Open_Additional_Label_Link;
    
    
    @iOSXCUITFindBy(accessibility = "First Mortgage")
    private MobileElement FirstMortgage_Label_Link;
    
    
    @iOSXCUITFindBy(accessibility = "Retirement Central")
    private MobileElement RetirementCentral_Label_Link;
    
    public void OpenVehicleAccount() throws Exception{
    	validate_Element_Displayed(vehicleLoan_Link,"Vehicle Loan Link");
    	defaultWait(10);
    	click(vehicleLoan_Link,"Vehicle Loan Link");    	
    	switchToBrowser();
    }
    
    
    
    public void validateVehicleLoanPage(){
    	logMessage("=============  Validate Vehicle Loan Control in the browser   ==============");
    	defaultWait(10);
    	validate_Element_Displayed(vehicleLoan_Label_Link,"Vehicle Loan Label Link");    	
    	
    	
    }
    
    public void OpenCreditCardAccount() throws Exception{
    	validate_Element_Displayed(creditCard_Link,"Credit card Loan Link");
    	defaultWait(10);
    	click(creditCard_Link,"Credti Card Loan Link");    	
    	//switchToBrowser();
    }
    
    
    
    public void validateCreditCardLoanPage()
    {
    	logMessage("=============  Validate Credit Card Loan Control in the browser   ==============");
    	defaultWait(10);
    	validate_Element_Displayed(CreditCard_Label_Link,"Vehicle Loan Label Link");    	 	
    	
    }
    
   
    public void ValidateOpenPersonalLoanAccount() throws Exception{
    	validate_Element_Displayed(personalLoan_Link,"Personal Loan Link");
    	defaultWait(10);
    	click(personalLoan_Link,"Personal Loan Link");
    	//switchToBrowser();
    }
    
    
    
    public void validatePersonalLoanPage()
    {
    	logMessage("=============  Validate Personal Loan Control in the browser   ==============");
    	defaultWait(10);
    	validate_Element_Displayed(PersonalLoan_Label_Link,"Personal Loan Label Link");    	 	
    	
    }
    
    
    
    public void ValidateOpenAdditionalLoanAccount() throws Exception{
    	validate_Element_Displayed(new_Additional_Account_link,"Additional Loan Link");
    	defaultWait(10);
    	click(new_Additional_Account_link,"Additional Loan Link");
    	switchToBrowser();
    }
    
    
    
    public void validateAdditionalLoanAccount()
    {
    	logMessage("=============  Validate Addiotional Loan Control in the browser   ==============");
    	defaultWait(10);
    	validate_Element_Displayed(Open_Additional_Label_Link,"Additional Loan Label Link");    	 	
    	
    }

    
    public void ValidateHomeLoanAccount() throws Exception{
    	validate_Element_Displayed(homeLoan_Link,"Home Loan Link");
    	defaultWait(10);
    	click(homeLoan_Link,"Home Loan Link");
    	//switchToBrowser();
    }
    
    
    
    public void validateFirstMortgageLink()
    {
    	logMessage("=============  Validate First Mortgage Link in the browser   ==============");
    	defaultWait(10);
    	validate_Element_Displayed(FirstMortgage_Label_Link,"First Mortgage Label Link");    	 	
    	
    }
    
    public void ValidateIRAs_HSAsAccount() throws Exception{
    	validate_Element_Displayed(IRAS_HSAS_Link,"IRAS & HSAS Link");
    	defaultWait(10);
    	click(IRAS_HSAS_Link,"IRAS & HSAS");
    	//switchToBrowser();
    }
    
    
    
    public void validateRetirementCentralLink()
    {
    	logMessage("=============  Validate Retirement Central Link in the browser   ==============");
    	defaultWait(10);
    	validate_Element_Displayed(RetirementCentral_Label_Link,"Retirement Central Label Link");    	 	
    	
    }
}
