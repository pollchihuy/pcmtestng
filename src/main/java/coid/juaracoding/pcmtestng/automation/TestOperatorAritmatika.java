package coid.juaracoding.pcmtestng.automation;

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
//    @BeforeTest
    @BeforeSuite
    public void prepare(){
        operatorAritmatika = new OperatorAritmatika();
        random = new Random();
        aritmatikaTandingan = new AritmatikaTandingan();
    }

//        3
//        4
//        2
//        5
//        1

    /**
     * Login Positif
     * ========= Username dan Password Valid ==============
     *  -> Buka Browser
     *  -> Input Username
     *  -> Input Password
     *  -> Klik Tombol Login
     *  -> Validasi Komponen di Halaman Home
     */

    /**
     * Login Negatif
     *  ======== Login username kosong =========
     *  -> Buka Browser
     *  -> Input Username empty String
     *  -> Input Password password valid
     *  -> Klik Tombol Login
     *  -> Validasi Komponen Message username tidak boleh kosong
     *
     *  ======== Login Password kosong =========
     *  -> Buka Browser
     *  -> Input Username valid
     *  -> Input Password empty String
     *  -> Klik Tombol Login
     *  -> Validasi Komponen Message password tidak boleh kosong

     ======== Login Password Salah =========
     *  -> Buka Browser
     *  -> Input Username valid
     *  -> Input Password salah
     *  -> Klik Tombol Login
     *  -> Validasi Komponen Message username / password salah !!
     *
     ======== Login Username Salah =========
     *  -> Buka Browser
     *  -> Input Username salah
     *  -> Input Password valid
     *  -> Klik Tombol Login
     *  -> Validasi Komponen Message username / password salah !!
     */
    //suite
    @Test(priority = 4)
    public void testTambah(){
        System.out.println("ID Thread testTambah : "+Thread.currentThread().getId());
        System.out.println("1");
        double douA = random.nextDouble(1.0,10000.0);//6
        double douB = random.nextDouble(1.0,10000.0);//10
        double proses = operatorAritmatika.tambah(douA,douB);
//        double proses = operatorAritmatika.tambah(5,3);
        Assert.assertEquals(proses,aritmatikaTandingan.tambah(douA,douB));
    }
    @Test(priority = 3)
    public void testKurang(){
        System.out.println("ID Thread testKurang : "+Thread.currentThread().getId());
        System.out.println("2");
        double proses = operatorAritmatika.kurang(10,1);
        Assert.assertEquals(9,proses);
    }
    @Test(priority = 2)
    public void testBagi(){
        System.out.println("ID Thread testBagi : "+Thread.currentThread().getId());
        System.out.println("3");
        double proses = operatorAritmatika.bagi(12,3);
        Assert.assertEquals(4,proses);
    }
    @Test(priority = 1)
    public void testKali(){
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