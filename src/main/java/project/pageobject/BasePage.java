package project.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.managers.DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import project.utils.KPCUConstants;

public class BasePage {
	protected WebDriverWait wait;
	protected JavascriptExecutor js;

    public BasePage (){
        wait = new WebDriverWait(DriverManager.getDriver(), KPCUConstants.WEBDRIVER_WAIT);
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
        js = (JavascriptExecutor) DriverManager.getDriver();
    }

    public void hideKeyboard(){
        DriverManager.getDriver().hideKeyboard();
    }

    public boolean find(final MobileElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed() | element.isEnabled()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

}
