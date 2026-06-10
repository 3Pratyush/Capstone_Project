package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;
import utilities.WaitUtils;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="country")
    WebElement countryDropdown;

    @FindBy(id="colors")
    WebElement colorsDropdown;

    @FindBy(id="animals")
    WebElement animalsDropdown;

    public void selectCountry(String country) {

        new Select(countryDropdown)
                .selectByVisibleText(country);

        WaitUtils.pause();
    }

    public void selectColor(String color) {

        new Select(colorsDropdown)
                .selectByVisibleText(color);

        WaitUtils.pause();
    }

    public void selectAnimal(String animal) {

        new Select(animalsDropdown)
                .selectByVisibleText(animal);

        WaitUtils.pause();
    }
}