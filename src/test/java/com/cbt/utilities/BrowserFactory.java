package com.cbt.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {


    public static WebDriver getDriver(String browser){

        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("windows")&& browser.equalsIgnoreCase("safari") || os.contains("mac") && browser.equalsIgnoreCase("edge")){
            return null;
        }
        else if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("safari")){
            return new SafariDriver();

        }else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {

        WebDriver driver = getDriver("");
        driver.get("http://practice.cybertekschool.com/");
    }

}