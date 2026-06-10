package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if(extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "reports/ExtentReport.html");

            spark.config()
                 .setDocumentTitle(
                         "Capstone Automation Report");

            spark.config()
                 .setReportName(
                         "GUI Elements Automation");

            extent = new ExtentReports();

            extent.attachReporter(spark);
        }

        return extent;
    }
}