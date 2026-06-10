package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.UploadPage;

public class UploadTest extends BaseTest {

    @Test
    public void verifyUpload() {

        UploadPage upload =
                new UploadPage(driver);

        String singleFile =
                System.getProperty("user.dir")
                + "\\uploads\\sample.pdf";

        upload.uploadSingleFile(singleFile);

        String file1 =
                System.getProperty("user.dir")
                + "\\uploads\\sample1.pdf";

        String file2 =
                System.getProperty("user.dir")
                + "\\uploads\\sample2.pdf";

        upload.uploadMultipleFiles(
                file1,
                file2);
    }
}