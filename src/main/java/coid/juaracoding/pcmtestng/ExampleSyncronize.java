package coid.juaracoding.pcmtestng;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 20:36
@Last Modified Mon 20:36
Version 1.0
*/
public class ExampleSyncronize {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Ini i ke "+i+" Thread ke -> "+(Thread.currentThread().getId()));
            if(i==0){
//                for (int j = 0; j < 5; j++) {
//                    System.out.println("nilai j ke "+j+" Thread ke -> "+(Thread.currentThread().getId()));
//                }
                Thread first = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j < 5; j++) {
                            System.out.println("nilai j ke "+j+" Thread ke -> "+(Thread.currentThread().getId()));
                        }
                    }
                });
                first.start();
            }

        }
    }
}
