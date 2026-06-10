package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPage;

public class AlertTest extends BaseTest {

    @Test
    public void verifyAlerts() {

        AlertPage alert =
                new AlertPage(driver);

        alert.handleAlerts();
        alert.handleNewTab();
        alert.handlePopupWindows();
    }
}