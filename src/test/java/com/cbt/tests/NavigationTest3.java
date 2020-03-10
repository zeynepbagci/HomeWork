package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTest3 {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("firefox");

        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://www.etsy.com/");
        String title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),title2);

        driver.quit();


    }
}
