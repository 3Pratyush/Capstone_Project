package pages;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import utilities.WaitUtils;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Alerts

    @FindBy(id = "alertBtn")
    WebElement alertBtn;

    @FindBy(id = "confirmBtn")
    WebElement confirmBtn;

    @FindBy(id = "promptBtn")
    WebElement promptBtn;

    // New Tab

    @FindBy(xpath = "//button[text()='New Tab']")
    WebElement newTabButton;

    // Popup Windows

    @FindBy(id = "PopUp")
    WebElement popupButton;

    public void handleAlerts() {

        // Simple Alert

        alertBtn.click();

        driver.switchTo()
              .alert()
              .accept();

        WaitUtils.pause();

        // Confirmation Alert

        confirmBtn.click();

        driver.switchTo()
              .alert()
              .accept();

        WaitUtils.pause();

        // Prompt Alert

        promptBtn.click();

        Alert alert =
                driver.switchTo()
                      .alert();

        alert.sendKeys("Pratyush");

        alert.accept();

        WaitUtils.pause();
    }

    public void handleNewTab() {

        String parentWindow =
                driver.getWindowHandle();

        newTabButton.click();

        WaitUtils.pause();

        Set<String> windows =
                driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo()
                      .window(window);

                break;
            }
        }

        System.out.println(
                "New Tab URL : "
                + driver.getCurrentUrl());

        WaitUtils.pause();
        WaitUtils.pause();

        driver.close();

        driver.switchTo()
              .window(parentWindow);

        WaitUtils.pause();

        System.out.println(
                "Returned To Main Page");
    }

    public void handlePopupWindows() {

        String parentWindow =
                driver.getWindowHandle();

        popupButton.click();

        WaitUtils.pause();

        Set<String> windows =
                driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo()
                      .window(window);

                System.out.println(
                        "Title : "
                        + driver.getTitle());

                System.out.println(
                        "URL : "
                        + driver.getCurrentUrl());

                WaitUtils.pause();

                driver.close();
            }
        }

        driver.switchTo()
              .window(parentWindow);

        WaitUtils.pause();

        System.out.println(
                "Returned To Main Window");
    }
}