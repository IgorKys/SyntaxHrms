package com.hrms.utils;

public class Constants {

	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/configs/configuration.properties";

	public static final String TESTDATA_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/testdata/HmrsData.xlsx";

	public static final String CHROMEDRIVER_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/chromedriver.exe";

	public static final String GECKODRIVER_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/geckodriver.exe";

	public static final String EDGEDRIVER_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/edgedriver.exe";

	public static final int IMPLICIT_WAIT_TIME = 10;

	public static final int Explicit_WAIT_TIME = 20;
	
	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir")
			+ "/target/screenshots/";

}
