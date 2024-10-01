package com.flightbooking.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.flightbooking.base.BaseLib;
import com.flightbooking.pages.FlightBookingPages;
import com.flightbooking.utils.ConfigReader;

public class FlightSearchTest extends BaseLib {

	private FlightBookingPages flightBookingPages;

	@BeforeMethod
	public void setUp() {

		driver = setup(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));

	}

	@Test
	public void testFlightSearch() {

		flightBookingPages = new FlightBookingPages(driver);

		flightBookingPages.searchForFlight();

		String expectedUrlPart = "flightSearch/DEL-Delhi/BOM-Mumbai";
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlPart),
				"URL does not contain the expected part: " + expectedUrlPart);

	
	}
}
