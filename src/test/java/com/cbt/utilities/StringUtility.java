package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String actual, String expected){
        if(actual.equals(expected)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
