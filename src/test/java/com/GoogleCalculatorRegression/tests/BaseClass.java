package com.GoogleCalculatorRegression.tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.GoogleCalculatorRegression.utilities.ReadLocators;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	static AppiumDriver<MobileElement> driver;
	static ExtentReports extent;
	public ReadLocators rc = new ReadLocators();
	ExtentSparkReporter htmlReporter;
	static ExtentTest Logs ;

	public BaseClass() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("TestsResults/Spark/Spark.html");
		extent.attachReporter(spark);	
		Logs = extent.createTest("LogLevels");
	}

	@BeforeSuite
	public void reportSetup() {
			
	}
	@BeforeTest
	public void setup() {

		Logs.info("Setting Up the device for Calculator App regression testing");
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName",rc.getDeviceName());
			cap.setCapability("udid", rc.getUDID());
			cap.setCapability("platformName", rc.getPlatformName());
			cap.setCapability("platformVersion", rc.getPlatformVersion());
			cap.setCapability("unlockType", rc.getUnlockType());
			cap.setCapability("unlockKey", rc.getUnlockKey());
			cap.setCapability("appPackage", rc.getAppPackage()); /* use command adb shell dumpsys window | find "mCurrentFocus" in cmd when in
																	the opened app to see its info*/                          	
			cap.setCapability("appActivity", rc.getAppActivity());																				
			URL url = new URL(rc.getUrl());
			driver = new AppiumDriver<MobileElement>(url, cap);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Application Started");
			Logs.pass("Device Setup Successfully and Application Started");

		}
		catch (Exception e) {
			System.out.println(e.getCause());
			e.printStackTrace();
			Logs.fail("Reported error while setting up the device and application");
		}
	}
	@AfterTest()
	public void tearDown() {
//		ExtentTest Logs = extent.createTest("LogLevels");
//		System.out.println("Ending Testing");
		Logs.pass("Regression Test");
	}
	
	@AfterMethod()
	public void afterMethod(ITestResult result) {
		ExtentTest test = extent.createTest(result.getName());
		if (result.isSuccess()) {
			test.pass(result.getName()+" pass");
		}
	}

	MobileElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}
	MobileElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	@AfterSuite
	public void tearDownExtent() {
		extent.flush();
		
	}

}
