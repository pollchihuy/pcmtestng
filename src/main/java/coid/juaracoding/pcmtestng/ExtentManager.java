package coid.juaracoding.pcmtestng;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentManager {

    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setExtent() {
        htmlReporter = new ExtentHtmlReporter(
                System.getProperty("user.dir") + "/test-output/ExtentReport/"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss"))
                        +"/"+ "TestExecutionReport"
                        + ".html");
//        htmlReporter.loadConfig("D\\JC.png");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")
                + "/extent-config.xml");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public static void endReport() {
        extent.flush();
    }
}
