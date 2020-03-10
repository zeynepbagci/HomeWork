package com.cbt.utilities;


import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");

         List<String> urls = Arrays.asList("https://luluandgeorgia.com","https://wayfair.com/","https://walmart.com","https://westelm.com/");

         for(String eachUrl : urls){
             driver.get(eachUrl);
             String title = driver.getTitle().replace(" ","").toLowerCase();
             String currentURL = driver.getCurrentUrl();
             if(currentURL.toLowerCase().contains(title)){
                 System.out.println("PASSED");
             }else{
                 System.out.println("FAILED");
             }
         }

         Thread.sleep(3000);
         driver.quit();

    }
}
