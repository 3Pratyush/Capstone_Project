package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ErrorPage;

public class ErrorPageTest extends BaseTest {

    @Test
    public void verifyErrorPage() {

        ErrorPage error =
                new ErrorPage(driver);

        error.visit404PageAndReturn();
    }
}