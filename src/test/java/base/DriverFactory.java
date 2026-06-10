package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class DriverFactory {

public static WebDriver initializeDriver() {

    String browser =
            ConfigReader.getProperty("browser");

    WebDriver driver;

    if(browser.equalsIgnoreCase("edge")) {

        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();
    }

    else {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }

    return driver;
}

}
