package com.managers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesManager {
	
	static String environment;

    public static String browserStackConfig(String key) throws IOException {
        Properties config = new Properties();
        InputStream configIs = PropertiesManager.class.getClassLoader().getResourceAsStream("browserstackConfig.properties");
        config.load(configIs);
        return config.getProperty(key);
    }    
      

    public static String accountConfig(String key) throws Exception {
        InputStream accountsConfigIs;
        Properties config = new Properties();
        switch(GlobalParams.getPlatformName()){
            case "Android":
                accountsConfigIs = PropertiesManager.class.getClassLoader().getResourceAsStream("account_Android.properties");
                break;
            case "iOS":
                accountsConfigIs = PropertiesManager.class.getClassLoader().getResourceAsStream("account_iOS.properties");
                break;
            default:
                throw new Exception("Invalid platform name. Allowed values are Android and iOS");
        }
        config.load(accountsConfigIs);
        return config.getProperty(key);
    }
    
    public static  String getEnvironment() throws Exception{		
		if(environment==null)
			environment = browserStackConfig("environment");
		return environment;
	}
    
    public static String getUserName() throws Exception{
    	return accountConfig("username_"+getEnvironment());
    }
    
    public static String getPassword() throws Exception{
    	return accountConfig("password_"+getEnvironment());
    }
}
