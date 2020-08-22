package com.GoogleCalculatorRegression.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadLocators {
	Properties prop;

	public Properties getProp() {
		return prop;
	}

	public ReadLocators() {
		File src = new File("./src/test/resources/ElementsLocator.properties");
		try {
			if (src.exists()) {
				FileInputStream fis = new FileInputStream(src);
				prop = new Properties();
				prop.load(fis);
				
			}
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}
	public String getUnlockType() {
		String demo = prop.getProperty("unlockType");
		return demo;
	}

	public String getUnlockKey() {
		String demo = prop.getProperty("unlockKey");
		return demo;
	}

	public String getDeviceName() {
		String demo = prop.getProperty("deviceName");
		return demo;
	}

	public String getPlatformName() {
		String demo = prop.getProperty("platformName");
		return demo;
	}

	public String getPlatformVersion() {
		String demo = prop.getProperty("platformVersion");
		return demo;
	}
	public String getUDID() {
		String demo = prop.getProperty("udid");
		return demo;
	}
	public String getAppPackage() {
		String demo = prop.getProperty("appPackage");
		return demo;
	}

	public String getAppActivity() {
		String demo = prop.getProperty("appActivity");
		return demo;
	}

	public String getUrl() {
		String demo = prop.getProperty("url");
		return demo;
	}

	public String getOne() {
		String demo = prop.getProperty("one");
		return demo;
	}

	public String getTwo() {
		String demo = prop.getProperty("two");
		return demo;
	}

	public String getThree() {
		String demo = prop.getProperty("three");
		return demo;
	}

	public String getFour() {
		String demo = prop.getProperty("four");
		return demo;
	}

	public String getFive() {
		String demo = prop.getProperty("five");
		return demo;
	}

	public String getSix() {
		String demo = prop.getProperty("six");
		return demo;
	}

	public String getSeven() {
		String demo = prop.getProperty("seven");
		return demo;
	}

	public String getEight() {
		String demo = prop.getProperty("eight");
		return demo;
	}

	public String getNine() {
		String demo = prop.getProperty("nine");
		return demo;
	}

	public String getZero() {
		String demo = prop.getProperty("zero");
		return demo;
	}

	public String getPlus() {
		String demo = prop.getProperty("plus");
		return demo;
	}

	public String getSubtract() {
		String demo = prop.getProperty("subtract");
		return demo;
	}

	public String getMultiply() {
		String demo = prop.getProperty("multiply");
		return demo;
	}

	public String getDivide() {
		String demo = prop.getProperty("divide");
		return demo;
	}

	public String getPercent() {
		String demo = prop.getProperty("percent");
		return demo;
	}

	public String getCancel() {
		String demo = prop.getProperty("cancel");
		return demo;
	}

	public String getEquals() {
		String demo = prop.getProperty("equals");
		return demo;
	}

	public String getDecimal() {
		String demo = prop.getProperty("decimal");
		return demo;
	}
	public String getLB() {
		String demo = prop.getProperty("leftBracket");
		return demo;
	}

	public String getRB() {
		String demo = prop.getProperty("rightBracket");
		return demo;
	}

	public String getSin() {
		String demo = prop.getProperty("sin");
		return demo;
	}

	public String getCos() {
		String demo = prop.getProperty("cos");
		return demo;
	}

	public String getTan() {
		String demo = prop.getProperty("tan");
		return demo;
	}
	public String getSqrt() {
		String demo = prop.getProperty("squareRoot");
		return demo;
	}

	public String getFactorial() {
		String demo = prop.getProperty("factorial");
		return demo;
	}
	public String getPi() {
		String demo = prop.getProperty("pi");
		return demo;
	}

	public String getPower() {
		String demo = prop.getProperty("power");
		return demo;
	}
	public String getLog() {
		String demo = prop.getProperty("log");
		return demo;
	}

	public String getNaturalLog() {
		String demo = prop.getProperty("ln");
		return demo;
	}
	public String getBackspace() {
		String demo = prop.getProperty("backspace");
		return demo;
	}
	public String getExponential() {
		String demo = prop.getProperty("exponential");
		return demo;
	}
	public String getClearScreen() {
		String demo = prop.getProperty("clearScreen");
		return demo;
	}
	public String getMode() {
		String demo = prop.getProperty("mode");
		return demo;
	}
	public String getToggleMode() {
		String demo = prop.getProperty("toggleMode");
		return demo;
	}
	public String getToggleInverse() {
		String demo = prop.getProperty("toggleInverse");
		return demo;
	}
	public String getEulerNumber() {
		String demo = prop.getProperty("eulerNumber");
		return demo;
	}
	public String getTenToPowerOf() {
		String demo = prop.getProperty("tenPowerOf");
		return demo;
	}
	public String getSquare() {
		String demo = prop.getProperty("square");
		return demo;
	}
	public String getInverseSin() {
		String demo = prop.getProperty("inverseSin");
		return demo;
	}
	public String getInverseCos() {
		String demo = prop.getProperty("inverseCos");
		return demo;
	}
	public String getInverseTan() {
		String demo = prop.getProperty("inverseTan");
		return demo;
	}
	public String getResult() {
		String demo = prop.getProperty("result");
		return demo;
	}
	public String getFormulaScreen() {
		String demo= prop.getProperty("formulaScreen");
		return demo;
	}
}
