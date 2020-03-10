package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws Exception {

       WebDriver driver =  BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/","http://practice.cybertekschool.com/dropdown","http://practice.cybertekschool.com/login");

        for(String eachUrl : urls){
            driver.get(eachUrl);
            Thread.sleep(3000);
            String title =driver.getTitle();
            if(eachUrl.contains(title.toLowerCase())){
                System.out.println("Test Passed");
            }else{
                System.out.println("Test Failed");
            }


        }





        driver.quit();
    }
}
