package project.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.managers.DriverManager;
import com.managers.GlobalParams;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import project.pageobject.BasePage;

public class SeleniumUtils extends BasePage{
	
	//@AndroidFindBy(xpath="(//*[contains(@text,'Chrome')]/preceding::android.widget.ImageView)[1] | (//*[contains(@text,'Chrome')]/preceding-sibling::*)[1]")
	@AndroidFindBy(xpath="//*[contains(@text,'Chrome')]/..")
	protected MobileElement chromeLink;
	
	@AndroidFindBy(xpath="//*[@text='ALWAYS' or @text='Always']")
	private MobileElement always;
	
	
	@AndroidFindBy(xpath="//*[@text='JUST ONCE' or @text='Just once' or @text='Just Once']")
	private MobileElement justOnce;
	
	
	
	
	public String getText(MobileElement element) throws Exception{
		String text = "";
		try{
			text =wait.until(ExpectedConditions.elementToBeClickable(element)).getText();
		}catch(Exception e){
			throw new Exception("Falied : '"+element+"'"+e.getMessage());
		}
		return text;
	}
	
	public ArrayList<String> getAllText(ArrayList<MobileElement> elements) throws Exception{
		ArrayList<String> text = new ArrayList<String>();
		try{
			for(MobileElement element : elements){
				text.add(wait.until(ExpectedConditions.elementToBeClickable(element)).getText());
			}
			
		}catch(Exception e){
			throw new Exception("Falied : While getting All Text'"+e.getMessage());
		}
		return text;
	}
	
	public void click(MobileElement element,String elementName) throws Exception{
		try{
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			logMessage("[Click] : '"+elementName+"' Success");
		}catch(Exception e){
			logMessage("[Failed] : While clicking on "+elementName);
			throw new Exception("Falied : '"+elementName+"'"+e.getMessage());
		}		
	}
	
	public boolean isDisplayed(MobileElement element,String elementName){
		boolean bln = false;
		try{
			 bln = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
			logMessage("[Displayed] : '"+elementName+"' is '"+bln+"'");	
		}catch(Exception e){}
			
		return bln;
	}
	
	
	public void sendkeys(MobileElement element,String text,String elementName) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
			logMessage("[Enter Text] : '"+text+"' Entered into '"+elementName+"' Success");
			
		}catch(Exception e){
			logMessage("[Failed] : While Entering the text into "+elementName);
			throw new Exception("Falied : '"+elementName+"'"+e.getMessage());		
		}		
	}
	
	
	public void scrollDown(String elementName,String text){	
		 switch(GlobalParams.getPlatformName()){
         case "iOS":
        	 Map<String, Object> args = new HashMap<>();
         	args.put("direction", "down");
         	DriverManager.getDriver().executeScript("mobile: scroll", args);          	
             break;
         case "Android":
             this.scrollTo(text);
             break;
		 }
		 logMessage("[Scroll on] : '"+elementName+"' "+text);
	}
	
	public void scrollUp(String elementName,String text){	
		 switch(GlobalParams.getPlatformName()){
        case "iOS":
       	 Map<String, Object> args = new HashMap<>();
        	args.put("direction", "up");
        	DriverManager.getDriver().executeScript("mobile: scroll", args);          	
            break;
        case "Android":
            this.scrollTo(text);
            break;
		 }
		 logMessage("[Scroll on] : '"+elementName+"' "+text);
	}
	
	public MobileElement scrollTo(String text){
		MobileElement element = null;
		try{
			/*element = (MobileElement)DriverManager.getDriver().findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView("
					+ "new UiSelector().description(\""+text+"\"));"));*/
			
			element = (MobileElement)DriverManager.getDriver().findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
					+ "new UiSelector().textContains(\""+text+"\").instance(0))"));
		}catch(Exception e){
			logMessage(e.getMessage());
		}		  
		return element;
	}
	
	public void scrollToView(MobileElement e1,MobileElement e2){
		try{
			/*TouchAction action = new TouchAction(DriverManager.getDriver());
			action.tap(PointOption.point(0,250)).release().perform(); */

			/*new TouchAction(DriverManager.getDriver())
            .tap(tapOptions().withElement(element(e1)))
            .waitAction(waitOptions(ofMillis(250))).perform();*/
			
			 /*int startX = e1.getLocation().getX() + (e1.getSize().getWidth() / 2);
		        int startY = e1.getLocation().getY() + (e1.getSize().getHeight() / 2);
		        int endX = e2.getLocation().getX() + (e2.getSize().getWidth() / 2);
		        int endY = e2.getLocation().getY() + (e2.getSize().getHeight() / 2);
		        new TouchAction(DriverManager.getDriver())
		            .press(point(startX,startY))
		            .waitAction(waitOptions(ofMillis(1000)))
		            .moveTo(point(endX, endY))
		            .release().perform();*/
			Dimension size = DriverManager.getDriver().manage().window().getSize();
			int starty = (int) (size.height * 0.80);
			int endy = (int) (size.height * 0.20);
			int startx = size.width / 2;

			
			TouchAction action = new TouchAction(DriverManager.getDriver());
			action.press(new PointOption().withCoordinates(startx, starty))
			.moveTo(new PointOption().withCoordinates(starty, endy)).release().perform();
			
		}catch(Exception e){
			logMessage(e.getMessage());
		}
	}
	
	public void validate_Element_Displayed(MobileElement element,String elementName){
		try{
			boolean bln = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
			logMessage("[Displayed] : '"+elementName+"' is '"+bln+"'");
			assertCondition(bln,elementName+" is not displayed");
		}
		catch(Exception e){
			logMessage(e.getMessage());
			assertFail("[FAILED] "+elementName+" is not Displayed");
		}	
	}
	
	public void validate_Element_Enabled(MobileElement element,String elementName){
		try{
			boolean bln = element.isEnabled();
			logMessage("[Displayed] : '"+elementName+"' is '"+bln+"'");
			assertCondition(bln,elementName+" is not displayed");
		}
		catch(Exception e){
			logMessage(e.getMessage());
			assertFail("[FAILED] : "+elementName+" is not enabled");
		}
	}
	
	public static void logMessage(String message){
		ExtentReport.getTest().pass(message);		
		System.out.println(message);
	}
	
	public static void logWithScreenShot(String message,String screenShotName) throws IOException{		
		String fileName = takeScreenshot(screenShotName);
		ExtentReport.getTest().pass(message).addScreenCaptureFromPath(fileName);;
	}
	
	public void logTitleMessage(String message){
		System.out.println(" <<<<<<<<<<<<<<<<<<<  "+message+" >>>>>>>>>>>>>>>>>>> ");
	}
	
	
	public void defaultWait(int i){
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getDate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_hh_mm");  
		Calendar cal = Calendar.getInstance();    
		String convertedDate=dateFormat.format(cal.getTime());
		return convertedDate;
	}
	
	public static String getDate(String format){
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);  
		Calendar cal = Calendar.getInstance();    
		String convertedDate=dateFormat.format(cal.getTime());
		return convertedDate;
	}
	
	public static String takeScreenshot(String fileName) throws IOException{
		File f = new File(System.getProperty("user.dir")+"\\evidence\\"+getDate("MM_dd_yyyy"));
		if(!f.exists()){
			f.mkdir();
		}
		String fullpath = f.getAbsolutePath()+"\\"+getDate("MM_dd_yyyy_hh_mm_ss")+".jpg";
		//String fullpath = System.getProperty("user.dir")+"\\evidence\\"+fileName+"_"+getDate()+".jpg";
		File file = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);			
		FileUtils.copyFile(file, new File(fullpath));
		return fullpath;
	}
	
	public void switchToBrowser() throws Exception{
		defaultWait(3);
		String platfrom = "";
		if(GlobalParams.getPlatformName().equals("iOS")){
			@SuppressWarnings("rawtypes")
			ArrayList args = new ArrayList();
			Map<String, Object> params = new HashMap<>();
			params.put("bundleId", "com.apple.mobilesafari");
			params.put("arguments", args);
			DriverManager.getDriver().executeScript("mobile: terminateApp", params);		
			DriverManager.getDriver().executeScript("mobile: launchApp", params);
			platfrom = "Safari";
			logMessage("Successfully Switched To "+platfrom+" Browser");
			defaultWait(3);
		}
		else{
			if(isDisplayed(chromeLink, "Chrome Browser")){
				defaultWait(1);
				logMessage("Chrome Icon Displayed");
				click(chromeLink,"Chrome Browser");	
				defaultWait(5);
			}						
			try{
				click(justOnce,"Just Once Button");
				defaultWait(3);
			}catch(Exception e){
				logMessage("[Log] : Unable to click on Chrome Icon");
				return;
			}
			logMessage("Successfully Switched To "+platfrom+" Browser");
		}				
	}
	
	public void switchios() throws Exception{
		DriverManager.getDriver().activateApp("com.apple.mobilesafari");
	}
	
	
	
	public static String getDateFormat(String format){
		SimpleDateFormat dateFormat = new SimpleDateFormat("format");  
		Calendar cal = Calendar.getInstance();    
		String convertedDate=dateFormat.format(cal.getTime());
		return convertedDate;
	}
	
	public String getUrl(){
		String url = null;
		try{
			 url = DriverManager.getDriver().getCurrentUrl();
			logMessage("Current URL is :"+url);
		}catch(Exception e){
			logMessage("[Error]: While getting URL => "+e.getMessage());
		}
		return url;
	}
	
	public void assertCondition(boolean bln,String msg){
		org.testng.Assert.assertTrue(bln,msg);
		//Assert.assertTrue(elementName+" is not displayed",bln);
		
	}
	
	public void assertFail(String message){
		org.testng.Assert.fail(message);
		//Assert.fail("[FAILED] : "+elementName+" is not enabled");
	}
	
	public void swithTo(){
		Set names = DriverManager.getDriver().getContextHandles();
		for(Object cname : names){
			System.out.println(cname);
		}
	}
}
