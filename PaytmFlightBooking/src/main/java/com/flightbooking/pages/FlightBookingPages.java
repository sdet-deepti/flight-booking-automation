package com.flightbooking.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBookingPages {

    WebDriver driver;

    public FlightBookingPages(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForFlight() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        WebElement fromCityDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='srcCode']")));
        fromCityDropdown.click();

        WebElement fromCityInput = driver.findElement(By.xpath("//input[@id='text-box']"));
        fromCityInput.sendKeys("Delhi, India");

        WebElement selectFromCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'DEL')]")));
        selectFromCity.click();

        
        WebElement toCityDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='destCode']")));
        toCityDropdown.click();

        WebElement toCityInput = driver.findElement(By.xpath("//input[@id='text-box']"));
        toCityInput.sendKeys("Mumbai, Maharashtra, India");

        WebElement selectToCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'BOM')]")));
        selectToCity.click();

        
        WebElement departureDateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='departureDate']")));
        departureDateDropdown.click();

        WebElement selectDepartureDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='calendar__day calendar__activeDay']")));
        selectDepartureDate.click();

        
        WebElement passengersDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='numPax']")));
        passengersDropdown.click();

        WebElement increaseAdults = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Adults')]/../../following-sibling::div//*[@alt='add-icon']")));
        increaseAdults.click();

        WebElement confirmPassengers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Done')]")));
        confirmPassengers.click();

        
        WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='flightSearch']")));
        searchButton.click();
    }

}
