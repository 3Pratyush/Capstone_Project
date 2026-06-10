package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class WikipediaPage {

    WebDriver driver;

    public WikipediaPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchWikipedia(String searchText) {

        // Search Box

        WebElement searchBox =
                driver.findElement(
                        By.cssSelector(
                                "input.wikipedia-search-input"));

        searchBox.clear();
        searchBox.sendKeys(searchText);

        WaitUtils.pause();

        // Search Button

        WebElement searchButton =
                driver.findElement(
                        By.cssSelector(
                                "input.wikipedia-search-button"));

        searchButton.click();

        // Wait for results

        WaitUtils.pause();
        WaitUtils.pause();
        WaitUtils.pause();

        // Selenium (software) link

        WebElement seleniumSoftware =
                driver.findElement(
                        By.linkText(
                                "Selenium (software)"));

        System.out.println(
                "Opening : "
                + seleniumSoftware.getText());

        String parentWindow =
                driver.getWindowHandle();

        seleniumSoftware.click();

        WaitUtils.pause();

        // Switch to Wikipedia tab

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
                "Page Title : "
                + driver.getTitle());

        // Scroll for 8 seconds

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        for (int i = 0; i < 5; i++) {

            js.executeScript(
                    "window.scrollBy(0,700)");

            WaitUtils.pause();
        }

        // Close Wikipedia tab

        driver.close();

        // Return to Automation page

        driver.switchTo()
              .window(parentWindow);

        WaitUtils.pause();

        System.out.println(
                "Returned To Main Page");
    }
}