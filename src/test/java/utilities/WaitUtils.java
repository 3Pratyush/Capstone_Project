package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    public static void waitForElement(
            WebDriver driver,
            WebElement element) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }
        public static void pause() {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();
    }
   }
  }
