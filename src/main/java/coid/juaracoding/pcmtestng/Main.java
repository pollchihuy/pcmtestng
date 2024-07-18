package coid.juaracoding.pcmtestng;


import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        for (int i = 0; i < 10; i++) {
            suitefiles.add(rootProject+"\\test-aritmatika.xml");
            for (int j = 0; j < 5; j++) {
                suitefiles.add(rootProject+"\\test-logika.xml");
            }
            runner.setTestSuites(suitefiles);
        }
        runner.run();
    }
}