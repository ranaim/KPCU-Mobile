package project.utils;

import com.aventstack.extentreports.Status;
import com.managers.GlobalParams;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentReport.getTest().fail(result.getThrowable());
		try {			
			String fileName = SeleniumUtils.takeScreenshot(result.getTestName());
			ExtentReport.getTest().addScreenCaptureFromPath(fileName);
			ExtentReport.getTest().log(Status.FAIL, result.getThrowable().getMessage());
			System.out.println(result.getThrowable().getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.startTest(result.getTestClass().getRealClass().getSimpleName() + " : " + GlobalParams.getTestName()
				, result.getMethod().getDescription())
		.assignCategory(GlobalParams.getPlatformName() + "_" + GlobalParams.getDeviceName());
		String sName = "^^^^^^^^^^^^^^^^ Test Name : "+ GlobalParams.getTestName()+"  ^^^^^^^^^^^^^^^^ ";
		getString(sName);
		System.out.println(sName);
		getString(sName);
	}
	private void getString(String str){
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.print("=");
		System.out.println();
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentReport.getTest().log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentReport.getTest().log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReport.getReporter().flush();		
	}
	
	/*public static void LogMessage(String message){
		ExtentTest a = ExtentReport.getTest();
		a.log(Status.INFO, message);
	}*/
}