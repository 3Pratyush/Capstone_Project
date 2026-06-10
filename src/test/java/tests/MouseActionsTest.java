package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.MouseActionsPage;

public class MouseActionsTest extends BaseTest {

    @Test
    public void verifyMouseActions() {

        MouseActionsPage mouse =
                new MouseActionsPage(driver);

        mouse.doubleClick();
        mouse.dragDrop();
        mouse.hover();
    }
}