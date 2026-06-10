package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class ShadowDOMPage {

    WebDriver driver;

    public ShadowDOMPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void handleShadowDom(String filePath) {

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        // =========================
        // MAIN SHADOW ROOT
        // =========================

        SearchContext shadowRoot =
                driver.findElement(
                        By.cssSelector("#shadow_host"))
                        .getShadowRoot();

        // Mobiles

        WebElement mobiles =
                shadowRoot.findElement(
                        By.cssSelector(".info"));

        System.out.println(
                "Shadow Text : "
                        + mobiles.getText());

        // =========================
        // NESTED SHADOW ROOT
        // =========================

        WebElement nestedHost =
                shadowRoot.findElement(
                        By.cssSelector("#nested_shadow_host"));

        SearchContext nestedShadow =
                nestedHost.getShadowRoot();

        WebElement laptops =
                nestedShadow.findElement(
                        By.cssSelector("#nested_shadow_content"));

        System.out.println(
                "Nested Shadow Text : "
                        + laptops.getText());

        // =========================
        // BLOG LINK
        // =========================

     WebElement blogLink =
             shadowRoot.findElement(
                     By.linkText("Blog"));

     String blogUrl =
             blogLink.getAttribute("href");

     driver.navigate().to(blogUrl);

     for (int i = 0; i < 5; i++) {

         js.executeScript(
                 "window.scrollBy(0,800)");

         WaitUtils.pause();
     }

     driver.navigate().back();

     WaitUtils.pause();

        // =========================
        // RELOCATE SHADOW ROOT
        // =========================

        shadowRoot =
                driver.findElement(
                        By.cssSelector("#shadow_host"))
                        .getShadowRoot();

        
     // =========================
     // TEXT BOX
     // =========================

     WebElement textBox =
             shadowRoot.findElement(
                     By.cssSelector("input[type='text']"));

     textBox.sendKeys(
             "Shadow DOM Automation");

     WaitUtils.pause();

     System.out.println(
             "Text Entered Successfully");

     // =========================
     // CHECKBOX
     // =========================

     WebElement checkbox =
             shadowRoot.findElement(
                     By.cssSelector("input[type='checkbox']"));

     if (!checkbox.isSelected()) {

         checkbox.click();
     }

     WaitUtils.pause();

     System.out.println(
             "Checkbox Selected");
     // =========================
     // FILE UPLOAD
     // =========================

     WebElement fileUpload =
             shadowRoot.findElement(
                     By.cssSelector("input[type='file']"));

     fileUpload.sendKeys(filePath);

     WaitUtils.pause();

     System.out.println(
             "File Uploaded Successfully");

        // =========================
        // YOUTUBE LINK
        // =========================

        WebElement youtube =
                driver.findElement(
                        By.linkText("Youtube"));

        youtube.click();

        for (int i = 0; i < 5; i++) {

            js.executeScript(
                    "window.scrollBy(0,800)");

            WaitUtils.pause();
        }

        driver.navigate().back();

        WaitUtils.pause();

        System.out.println(
                "Returned From YouTube");
    }
}