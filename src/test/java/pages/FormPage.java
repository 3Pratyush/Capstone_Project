package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitUtils;

public class FormPage {

    WebDriver driver;

    public FormPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="name")
    WebElement txtName;

    @FindBy(id="email")
    WebElement txtEmail;

    @FindBy(id="phone")
    WebElement txtPhone;

    @FindBy(id="textarea")
    WebElement txtAddress;

    @FindBy(id="male")
    WebElement maleRadio;

    @FindBy(id="sunday")
    WebElement sunday;

    @FindBy(id="monday")
    WebElement monday;

    public void fillForm(
            String name,
            String email,
            String phone,
            String address) {

        txtName.sendKeys(name);
        WaitUtils.pause();

        txtEmail.sendKeys(email);
        WaitUtils.pause();

        txtPhone.sendKeys(phone);
        WaitUtils.pause();

        txtAddress.sendKeys(address);
        WaitUtils.pause();
    }

    public void selectGender() {

        maleRadio.click();

        WaitUtils.pause();
    }

    public void selectDays() {

        sunday.click();

        WaitUtils.pause();

        monday.click();

        WaitUtils.pause();
    }
}