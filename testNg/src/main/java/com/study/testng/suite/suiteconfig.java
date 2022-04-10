package com.study.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suiteconfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("yunxing");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("yunxing1");
    }
}
