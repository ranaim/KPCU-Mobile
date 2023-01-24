package project.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.managers.DriverManager;
import com.managers.GlobalParams;

import project.utils.ExtentReport;


public class BaseTest {

	@Parameters({ "remoteOrLocal", "platformName", "automationName", "udid", "platformVersion", "deviceName" })
	@BeforeTest(alwaysRun = true)
	public void beforeTest(@Optional("Remote") String remoteOrLocal,@Optional("iOS") String platformName,
			@Optional("UiAutomator2") String automationName,@Optional("emulator-5554") String udid,
			@Optional("14") String platformVersion,@Optional("iPhone 12") String deviceName) throws Exception {
		try{
			GlobalParams.setDeviceName(deviceName);
			GlobalParams.setPlatformName(platformName);
			GlobalParams.setPlatformVersion(platformVersion);
			//GlobalParams.setUdid(udid);
			GlobalParams.setRemoteOrLocal(remoteOrLocal);
			System.out.println("Launching : "+GlobalParams.getDeviceName());
			DriverManager.initializeDriver();
		}catch(Exception e){
			System.out.println("Error While Launhing App : "+e.getMessage());
			throw new Exception("Error While Launhing App : "+e.getMessage());
		}
		
		
		/*if (GlobalParams.getPlatformName().equalsIgnoreCase("iOS")) {
			new LoginPage().login(PropertiesManager.accountConfig("username"),
					PropertiesManager.accountConfig("password"));
			PopUp_Notifications popUp_notifications = new PopUp_Notifications();
			if (popUp_notifications.isPopUpLoaded()) {
				popUp_notifications.trnOnNotifBtn();
				PopUp_Notifications_Native_IOS popUp_notifications_native_ios = new PopUp_Notifications_Native_IOS();
				popUp_notifications_native_ios.allowNotifBtn();
			}
			PopUp_Location popUp_location = new PopUp_Location();
			if (popUp_location.isPopUpLoaded()) {
				popUp_location.pressLocationBtn();
				PopUp_Location_Native_IOS popUp_location_native_iOS = new PopUp_Location_Native_IOS();
				popUp_location_native_iOS.pressAllowWhileUsingAppBtn();
			}
		}*/
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}

	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		DriverManager.getDriver().closeApp();
		Thread.sleep(1000);
	}

	public void launchApp() {
		DriverManager.getDriver().launchApp();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(Method result) throws IOException
	{		
		String name = result.getName();
		GlobalParams.setTestName(name);
		launchApp();
	}
	
	@AfterMethod(alwaysRun = true)
    public void afterMethod() throws IOException, InterruptedException
    {			
    	closeApp();
    }
	
	@AfterSuite
	public void open() throws IOException{
		Runtime.getRuntime().exec(new String[]{"cmd","/c","start chrome "+ExtentReport.fileFullPath});
	}
}
