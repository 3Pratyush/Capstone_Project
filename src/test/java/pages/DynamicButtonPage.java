package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class DynamicButtonPage {

    WebDriver driver;

    public DynamicButtonPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyDynamicButton() {

        WebElement button =
                driver.findElement(
                        By.xpath("//button[@name='start']"));

        System.out.println(
                "Initial Text : "
                + button.getText());

        System.out.println(
                "Initial Name : "
                + button.getAttribute("name"));

        WaitUtils.pause();

        // START -> STOP

        button.click();

        WaitUtils.pause();

        System.out.println(
                "After Click Text : "
                + button.getText());

        System.out.println(
                "After Click Name : "
                + button.getAttribute("name"));

        WaitUtils.pause();

        // STOP -> START

        button.click();

        WaitUtils.pause();

        System.out.println(
                "Final Text : "
                + button.getText());

        System.out.println(
                "Final Name : "
                + button.getAttribute("name"));
    }
}