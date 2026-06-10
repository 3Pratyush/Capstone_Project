package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import utilities.WaitUtils;

public class PaginationTablePage {

    WebDriver driver;

    public PaginationTablePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@id='pagination']//a")
    List<WebElement> pages;

    public void selectRandomItemsFromAllPages() {

        for (int pageNo = 1; pageNo <= pages.size(); pageNo++) {

            driver.findElement(
                    By.xpath("//ul[@id='pagination']//a[text()='"
                            + pageNo + "']"))
                    .click();

            WaitUtils.pause();

            List<WebElement> rows =
                    driver.findElements(
                            By.xpath("//table[@id='productTable']/tbody/tr"));

            List<Integer> randomRows =
                    new ArrayList<>();

            for (int i = 1; i <= rows.size(); i++) {

                randomRows.add(i);
            }

            Collections.shuffle(randomRows);

            for (int i = 0; i < 2; i++) {

                int rowNo = randomRows.get(i);

                String productName =
                        driver.findElement(
                                By.xpath(
                                        "//table[@id='productTable']/tbody/tr["
                                                + rowNo
                                                + "]/td[2]"))
                                .getText();

                WebElement checkbox =
                        driver.findElement(
                                By.xpath(
                                        "//table[@id='productTable']/tbody/tr["
                                                + rowNo
                                                + "]/td[4]/input"));

                checkbox.click();

                System.out.println(
                        "Page "
                                + pageNo
                                + " -> Selected : "
                                + productName);
            }

            WaitUtils.pause();
        }
    }
}