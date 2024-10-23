package com.cntest.testng;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {



    @Test
    public void testCase1(){
        System.out.println("用例1");
    }

    @BeforeTest
    public void beforeMethod(){
        System.out.println("用例之前执行的");
    }


    @AfterTest
    public void afterMethod(){
        System.out.println("用例之后执行的");
    }

}


