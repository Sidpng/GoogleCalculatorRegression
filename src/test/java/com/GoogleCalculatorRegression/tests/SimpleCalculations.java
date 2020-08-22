package com.GoogleCalculatorRegression.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleCalculations extends BaseClass {

	@Test
	public void TC_01_Addition() throws Exception {
		Logs.info("Adding two numbers and verifying the result");
		findElementById(rc.getOne()).click();
		findElementById(rc.getPlus()).click();
		findElementById(rc.getTwo()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(Integer.parseInt(findElementById(rc.getResult()).getText()), Math.addExact(1, 2));
		Logs.pass("TC_Addition Passed");
	}
	@Test
	public void TC__02_Subtraction() throws Exception {
		Logs.info("Checking Backspace functionality and then Subtracting two numbers and verifying the result");
		findElementById(rc.getFour()).click();
		findElementById(rc.getFour()).click();
		findElementById(rc.getBackspace()).click();
		findElementById(rc.getSubtract()).click();
		findElementById(rc.getThree()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(Integer.parseInt(findElementById(rc.getResult()).getText()), Math.subtractExact(4, 3));
		Logs.pass("TC_Subtraction Passed");
	}

	@Test
	public void TC_03_Multiply() throws Exception {
		Logs.info("Multiplying two numbers and verifying the result");
		findElementById(rc.getFive()).click();
		findElementByXpath(rc.getMultiply()).click();
		findElementById(rc.getSix()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(Integer.parseInt(findElementById(rc.getResult()).getText()), Math.multiplyExact(5, 6));
		Logs.pass("TC_Multiply Passed");
	}

	@Test
	public void TC_04_Divide() throws Exception {
		Logs.info("Dividing two numbers and verifying the result");
		findElementById(rc.getNine()).click();
		findElementById(rc.getDivide()).click();
		findElementById(rc.getThree()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(Integer.parseInt(findElementById(rc.getResult()).getText()), Math.floorDiv(9, 3));
		Logs.pass("TC_Divide Passed");
	}

	@Test
	public void TC_05_Percent() throws Exception {
		Logs.info("Finding percent of a number by 100 verifying the result");
		findElementById(rc.getEight()).click();
		findElementById(rc.getZero()).click();
		findElementById(rc.getPercent()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "0.8");
		Logs.pass("TC_Divide Passed");
	}

}
