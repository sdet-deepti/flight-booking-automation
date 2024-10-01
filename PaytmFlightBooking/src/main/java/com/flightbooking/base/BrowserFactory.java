package com.flightbooking.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver createDriver(String browser, String url) {
		WebDriver driver;

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else {
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		driver.get(url);
		return driver;
	}
}
