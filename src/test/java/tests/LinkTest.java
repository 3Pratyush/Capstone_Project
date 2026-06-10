package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LinkPage;

public class LinkTest extends BaseTest {

    @Test
    public void verifyAppleLink() {

        LinkPage link =
                new LinkPage(driver);

        link.visitAppleAndReturn();
    }
}