package com.managers;

public class GlobalParams {
    private static final ThreadLocal<String> platformName = new ThreadLocal<>();
    private static final ThreadLocal<String> udid = new ThreadLocal<>();
    private static final ThreadLocal<String> deviceName = new ThreadLocal<>();
    private static final ThreadLocal<String> platformVersion = new ThreadLocal<>();
    private static final ThreadLocal<String> remoteOrLocal = new ThreadLocal<>();
    private static final ThreadLocal<String> testName = new ThreadLocal<>();
   // private static final ThreadLocal<String> environment = new ThreadLocal<>();

    //private static String reportName = null;
    
    /*public static String getEnvironment(){
    	return environment.get();
    }
    
    public static void setEnvironment(String _environment){
    	environment.set(_environment);
    }*/
    
    public static String getTestName() {
        return testName.get();
    }
    
    public static void setTestName(String testName1){
    	testName.set(testName1);
    }
    
    public static String getPlatformName() {
        return platformName.get();
    }

    public static void setPlatformName(String platformName1){
        platformName.set(platformName1);
    }

    public static String getUdid() {
        return udid.get();
    }

    public static void setUdid(String udid1){
        udid.set(udid1);
    }

    public static String getDeviceName() {
        return deviceName.get();
    }

    public static void setDeviceName(String deviceName1){
        deviceName.set(deviceName1);
    }

    public static String getPlatformVersion() {
        return platformVersion.get();
    }

    public static void setPlatformVersion(String platformVersion1){
        platformVersion.set(platformVersion1);
    }

    public static String getRemoteOrLocal() {
        return remoteOrLocal.get();
    }

    public static void setRemoteOrLocal(String remoteOrLocal1){
        remoteOrLocal.set(remoteOrLocal1);
    }
    
    /*public static void setReportName(String name){
    	if(reportName==null)
    		reportName =name;
    }
    
    public stat*/
}
