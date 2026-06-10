package pages;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.WaitUtils;

public class ScrollingDropdownPage {

    WebDriver driver;

    public ScrollingDropdownPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "comboBox")
    WebElement comboBox;

    @FindBy(id = "dropdown")
    WebElement dropdown;

    @FindBy(className = "option")
    List<WebElement> options;

    public void selectItem(String itemName) {

        comboBox.click();

        WaitUtils.pause();

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        boolean found = false;

        while (!found) {

            List<WebElement> items =
                    driver.findElements(
                            By.className("option"));

            for (WebElement item : items) {

                if (item.getText()
                        .equalsIgnoreCase(itemName)) {

                    item.click();

                    found = true;

                    break;
                }
            }

            if (!found) {

                js.executeScript(
                        "arguments[0].scrollTop = arguments[0].scrollHeight",
                        dropdown);

                WaitUtils.pause();
            }
        }
    }

    public String getSelectedValue() {

        return comboBox.getAttribute("value");
    }
}