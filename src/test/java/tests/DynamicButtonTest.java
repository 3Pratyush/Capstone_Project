package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DynamicButtonPage;

public class DynamicButtonTest extends BaseTest {

    @Test
    public void verifyDynamicButton() {

        DynamicButtonPage button =
                new DynamicButtonPage(driver);

        button.verifyDynamicButton();
    }
}