package com.GoogleCalculatorRegression.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InverseCalculations extends BaseClass {
	@Test
	public void TC_15_inverseCosCheck() {
		Logs.info("Computing InverseCos of number and verifying the result");
		findElementById(rc.getToggleInverse()).click();
		findElementById(rc.getInverseCos()).click();
		findElementById(rc.getOne()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "0");
		Logs.pass("TC_InverseCosCheck Passed");
	}

	@Test
	public void TC_16_tenToPowerOf() {
		Logs.info("Computing Ten to the power of number and verifying the result");
		findElementById(rc.getTenToPowerOf()).click();
		findElementById(rc.getTwo()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "100");
		Logs.pass("TC_TenToPowerOf Passed");
	}

	@Test
	public void TC_17_squareCheck() {
		Logs.info("Computing Square of a number and verifying the result");
		findElementById(rc.getNine()).click();
		findElementById(rc.getSquare()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "81");
		Logs.pass("TC_SquareCheck Passed");
	}

	@Test
	public void TC_18_inverseSinCheck() {
		Logs.info("Computing InverseSin of a number and verifying the result");
		findElementById(rc.getInverseSin()).click();
		findElementById(rc.getOne()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "90");
		Logs.pass("TC_InverseSinCheck Passed");
	}

	@Test
	public void TC_19_inverseTanCheck() {
		Logs.info("Computing InverseTan of a number and verifying the result");
		findElementById(rc.getInverseTan()).click();
		findElementById(rc.getOne()).click();
		findElementById(rc.getEquals()).click();
		Assert.assertEquals(findElementById(rc.getResult()).getText(), "45");
		Logs.pass("TC_InverseTanCheck Passed");
	}

		@Test
		public void TC_20_exponentialCheck() {
			if(findElementById(rc.getToggleInverse()).isEnabled()) {
			findElementById(rc.getExponential()).click();
			findElementById(rc.getZero()).click();
			findElementById(rc.getEquals()).click();
			Assert.assertEquals(findElementById(rc.getResult()).getText(), "1");
		}
			else {
				findElementById(rc.getToggleInverse()).click();
			}
		}
}
