package com.study.testng.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groups {
    @Test(groups = "server")
    public void groupsdemo(){
        System.out.println("server");
    }
    @Test(groups = "client")
    public void test1(){
        System.out.println("client");
        }


    @BeforeGroups(groups = "client")
    public void test2(){
        System.out.println("前端");
    }

    @AfterGroups(groups = "client")
    public void test3(){
        System.out.println("后端");
    }

    }

