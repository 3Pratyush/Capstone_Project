package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FormPage;

public class FormTest extends BaseTest {

    @Test
    public void verifyForm() {

        FormPage form = new FormPage(driver);

        form.fillForm(
                "Pratyush",
                "pratyush@test.com",
                "9876543210",
                "Bhubaneswar");

        form.selectGender();
        form.selectDays();
    }
}