package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

import base.BaseTest;
import utilities.ExtentManager;
import utilities.ScreenshotUtils;

public class ExtentListener
        implements ITestListener {

    private static ExtentReports extent =
            ExtentManager.getInstance();

    private static ThreadLocal<ExtentTest>
            test = new ThreadLocal<>();

    @Override
    public void onTestStart(
            ITestResult result) {

        ExtentTest extentTest =
                extent.createTest(
                        result.getMethod()
                              .getMethodName());

        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        test.get().pass(
                "Test Passed");
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        test.get().fail(
                result.getThrowable());

        try {

            Object currentClass =
                    result.getInstance();

            WebDriver driver =
                    ((BaseTest) currentClass).driver;

            String screenshotPath =
                    ScreenshotUtils.captureScreenshot(
                            driver,
                            result.getMethod()
                                  .getMethodName());

            test.get()
                .addScreenCaptureFromPath(
                        screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(
            ITestContext context) {

        extent.flush();
    }
}