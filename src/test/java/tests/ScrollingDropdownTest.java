package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ScrollingDropdownPage;

public class ScrollingDropdownTest extends BaseTest {

    @Test
    public void verifyScrollingDropdown() {

        ScrollingDropdownPage dropdown =
                new ScrollingDropdownPage(driver);

        dropdown.selectItem("Item 90");
    }
}