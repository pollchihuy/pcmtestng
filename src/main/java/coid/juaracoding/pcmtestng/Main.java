package coid.juaracoding.pcmtestng;


import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("ARGS[0] "+args[0]);
//        System.out.println("ARGS[0] "+args[1]);
//        System.out.println("ARGS[0] "+args[2]);
//        System.out.println("ARGS[0] "+args[3]);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan path report  : ");
//        String path = scanner.nextLine();
//        System.out.print("Masukkan banyaknya  : ");
//        int intLoop = scanner.nextInt();
//        System.out.println(path);
//        System.out.println(intLoop);
        String rootProject = System.getProperty("user.dir");// local/usr/var/xbl
//        String rootProject = "D://download//report-test";
        System.out.println("Directory Root Project -> "+rootProject);
        TestNG runner = null;
        /** Functional dari Object TestNG Untuk generate directory report nya TestNG */
        /** kumpulan dari file-file testing yang diregistrasikan di file .xml */
//        D:\SQA-Batch-16\pcmtestng\test-aritmatika.xml
        List<String> suitefiles = new ArrayList<String>();
        runner = new TestNG();
        runner.setOutputDirectory(rootProject+"\\output-testng\\"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss")));
        for (int i = 0; i < 3; i++) {
//            suitefiles.add(rootProject+"\\src\\main\\resources\\test-aritmatika.xml");
//            suitefiles.add(rootProject+"\\src\\main\\resources\\test-logika.xml");
            suitefiles.add(rootProject+"\\test-aritmatika.xml");
//            suitefiles.add(rootProject+"\\test-logika.xml");
//            for (int j = 0; j < 5; j++) {
//            }
            runner.setTestSuites(suitefiles);
        }
        runner.run();
    }
}