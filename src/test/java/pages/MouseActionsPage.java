package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class MouseActionsPage {

    WebDriver driver;
    Actions actions;

    public MouseActionsPage(WebDriver driver) {

        this.driver = driver;
        actions = new Actions(driver);

        PageFactory.initElements(driver, this);
    }

    // Double Click

    @FindBy(xpath = "//button[text()='Copy Text']")
    WebElement copyButton;

    @FindBy(id = "field2")
    WebElement field2;

    // Drag Drop

    @FindBy(id = "draggable")
    WebElement draggable;

    @FindBy(id = "droppable")
    WebElement droppable;

    // Hover

    @FindBy(xpath = "//button[text()='Point Me']")
    WebElement hoverButton;

    @FindBy(linkText = "Mobiles")
    WebElement mobilesLink;

    public void doubleClick() {

        actions.doubleClick(copyButton)
                .perform();

        WaitUtils.pause();
    }

    public String getCopiedText() {

        return field2.getAttribute("value");
    }

    public void dragDrop() {

        actions.clickAndHold(draggable)
               .moveToElement(droppable)
               .release()
               .build()
               .perform();

        WaitUtils.pause();
    }

    public void hover() {

        actions.moveToElement(hoverButton)
               .perform();

        WaitUtils.pause();

        mobilesLink.click();

        WaitUtils.pause();
    }
}