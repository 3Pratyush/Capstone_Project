package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class SliderPage {

    WebDriver driver;
    Actions actions;

    public SliderPage(WebDriver driver) {

        this.driver = driver;
        actions = new Actions(driver);

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='slider-range']/span[1]")
    WebElement leftSlider;

    @FindBy(xpath = "//*[@id='slider-range']/span[2]")
    WebElement rightSlider;

    public void moveSlider() {

        actions.clickAndHold(leftSlider)
               .moveByOffset(50, 0)
               .release()
               .perform();

        WaitUtils.pause();

        actions.clickAndHold(rightSlider)
               .moveByOffset(-20, 0)
               .release()
               .perform();

        WaitUtils.pause();
    }
}