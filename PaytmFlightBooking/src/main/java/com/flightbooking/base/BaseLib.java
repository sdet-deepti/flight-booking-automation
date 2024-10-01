package com.flightbooking.base;

import org.openqa.selenium.WebDriver;

import com.flightbooking.utils.ConfigReader;

public class BaseLib {

	public WebDriver driver;

	public WebDriver setup(String browser, String url) {

		browser = ConfigReader.getProperty("browser");
		url = ConfigReader.getProperty("url");

		driver = BrowserFactory.createDriver(browser, url);

		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}

}
