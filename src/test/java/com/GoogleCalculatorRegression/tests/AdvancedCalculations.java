package com.GoogleCalculatorRegression.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedCalculations extends BaseClass {
	@Test
	public void TC_06_SinCheck() throws Exception {
		Logs.info("Computing Sin of an angle and verifying the result");
		findElementById(rc.getSin()).click();
		findElementById(rc.getNine()).click();
		findElementById(rc.getZero()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "1");
		Logs.pass("TC_SinCheck Passed");
	}

	@Test
	public void TC_07_CosCheck() throws Exception {
		Logs.info("Computing Cos of an angle and verifying the result");
		findElementById(rc.getCos()).click();
		findElementById(rc.getNine()).click();
		findElementById(rc.getZero()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "0");
		Logs.pass("TC_CosCheck Passed");
	}

	@Test
	public void TC_08_TanCheck() throws Exception {
		Logs.info("Computing Tan of an angle and verifying the result");
		findElementById(rc.getTan()).click();
		findElementById(rc.getFour()).click();
		findElementById(rc.getFive()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "1");
		Logs.pass("TC_TanCheck Passed");
	}

	@Test
	public void TC_09_factorialCheck() throws Exception {
		Logs.info("Calculating the factorial of a number and verifying the result");
		findElementById(rc.getFour()).click();
		findElementById(rc.getFactorial()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "24");
		Logs.pass("TC_Factorial Passed");
	}

	@Test
	public void TC_10_parenthesisCheck() {
		Logs.info("Checking left and right parenthesis functionality and verifying the result");
		findElementById(rc.getTwo()).click();
		findElementById(rc.getLB()).click();
		findElementById(rc.getThree()).click();
		findElementById(rc.getRB()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "6");
		Logs.pass("TC_ParenthesisCheck Passed");
	}

	@Test
	public void TC_11_logCheck() {
		Logs.info("Log base 10 Check and verifying the result");
		findElementById(rc.getLog()).click();
		findElementById(rc.getOne()).click();
		findElementById(rc.getZero()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "1");
		Logs.pass("TC_Logbase10 Passed");
	}

	@Test
	public void TC_12_naturalLogCheck() {
		Logs.info("Natural Log Check and verifying the result");
		findElementById(rc.getNaturalLog()).click();
		findElementById(rc.getOne()).click();
		findElementById(rc.getZero()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "2.30258509");
		Logs.pass("TC_NaturalLog Passed");
	}

	@Test
	public void TC_13_squareRootCheck() {
		Logs.info("Square root check and verifying the result");
		findElementById(rc.getSqrt()).click();
		findElementById(rc.getFour()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "2");
		Logs.pass("TC_SquareRoot Passed");
	}

	@Test
	public void TC_14_piCheck() {
		Logs.info("Pi constant Check and verifying the result");
		System.out.println("Assuming the radius of circle : 2 and findind the area of circle");
		findElementById(rc.getPi()).click();
		findElementByXpath(rc.getMultiply()).click();
		findElementById(rc.getTwo()).click();
		findElementByXpath(rc.getMultiply()).click();
		findElementById(rc.getTwo()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "12.5663706");
		Logs.pass("TC_ConstantPi Passed");
	}

}
