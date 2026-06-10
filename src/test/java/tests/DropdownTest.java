package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {

    @Test
    public void verifyDropdowns() {

        DropdownPage dropdown =
                new DropdownPage(driver);

        dropdown.selectCountry("India");
        dropdown.selectColor("Red");
        dropdown.selectAnimal("Dog");
    }
}