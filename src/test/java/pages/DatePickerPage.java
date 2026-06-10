package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import utilities.WaitUtils;

public class DatePickerPage {

	WebDriver driver;

    public DatePickerPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(id="datepicker")
    WebElement datePicker1;

    @FindBy(id="txtDate")
    WebElement datePicker2;

    @FindBy(id="start-date")
    WebElement startDate;

    @FindBy(id="end-date")
    WebElement endDate;


    public void selectDates() {

        // Date Picker 1

        datePicker1.clear();
        datePicker1.sendKeys("06/06/2026");

        WaitUtils.pause();

        // Date Picker 2

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].value='09/06/2026';",
                datePicker2);

        WaitUtils.pause();

        // Date Picker 3 Start Date

        js.executeScript(
                "arguments[0].value='2026-06-01';",
                startDate);

        WaitUtils.pause();

        // Date Picker 3 End Date

        js.executeScript(
                "arguments[0].value='2026-06-15';",
                endDate);

        WaitUtils.pause();
    }
}