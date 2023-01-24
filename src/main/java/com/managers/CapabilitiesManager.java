package com.managers;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import project.utils.SeleniumUtils;

public class CapabilitiesManager {

    public static DesiredCapabilities getBrowserStackCapabilities() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, GlobalParams.getPlatformName());
        caps.setCapability("newCommandTimeOut", PropertiesManager.browserStackConfig("newCommandTimeOut"));
        caps.setCapability("browserstack.maskCommands", PropertiesManager.browserStackConfig("browserstack.maskCommands"));
        caps.setCapability("realMobile","true");
        //caps.setCapability("browserstack.appium_version","1.21.0");
        caps.setCapability("browserstack.networkProfile","reset");
        caps.setCapability("autoDismissAlerts", "true");
        caps.setCapability("acceptSslCerts", "true");
        caps.setCapability("autoAcceptAlerts", "true");
        caps.setCapability("resetOnSessionStartOnly", "true");
        //caps.setCapability("browserstack.preventCrossSiteTracking", "false"); //to be comment

        // Set your access credentials
        caps.setCapability("browserstack.user", PropertiesManager.browserStackConfig("browserstack.user"));
        caps.setCapability("browserstack.key", PropertiesManager.browserStackConfig("browserstack.key"));
        // Specify device and os_version for testing
        caps.setCapability("device", GlobalParams.getDeviceName());
        caps.setCapability("os_version", GlobalParams.getPlatformVersion());

        // Set other BrowserStack capabilities
        caps.setCapability("project", PropertiesManager.browserStackConfig("project"));
        caps.setCapability("build", PropertiesManager.browserStackConfig("build")+" "+PropertiesManager.browserStackConfig("environment"));
        caps.setCapability("name", PropertiesManager.browserStackConfig("name")+"-"+GlobalParams.getDeviceName()+" "+GlobalParams.getPlatformVersion()+" "+SeleniumUtils.getDate());
        // Set URL of the application under test
        //caps.setCapability("browserstack.networkLogs","true");  // uat giving issue
        //caps.setCapability("browserstack.console", "disable");
        //caps.setCapability("browserstack.appiumLogs", PropertiesManager.browserStackConfig("appiumLogs"));

        String env = PropertiesManager.getEnvironment();
        String appId = "";
        switch(GlobalParams.getPlatformName()){        
            case "Android":
            	appId = PropertiesManager.browserStackConfig("andApp_"+PropertiesManager.getEnvironment());
                caps.setCapability("app", appId);
                caps.setCapability("autoGrantPermissions", "true");
                break;
            case "iOS":
            	appId = PropertiesManager.browserStackConfig("iosApp_"+PropertiesManager.getEnvironment());
                caps.setCapability("app", appId);
                //caps.setCapability("autoAcceptAlerts", "true"); 
                //caps.setCapability("autoAcceptAlerts", "true");                
                break;
            default: throw new IllegalStateException("Invalid platform");
        }
        System.out.println("Environment: "+env+", ["+GlobalParams.getPlatformName()+" AppID]: "+appId);
        return caps;
    }

    public static DesiredCapabilities getLocalAppiumServerCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, GlobalParams.getDeviceName());
        caps.setCapability(MobileCapabilityType.UDID, GlobalParams.getUdid());

        switch (GlobalParams.getPlatformName()) {
            case "Android":
                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "app" + File.separator + "kpcu-4.42 (3404)_UAT-Debug.apk";
                caps.setCapability(MobileCapabilityType.APP, appUrl);
                caps.setCapability("autoGrantPermissions", "true");
                break;
            case "iOS":
                String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "------";
                caps.setCapability(MobileCapabilityType.APP, iOSAppUrl);
                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability("bundleId", "com.exanpole.apple-samplecode.UICatalog");
                break;
            default:
                throw new IllegalStateException("invalid platform");
        }
        return caps;
    }
}
