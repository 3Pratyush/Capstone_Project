package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ShadowDOMPage;

public class ShadowDOMTest extends BaseTest {

    @Test
    public void verifyShadowDOM() {

        ShadowDOMPage shadow =
                new ShadowDOMPage(driver);

        String file =
                System.getProperty("user.dir")
                + "\\uploads\\sample.pdf";

        shadow.handleShadowDom(file);
    }
}