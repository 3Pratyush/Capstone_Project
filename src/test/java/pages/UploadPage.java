package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class UploadPage {

    WebDriver driver;

    public UploadPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // =========================
    // SINGLE FILE UPLOAD
    // =========================

    @FindBy(id = "singleFileInput")
    WebElement singleFileInput;

    @FindBy(xpath = "//button[text()='Upload Single File']")
    WebElement uploadSingleButton;

    @FindBy(id = "singleFileStatus")
    WebElement singleUploadStatus;

    // =========================
    // MULTIPLE FILE UPLOAD
    // =========================

    @FindBy(id = "multipleFilesInput")
    WebElement multipleFilesInput;

    @FindBy(xpath = "//button[text()='Upload Multiple Files']")
    WebElement uploadMultipleButton;

    @FindBy(id = "multipleFilesStatus")
    WebElement multipleUploadStatus;

    // =========================
    // SINGLE FILE UPLOAD METHOD
    // =========================

    public void uploadSingleFile(String filePath) {

        singleFileInput.sendKeys(filePath);

        WaitUtils.pause();

        uploadSingleButton.click();

        WaitUtils.pause();
    }

    // =========================
    // MULTIPLE FILE UPLOAD METHOD
    // =========================

    public void uploadMultipleFiles(
            String file1,
            String file2) {

        multipleFilesInput.sendKeys(
                file1 + "\n" + file2);

        WaitUtils.pause();

        uploadMultipleButton.click();

        WaitUtils.pause();
    }

    // =========================
    // FLEXIBLE MULTIPLE FILES
    // =========================

    public void uploadMultipleFiles(
            String... files) {

        StringBuilder paths =
                new StringBuilder();

        for (String file : files) {

            paths.append(file)
                 .append("\n");
        }

        multipleFilesInput.sendKeys(
                paths.toString());

        WaitUtils.pause();

        uploadMultipleButton.click();

        WaitUtils.pause();
    }

    // =========================
    // VERIFICATION METHODS
    // =========================

    public String getSingleUploadStatus() {

        return singleUploadStatus.getText();
    }

    public String getMultipleUploadStatus() {

        return multipleUploadStatus.getText();
    }
}