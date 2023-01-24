package com.managers;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class DriverManager {
    @SuppressWarnings("rawtypes")
	private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    @SuppressWarnings("rawtypes")
	public static AppiumDriver getDriver(){
        return driver.get();
    }

    @SuppressWarnings("rawtypes")
	private static void setDriver(AppiumDriver driver1){
        driver.set(driver1);
    }

    @SuppressWarnings("rawtypes")
	public static void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        //driver.U
        DesiredCapabilities caps;
        URL url;

        switch(GlobalParams.getRemoteOrLocal()){
            case "Remote":
                caps = CapabilitiesManager.getBrowserStackCapabilities();
                url = new URL(PropertiesManager.browserStackConfig("url"));
                break;
            case "Local":
                caps = CapabilitiesManager.getLocalAppiumServerCapabilities();
                url = new URL("http://127.0.0.1:4723/wd/hub");
                break;
            default:
                throw new IllegalStateException("invalid driver info");
        }

        try{
            switch(GlobalParams.getPlatformName()){
                case "Android":
                    driver = new AndroidDriver(url, caps);
                    break;
                case "iOS":
                    driver = new IOSDriver(url, caps);
                    break;
            }
            if(driver == null){
                throw new Exception("driver is null. ABORT!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        setDriver(driver);
    }
}