package coid.juaracoding.pcmtestng.automation;

import coid.juaracoding.pcmtestng.testing.OperatorLogika;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 21:10
@Last Modified Thu 21:10
Version 1.0
*/
public class TestOperatorLogika {

    private OperatorLogika operatorLogika;
//    @BeforeTest
    @BeforeTest
    public void prepare(){
        operatorLogika = new OperatorLogika();
    }

    @Test(priority = 1)
    public void testAnd(){
        boolean isValid = operatorLogika.logikaAnd(true,true);
        System.out.println("ID Thread testAnd : "+Thread.currentThread().getId());
        /**
         *  1. Label Home -> true
         *  2. Label copyright -> true
         *  3. Label pojok kanan -> true
         *  dengan operator OR
         *  isValid = 1 || 2 || 3
         */
        Assert.assertTrue(isValid);
    }

    @Test(priority = 2)
    public void testOr(){
        System.out.println("ID Thread testOr : "+Thread.currentThread().getId());
        boolean isValid = operatorLogika.logikaOr(false,false);
        Assert.assertFalse(isValid);
    }
}