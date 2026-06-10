package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DatePickerPage;

public class DatePickerTest extends BaseTest {

    @Test
    public void verifyDatePicker() {

        DatePickerPage date =
                new DatePickerPage(driver);

        date.selectDates();
    }
}