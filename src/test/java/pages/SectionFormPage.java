
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class SectionFormPage {

    WebDriver driver;

    public SectionFormPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "input1")
    WebElement input1;

    @FindBy(id = "btn1")
    WebElement btn1;

    @FindBy(id = "input2")
    WebElement input2;

    @FindBy(id = "btn2")
    WebElement btn2;

    @FindBy(id = "input3")
    WebElement input3;

    @FindBy(id = "btn3")
    WebElement btn3;

    public void fillAllSections(
            String data1,
            String data2,
            String data3) {

        input1.sendKeys(data1);

        WaitUtils.pause();

        btn1.click();

        WaitUtils.pause();

        input2.sendKeys(data2);

        WaitUtils.pause();

        btn2.click();

        WaitUtils.pause();

        input3.sendKeys(data3);

        WaitUtils.pause();

        btn3.click();

        WaitUtils.pause();
    }
}