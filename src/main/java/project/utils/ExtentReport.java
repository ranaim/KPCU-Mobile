package project.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.managers.GlobalParams;
import com.managers.PropertiesManager;

public class ExtentReport {
    static ExtentReports extent;
    static ExtentTest test;
    final static String filePath = "Extent.html";
    static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();
    public static String fileFullPath ;
    
    public synchronized static ExtentReports getReporter() {  
    	if (extent == null){
    	SimpleDateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_hh_mm");  
		Calendar cal = Calendar.getInstance();    
		String convertedDate=dateFormat.format(cal.getTime());
		String reportName = "Extent\\Extent_"+convertedDate+".html";
		fileFullPath = System.getProperty("user.dir")+"\\"+reportName;
		System.out.println(fileFullPath);        
        	ExtentSparkReporter html = new ExtentSparkReporter(reportName);
        	html.config().setDocumentTitle("Appium Framework");
        	html.config().setReportName("KPCU");
        	html.config().setTheme(Theme.DARK);
        	
            extent = new ExtentReports();
            extent.attachReporter(html);
            extent.setSystemInfo("Device", GlobalParams.getDeviceName());
            try {
				extent.setSystemInfo("Environment", PropertiesManager.browserStackConfig("environment"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return extent;
    }
    
        
    public static synchronized ExtentTest getTest() {
        return extentTestMap.get((int) Thread.currentThread().getId());
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        test = getReporter().createTest(testName, desc);
        extentTestMap.put((int) Thread.currentThread().getId(), test);
        return test;
    }
   
}
