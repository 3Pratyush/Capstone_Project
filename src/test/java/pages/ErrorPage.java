package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class ErrorPage {

    WebDriver driver;

    public ErrorPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Errorcode 404")
    WebElement error404Link;

    public void visit404PageAndReturn() {

        // Open 404 page

        error404Link.click();

        // Stay on page for 2 seconds

        WaitUtils.pause();
        WaitUtils.pause();

        // Return to main page

        driver.navigate().back();

        WaitUtils.pause();
    }
}