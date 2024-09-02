package coid.juaracoding.pcmtestng.automation;

import coid.juaracoding.pcmtestng.ExtentManager;
import coid.juaracoding.pcmtestng.testing.AritmatikaTandingan;
import coid.juaracoding.pcmtestng.testing.OperatorAritmatika;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 20:48
@Last Modified Thu 20:48
Version 1.0
*/
public class TestOperatorAritmatika {

    private OperatorAritmatika operatorAritmatika;
    private AritmatikaTandingan aritmatikaTandingan;
    private Random random;
    private int intZ ;

    @BeforeSuite
    public void beforeSuite() {
        ExtentManager.setExtent();
    }
//    @BeforeTest
    @BeforeTest
    public void prepare(){
        random = new Random();
        aritmatikaTandingan = new AritmatikaTandingan();
        intZ = random.nextInt();
                operatorAritmatika = new OperatorAritmatika();
    }

    //suite
    @Test(priority = 4)
    public void testTambah(){
        System.out.println("ID Thread testTambah : "+Thread.currentThread().getId());
        System.out.println("1");
        double douA = random.nextDouble(1.0,10000.0);//6
        double douB = random.nextDouble(1.0,10000.0);//10
        double proses = operatorAritmatika.tambah(douA,douB);
//        double proses = operatorAritmatika.tambah(5,3);
//        Assert.assertEquals(proses,aritmatikaTandingan.tambah(douA,douB),"Berhasil");
    }
    @Test(priority = 3)
    public void testPengurangan(){
        System.out.println("ID Thread testKurang : "+Thread.currentThread().getId());
        System.out.println("2");
        double proses = operatorAritmatika.kurang(10,1);
        Assert.assertEquals(9,proses);
    }
    @Test(priority = 2)
    public void testPembagian(){
        System.out.println("ID Thread testBagi : "+Thread.currentThread().getId());
        System.out.println("3");
        double proses = operatorAritmatika.bagi(12,3);
        Assert.assertEquals(4,proses);
    }
    @Test(priority = 1)
    public void testPerkalian(){
        System.out.println("ID Thread testKali : "+Thread.currentThread().getId());
        System.out.println("4");
        double proses = operatorAritmatika.kali(2,4);
        Assert.assertEquals(8,proses);
    }
    @Test(priority = 0)
    public void testModulus() throws InterruptedException {
        System.out.println("ID Thread testModulus : "+Thread.currentThread().getId());
        Thread.sleep(10000);
        System.out.println("5");
        double proses = operatorAritmatika.modulus(20,4);
        Assert.assertEquals(0,proses);
    }
}