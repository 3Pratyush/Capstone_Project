package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class LinkPage {

    WebDriver driver;

    public LinkPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "apple")
    WebElement appleLink;

    public void visitAppleAndReturn() {

        appleLink.click();

        WaitUtils.pause();

        for (int i = 0; i < 10; i++) {

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "window.scrollBy(0,800)");

            WaitUtils.pause();
        }

        driver.navigate().back();

        WaitUtils.pause();
    }
}